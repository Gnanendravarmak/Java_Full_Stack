package com.grayMatter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grayMatter.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> { 

} 
