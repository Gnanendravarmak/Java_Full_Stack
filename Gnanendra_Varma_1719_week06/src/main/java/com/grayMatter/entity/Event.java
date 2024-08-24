package com.grayMatter.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PreRemove;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Event {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	 private String name;
	 private String location;
	 private LocalDate date;
	 private LocalTime startTime;
	 private LocalTime endTime;
	 private int capacity;
	 
	 @OneToMany(mappedBy = "bookEvent", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
	 private List<Booking> booking;
	 
	 
	 @PreRemove
	    private void preRemove() {
	        for (Booking b : booking) {
	            b.setBookEvent(null); // Disassociate bookings
	        }
	    }
	 
	 @Override
	    public String toString() {
	        return "Event{id=" + id +
	               ", name='" + name + '\'' +
	               ", location='" + location + '\'' +
	               ", date=" + date +
	               ", startTime=" + startTime +
	               ", endTime=" + endTime +
	               ", capacity=" + capacity + 
	               ", bookingsCount=" + (booking != null ? booking.size() : 0) + '}';
	    }

	 
	
	
}
