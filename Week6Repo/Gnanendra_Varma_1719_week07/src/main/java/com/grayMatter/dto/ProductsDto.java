package com.grayMatter.dto;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductsDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	
	@NotBlank(message = "Product name cannot be blank")
	@Size(min = 3, max = 50, message = "Product name must be between 3 and 50 characters")
	private String productName;

	@Size(max = 200, message = "Product description can have at most 200 characters")
	private String productDescription;

	@NotNull(message = "Product price is required")
	private String productPrice;

	@Positive(message = "Stock quantity must be a positive number")
	private String productStockQuantity;

	@NotBlank(message = "Product category cannot be blank")
	private String productCategory;

	@Size(max = 100, message = "Product tags can have at most 100 characters")
	private String productTags;

	@NotBlank(message = "Product image URL cannot be blank")
	private String productImageUrl;

	@Positive(message = "Stock quantity must be a positive number")
	private String productRating;
	
	
	@CreatedDate
	@CreationTimestamp
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate productCreatedDate;

}
