package com.grayMatter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Post {
	private int id;
	private String title;
	private String content;
	private String author;
	
}
