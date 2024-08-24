package com.grayMatter.config;

import org.springframework.stereotype.Component;

import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class TempData {
	
	 private int booked = 100;
 
}
