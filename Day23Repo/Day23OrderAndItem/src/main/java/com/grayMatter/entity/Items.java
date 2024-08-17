package com.grayMatter.entity;


import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Items {
	
	private String itemName;
	@Id
	private int itemId;
	@ManyToMany(mappedBy = "itemList")
	@JsonIgnore
	private List<Orders> orderList;

}
