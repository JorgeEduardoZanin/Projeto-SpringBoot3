package com.zaninweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zaninweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}