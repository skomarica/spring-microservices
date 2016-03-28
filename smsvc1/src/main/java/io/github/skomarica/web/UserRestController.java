package io.github.skomarica.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.skomarica.security.UserService;

@RestController("/user")
public class UserRestController {

	@Autowired
	UserService userService;

	@RequestMapping
	public String getDefaultUser() {
		return userService.getDefaultUser();
	}
}
