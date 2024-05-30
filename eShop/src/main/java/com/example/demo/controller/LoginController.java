package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Login;

/*
 * Spring Boot employs convention over configuration 
 * 
 * Spring Boot is a framework built on top of the Spring framework
 * Notice the @Controller annotation is the same used for Spring Framework MVC applications
 * 
 * Spring Boot has the AutoConfigurator which reduces the configuration needed for the Spring Framework
 * Notice the Spring Boot project does not have xml configuration files as does Spring framework (i.e context.xml)
 */
@Controller
public class LoginController {

	//This method will get called when the browser url has "/login" in the address and the HTTP GET method is used to communicate.
	@GetMapping("/login")
	public String login(Model model) {
		Map<String, Login> map = new HashMap<>();
		map.put("login", new Login());
		model.addAttribute("myProps", map);
		
		//The return string signifies to ThymeLeaf to bind the model to the ...templates/login.html file
		return "login";
	}

	//This method will get called when the browser url has "/login" in the address and the HTTP POST method is used to communicate.
	@PostMapping("/login")
	public String login(Login login, Model model) {
		Map<String, String> map = new HashMap<>();
		if (!login.getPassword().equals("pass")) {
			map.put("message", "You are logged in");
			map.put("email", login.getEmail());
			model.addAttribute("myProps", map);
			//The login failed so redirect to the register page and passed the user email as a convenience.

			//Instructs ThymeLeaf to bind the ..templates/register.html file
			return "register";
			
		} else {
			//The login was correct so redirect to the main page.
			
			//ThymeLeaf handles HTML templates and data binding. It can respond to the browser also with redirect requests.
			 return "redirect:/";
		}

	}

}
