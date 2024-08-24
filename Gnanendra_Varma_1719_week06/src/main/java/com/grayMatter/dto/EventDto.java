package com.grayMatter.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EventDto {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	 @NotBlank(message = "Name is mandatory")
	 @Size(max = 100, message = "Name should not exceed 100 characters")
	 @Size(min = 3, message = "Name shold be more than 3 char")
	 private String name;

	 @NotBlank(message = "Location is mandatory")
	 private String location;

	 @NotNull(message = "Date is mandatory")
	 @DateTimeFormat(pattern = "YYYY-MM-DD")
	 private LocalDate date;

	 @NotNull(message = "Start time is mandatory")
	 private LocalTime startTime;

	 @NotNull(message = "End time is mandatory")
	 private LocalTime endTime;

	 @Positive(message = "Capacity must be a positive number")
	 private int capacity;
	 
	 
	

}
