package com.grayMatter.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grayMatter.entity.Person;
import com.grayMatter.service.PersonServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class PersonController {
	
	private final PersonServiceImpl personServiceImpl;
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAllPerson() {
		List<Person> person = personServiceImpl.getAllData();
		
		if(person.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body("DataBase is Empty");
		}
		return ResponseEntity.status(HttpStatus.OK).body(person);
	}
	
	@PostMapping("/addperson")
	public ResponseEntity<?> addPerson(@RequestBody Person person) {
		Person p=  personServiceImpl.addPerson(person);
		
		if(p == null)
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body("DataBase is Empty");
		
		return ResponseEntity.status(HttpStatus.OK).body(p);
	}
	
	
	@DeleteMapping("/delete")
	public void deletePerson(@RequestBody Person person) {
		
//		Person p = personServiceImpl.fin
		 personServiceImpl.delete(person);
	}
	
	@GetMapping("/get/{id}")
	public Optional<Person> getPerson(@PathVariable Long id) {
		return personServiceImpl.getById(id);
	}
	
	
	@PutMapping("up/{id}")
	public Person update(@RequestBody Person person, @PathVariable Long id) {
		return personServiceImpl.updatePerson(person, id);
	}
	

}
