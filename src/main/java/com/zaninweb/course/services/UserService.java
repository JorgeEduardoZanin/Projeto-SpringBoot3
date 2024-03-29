package com.zaninweb.course.services;

<<<<<<< HEAD

=======
>>>>>>> 0e476dc0fb346a255d03dbc2d9f06d1f58f7b235
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zaninweb.course.entities.User;
import com.zaninweb.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
<<<<<<< HEAD
	
	public List<User> findAll() {
=======

	public List<User> findAll() {

>>>>>>> 0e476dc0fb346a255d03dbc2d9f06d1f58f7b235
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
<<<<<<< HEAD
	
	
}
=======

}
>>>>>>> 0e476dc0fb346a255d03dbc2d9f06d1f58f7b235
