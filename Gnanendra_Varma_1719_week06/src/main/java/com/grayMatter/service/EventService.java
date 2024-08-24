package com.grayMatter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.grayMatter.config.TempData;
import com.grayMatter.dto.EventDto;
import com.grayMatter.entity.Booking;
import com.grayMatter.entity.Event;
import com.grayMatter.repository.BookingRepository;
import com.grayMatter.repository.EventRepositoty;

import java.time.LocalDate;
import java.util.*;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventService {
	
	private final EventRepositoty eventRepositoty;
	
	private final BookingRepository bookingRepository;
	
//	private final Booking bookDto;
	
//	@Autowired
//	private TempData dto;
	
	private final int MAX_CAPACITY = 100;

	public ResponseEntity<?> addEvent(EventDto eventDto) {
		
		Booking booking = bookingRepository.findByBookingDate(eventDto.getDate());
		
		int val = 0;
		
		System.out.println(booking);
		
		if(booking != null) {
			val = booking.getBookedSeats();
		}
		
		
		if(eventDto.getCapacity() > (MAX_CAPACITY - val) ) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Can't Book Event Now");
		}
		
		Event event = Event.builder().id(eventDto.getId())
				.name(eventDto.getName())
				.location(eventDto.getLocation())
				.capacity(eventDto.getCapacity())
				.date(eventDto.getDate())
				.startTime(eventDto.getStartTime())
				.endTime(eventDto.getEndTime()).build();
		
		Event data = eventRepositoty.save(event);
		
		

		
		if(booking == null) {
			
			Booking book = Booking.builder()
					.bookEvent(data)
					.bookedSeats(eventDto.getCapacity())
					.bookingDate(eventDto.getDate()).build();
			bookingRepository.save(book);
			
		} else {
			booking.setBookedSeats(val + eventDto.getCapacity());
			bookingRepository.save(booking);
		}
		
		
		
		
		
		
//		booking.setBookedSeats(booking.getBookedSeats() + eventDto.getCapacity());
		
		return ResponseEntity.status(HttpStatus.CREATED).body("Event Booked Successfully");
	}

	public ResponseEntity<?> getAllEvents() {
		List<Event> data = eventRepositoty.findAll();
		
		System.out.println(data.isEmpty());
		
		 if (data.isEmpty()) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND)
	                                 .body("No Events Found!!");
	        }
		 
		 
		 List<EventDto> eventDtos = new ArrayList<>();
		    for (Event event : data) {
		        EventDto dto = convertToDto(event);
		        eventDtos.add(dto);
		    }
		
		return ResponseEntity.status(HttpStatus.OK).body("Displaying All Events: "+eventDtos);
	}
	
	private EventDto convertToDto(Event event) {
	    return EventDto.builder()
	                   .id(event.getId())
	                   .name(event.getName())
	                   .location(event.getLocation())
	                   .date(event.getDate())
	                   .startTime(event.getStartTime())
	                   .endTime(event.getEndTime())
	                   .capacity(event.getCapacity())
	                   .build();
	}

	public ResponseEntity<?> getEvents(long id) {
		Optional<Event> data = eventRepositoty.findById(id);
		
		if(!data.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No Event Found!!");
		}
		
		
		return ResponseEntity.status(HttpStatus.OK).body("Displaying Event: "+convertToDto(data.get()));
	}

	public ResponseEntity<?> getEvents(EventDto eventDto, long id) {
		
		Optional<Event> data = eventRepositoty.findById(id);

		
		if(!data.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No Event Found!!, Can't Update data");
		}
		
		Booking booking = bookingRepository.findByBookingDate(eventDto.getDate());
		
		if(MAX_CAPACITY < (booking.getBookedSeats() + eventDto.getCapacity())) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("InSufficent Space cant't add the seats!!");
		}

		booking.setBookedSeats(booking.getBookedSeats() + eventDto.getCapacity() );

		
//		dto.setBooked(dto.getBooked()-eventDto.getCapacity());
		
		
		
		data.get().setName(eventDto.getName());
		data.get().setLocation(eventDto.getLocation());
		data.get().setCapacity(eventDto.getCapacity());
		data.get().setDate(eventDto.getDate());
		data.get().setStartTime(eventDto.getStartTime());
		data.get().setEndTime(eventDto.getEndTime());
		
//		Event event = Event.builder()
//				.name(eve.getName())
//				.location(eve.getLocation())
//				.capacity(eve.getCapacity())
//				.date(eve.getDate())
//				.startTime(eve.getStartTime())
//				.endTime(eve.getEndTime()).build();
		
		bookingRepository.save(booking);
		
		Event dataVal = eventRepositoty.save(data.get());
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body("Data Updated Successfully"+convertToDto(dataVal));
	}

	public ResponseEntity<?> delEvent(long id) {
		
		Optional<Event> data = eventRepositoty.findById(id);
		
		if(!data.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No Event Found!!, Can't delete Event");
		}
		
		Booking booking = bookingRepository.findByBookingDate(data.get().getDate());

		
//		dto.setBooked(dto.getBooked()+data.get().getCapacity());
		
		if(booking != null) {
			booking.setBookedSeats(booking.getBookedSeats() - data.get().getCapacity() );
			
			bookingRepository.save(booking);
		}
		
		
		
		
		eventRepositoty.delete(data.get());
		
		return ResponseEntity.status(HttpStatus.OK).body("Event Deleted");
	}

	public ResponseEntity<?> getLocation(String location) {
		List<Event> event = eventRepositoty.findByLocation(location);
		
		if(event.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No Event Found in,"+ location +" Location");
		}
		
		List<EventDto> eventDtos = new ArrayList<>();
	    for (Event data : event) {
	        EventDto dto = convertToDto(data);
	        eventDtos.add(dto);
	    }
		
		return ResponseEntity.status(HttpStatus.OK).body("All Events in"+eventDtos);

	}

	public ResponseEntity<?> getByDate(LocalDate date) {
		
		List<Event> event = eventRepositoty.findByDate(date);
		
		System.out.println(event.isEmpty());
		
		if(event.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No Event Found on,"+date+" Date");
		}
		
		List<EventDto> eventDtos = new ArrayList<>();
	    for (Event data : event) {
	        EventDto dto = convertToDto(data);
	        eventDtos.add(dto);
	    }
		
		return ResponseEntity.status(HttpStatus.OK).body("All Events on Date: ,"+date+" : "+eventDtos);
	}

	public ResponseEntity<?> getByAvailability(LocalDate date, int id) {
		
		Booking book = bookingRepository.findByBookingDate(date);
		
		if(book == null && (MAX_CAPACITY > id) ) {
			return ResponseEntity.status(HttpStatus.OK).body("You can Book Your Events!!");
		}
		
		if((MAX_CAPACITY < id)) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("InSufficent Space!!!");
		}
		
		int rem = 0;
		
		if(book != null) {
			rem = (MAX_CAPACITY - book.getBookedSeats()) - id;
		}
				
		
		if(rem <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Events Full, Cant Book Now!!!");
		}
		
		return ResponseEntity.status(HttpStatus.OK).body("Capacity Left: "+rem+" you can book Event");
	}

	

}
