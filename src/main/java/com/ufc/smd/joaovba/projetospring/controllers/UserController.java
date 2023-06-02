package com.ufc.smd.joaovba.projetospring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufc.smd.joaovba.projetospring.entities.User;
import com.ufc.smd.joaovba.projetospring.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public List<User> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/{id}")
	public User findAll(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping
	public User insert(@RequestBody User user) {
		return repository.save(user);
	}
}