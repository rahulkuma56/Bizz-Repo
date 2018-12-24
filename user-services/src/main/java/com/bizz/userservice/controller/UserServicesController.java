package com.bizz.userservice.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bizz.userservice.model.User;
import com.bizz.userservice.model.Users;
import com.bizz.userservice.repository.UserRepository;

@RestController
@RequestMapping("/rest/user")
public class UserServicesController {
	private UserRepository userRepository;

	public UserServicesController(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@GetMapping("/{mobile}")
	public List<String> getUser(@PathVariable("mobile") final String mobile) {

		return getNameBymobile(mobile);
	}

	@GetMapping("/alluser")
	public List<User> getAllQuotes() {

		return getAllUsers();
	}

	/*@PostMapping("/add")
	public List<User> add(@RequestBody final Users users) {

		users.getName().stream().map(quote -> new User(users.getName(), user))
				.forEach(user -> usersRepository.save(user));
		return getNameBymobile(users.getName());
	}*/

	/*@PostMapping("/delete/{username}")
	public List<String> delete(@PathVariable("username") final String username) {

		List<Quote> quotes = quotesRepository.findByUserName(username);
		quotesRepository.delete(quotes);

		return getQuotesByUserName(username);
	}*/

	private List<User> getAllUsers() {
		return userRepository.findAll();
	}

	private List<String> getNameBymobile(@PathVariable("mobile") String username) {
		return userRepository.findByMobile(username).stream().map(User::getName).collect(Collectors.toList());
	}

}
