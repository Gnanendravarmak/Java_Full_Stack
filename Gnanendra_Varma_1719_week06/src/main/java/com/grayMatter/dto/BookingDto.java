package com.grayMatter.dto;

import java.time.LocalDate;

import com.grayMatter.entity.Event;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Builder;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BookingDto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long BookId;

    private LocalDate bookingDate;
    private int bookedSeats;

}
