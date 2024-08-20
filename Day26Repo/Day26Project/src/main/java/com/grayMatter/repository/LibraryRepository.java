package com.grayMatter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grayMatter.entity.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Long>{

}
