package com.grayMatter.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grayMatter.entity.Event;


@Repository
public interface EventRepositoty extends JpaRepository<Event, Long> {

	List<Event> findByLocation(String location);

	List<Event> findByDate(LocalDate date);

	int findByCapacity(int id);

}
