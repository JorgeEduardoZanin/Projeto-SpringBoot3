package com.zaninweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zaninweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}