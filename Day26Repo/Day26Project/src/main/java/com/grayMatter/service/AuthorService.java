package com.grayMatter.service;

import org.springframework.stereotype.Service;

import com.grayMatter.entity.Author;
import com.grayMatter.entity.Book;
import com.grayMatter.repository.AuthorRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthorService {
	
	
	private final AuthorRepository authorRepository;
	
	@Transactional
	 public  void saveAuthorWithBooks() {
		 Author author = new Author("SSR");
		 Book book1 = new Book("RRR");
		 Book book2 = new Book("BB2");
		 author.addBook(book1);
		 author.addBook(book2);
		 authorRepository.save(author);
	 }
	 @Transactional
	 public void removeAuthor(Long authorId) {
		 authorRepository.deleteById(authorId);
	 }

}
