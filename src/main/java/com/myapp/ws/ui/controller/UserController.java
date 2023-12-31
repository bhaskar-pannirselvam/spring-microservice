package com.myapp.ws.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
	
	@GetMapping
	public String getUsers(@RequestParam(value="page",defaultValue = "1") int page, 
			@RequestParam(value="limit", defaultValue= "50") int limit) {
		return "Get all users page="+page+" limit="+limit;
	}

	@GetMapping(path="/{userId}")
	public String getUser(@PathVariable long userId) {
		return "Get user is called "+userId;
	}
	
	@PostMapping
	public String createUser() {
		return "User created";
	}
	
	@PutMapping
	public String updateUser() {
		return "User Updated";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "user Deleted";
	}
}
