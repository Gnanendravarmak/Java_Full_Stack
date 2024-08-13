package com.grayMatter.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.grayMatter.dto.PersonDao;
import com.grayMatter.entity.Person;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonInterfaceImpl {

	
	private final PersonDao personDao;
	
	@Override
	public List<Person> getAllData() {
		return personDao.getAllPerson();
	}

	public Person addPerson(Person person) {
		List<Person> p = getAllData();
		
		for(Person pp: p) {
			
			if(!pp.getAadharnum().equals(person.getAadharnum())) {
				
				Person p1 = new Person();
				
				p1.setAge(person.getAge());
				
				return personDao.addPrson(p1);
			}
			
		}
		// TODO Auto-generated method stub
		return personDao.addPrson(person);
		
	}

	public Person updatePerson(Person person, Long id) {
		Optional<Person> p = personDao.getById(id);
		if(p.isEmpty()) {
			return null;
		}
		return personDao.addPrson(person);
	}

	public void delete(Person person) {
		// TODO Auto-generated method stub
		 personDao.delete(person);
	}

	public Optional<Person> getById(Long id) {
		// TODO Auto-generated method stub
		return personDao.getById(id);
	}

	

	

}
