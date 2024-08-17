package com.grayMatter.entity;

import java.sql.Date;
import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Orders {
	
	
	@Id
	private int orderId;
	private Date OrderDate;
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn(name = "itemId"), inverseJoinColumns = @JoinColumn(name="orderId"))
	private List<Items> itemList;

}
