package com.grayMatter.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grayMatter.entity.Product;
import com.grayMatter.entity.Role;
import com.grayMatter.entity.Users;

import lombok.RequiredArgsConstructor;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{

	Optional<Users> findByRole(String admin);

	Optional<Users> findByUserEmail(String userEmail);




}
