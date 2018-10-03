package com.skillenza.socgen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skillenza.socgen.domain.User;
import com.skillenza.socgen.service.UserService;

@RestController
@RequestMapping(value = "/socgen")
public class UserController {
	/**
	 * {@link UserService} instance
	 */
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> fetchUsers() {
		return userService.getAllUsers();
	}

}
