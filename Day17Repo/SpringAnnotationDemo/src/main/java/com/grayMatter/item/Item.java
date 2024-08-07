package com.grayMatter.item;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Component
public class Item {
	
	private int itemId;
	private String itemName;
	private int cpu;

}
