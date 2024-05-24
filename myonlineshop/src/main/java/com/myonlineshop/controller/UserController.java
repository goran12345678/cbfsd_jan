package com.myonlineshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myonlineshop.model.User;

@Controller
public class UserController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
        
		return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String addProduct(User user, Model model) {
		
		model.addAttribute("user", user);
		
		return "login";
	}

}
