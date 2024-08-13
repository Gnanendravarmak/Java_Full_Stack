package com.grayMatter.dto;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.grayMatter.entity.Person;
import com.grayMatter.repository.PersonRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class PersonDao {
	
	private final PersonRepository personRepository;
	
	
	public List<Person> getAllPerson() {
		return personRepository.findAll();
		
		
	}


	public Person addPrson(Person person) {
		return personRepository.save(person);
	}


	public void delete(Person person) {
		// TODO Auto-generated method stub
		personRepository.delete(person);
	}


	public Optional<Person> getById(Long id) {
		// TODO Auto-generated method stub
		return personRepository.findById(id);
	}



}
