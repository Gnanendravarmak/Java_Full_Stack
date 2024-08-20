package com.grayMatter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grayMatter.entity.Book;


@Repository
public interface BokRepository extends JpaRepository<Book, Long>{

}
