package com.grayMatter.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grayMatter.entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
