package com.just.controller;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.just.entity.User;
import com.just.service.UserService;

@Controller

public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/user")
	public String findUsers(Model model) {
		model.addAttribute("user", userService.findUsers());
		return "index";
	}
	@RequestMapping("update")
	@Transactional(propagation=Propagation.REQUIRED)
	public String updateUser(User user) {
		userService.addUser(user);
		int count = userService.updateUser(user);
		System.out.println("count"+count);
		return "forward:user";
	}
}
