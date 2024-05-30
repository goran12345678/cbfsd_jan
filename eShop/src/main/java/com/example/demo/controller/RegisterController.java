package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Login;

@Controller
public class RegisterController {

	@GetMapping("/register")
	public String register(Model model) {
		Map<String, String> map = new HashMap<>();
		map.put("email", "");
		model.addAttribute("myProps", map);
		return "register";
	}

}
