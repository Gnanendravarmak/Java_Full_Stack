package com.grayMatter.service;

import org.springframework.stereotype.Service;

import com.grayMatter.entity.BookName;
import com.grayMatter.entity.Library;
import com.grayMatter.repository.LibraryRepository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LibraryService {
	
	
	private final LibraryRepository libraryRepository; 

	 


    private final EntityManager entityManager; 
    
    
    public void add() {
    	BookName bb = new BookName("DSA");
    	Library ll = new Library("CSE");
    	ll.addBook(bb);
    	libraryRepository.save(ll);
    }

 

    @Transactional

    public void detachLibrary(Long libraryId) { 

        Library library = libraryRepository.findById(libraryId).orElseThrow(() -> new RuntimeException("Library not found")); 

 

        // Detach the Library entity (this will also detach all associated Books) 

        entityManager.detach(library); 

 

        // Now the Library and its Books are no longer managed by the persistence context 

    } 

}
