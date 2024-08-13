package com.grayMatter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grayMatter.entity.Person;


@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
