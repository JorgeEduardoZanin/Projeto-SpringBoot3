package com.zaninweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zaninweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
