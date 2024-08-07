package com.grayMatter.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Author {
	@Value("${Author.authorName}")
	private String authorName;
	@Value("${Author.authorId}")
	private String authorId;
}
