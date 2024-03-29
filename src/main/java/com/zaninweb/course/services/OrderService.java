package com.zaninweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zaninweb.course.entities.Order;
import com.zaninweb.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
<<<<<<< HEAD
	
	public List<Order> findAll() {
=======

	public List<Order> findAll() {

>>>>>>> 0e476dc0fb346a255d03dbc2d9f06d1f58f7b235
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
<<<<<<< HEAD
}
=======

}
>>>>>>> 0e476dc0fb346a255d03dbc2d9f06d1f58f7b235
