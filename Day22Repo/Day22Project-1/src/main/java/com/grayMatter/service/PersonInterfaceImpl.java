package com.grayMatter.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.grayMatter.entity.Person;


@Service
public interface PersonInterfaceImpl {
	
	List<Person> getAllData();

}
