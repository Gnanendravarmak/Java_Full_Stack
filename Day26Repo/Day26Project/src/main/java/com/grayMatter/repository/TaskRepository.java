package com.grayMatter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grayMatter.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> { 

} 
