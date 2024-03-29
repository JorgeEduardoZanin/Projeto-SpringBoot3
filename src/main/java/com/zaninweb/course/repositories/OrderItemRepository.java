package com.zaninweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zaninweb.course.entities.OrderItem;
import com.zaninweb.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}