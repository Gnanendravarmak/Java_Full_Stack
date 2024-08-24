package com.grayMatter.controller;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grayMatter.dto.EventDto;
import com.grayMatter.entity.Event;
import com.grayMatter.service.EventService;

import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;

@RequestMapping("/api/v1")
@RestController
@RequiredArgsConstructor
public class EventController {
	
	
	private final EventService eventService;
	
	
	
	@PostMapping("/addEvent")
	public ResponseEntity<?> addEvent(@RequestBody EventDto eventDto) {
		return eventService.addEvent(eventDto);
	}
	
	@GetMapping("/getAllEvents")
	public ResponseEntity<?> getAllEvents() {
		return eventService.getAllEvents();
	}
	
	
	@GetMapping("/getEventBy/{id}")
	public ResponseEntity<?> getEvent(@PathVariable int id) {
		return eventService.getEvents(id);
	}
	
	@PutMapping("/updateEvent")
	public ResponseEntity<?> updateEvent(@RequestBody EventDto eventDto ,@RequestParam int id) {
		return eventService.getEvents(eventDto, id);
	}
	
	@DeleteMapping("/delEvent/{id}")
	public ResponseEntity<?> delEvent(@PathVariable int id) {
		return eventService.delEvent(id);
	}
	
	@GetMapping("/location/{location}")
	public ResponseEntity<?> getLocation(@PathVariable String location) {
		return eventService.getLocation(location);
	}
	
	@GetMapping("/date/{date}")
	public ResponseEntity<?> getByDate(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
	    return eventService.getByDate(date);
	}

	
	
	@GetMapping("/events/{date}/{id}")
	public ResponseEntity<?> getByAvailability(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,@PathVariable int id ) {
		return eventService.getByAvailability(date, id);
	}
	

}
