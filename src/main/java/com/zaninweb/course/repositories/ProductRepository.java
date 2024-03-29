package com.zaninweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zaninweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}