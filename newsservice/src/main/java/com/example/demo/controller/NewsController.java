package com.example.demo.controller;

import java.util.LinkedHashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Login;

/*
 * REpresentational State Transfer is an architecture for developing web services that enable systems to easily communicate with each other
 * A  Web Service is an application that uses a standard messaging protocol
 */
/*
 * REST applications use the HTTP protocol to communicate.
 */
//For a Controller to behave as a REST controller it is annotated with @RestController. The methods in the REST controller class behave differently from methods in a MVC Controller class
@RestController()
public class NewsController {
	
	/*Add "/name" into the browser url. Notice what is displayed. Why do you see HTML rendering? Notice the return type for this method is String.
	Keep in mind String is a wrapper for a primitive data type. Keep this in mind because in REST services you will find many example of why we use Wrappers for primitive data types.
	The String Wrapper triggers the response to set the content type as text/html which the browser understands as HTML content and renders as such
	*/
	@GetMapping("/name")
	public String getName() {
		return "<h3>Welcome to My News Service</h3>";
	}
	
	/*
	 * Add "/news" to the url in your browser. Notice what is displayed. Is that HTML? What notation is that? You were first introduced to it in Phase 1 JavaScript.
	 * Take notes of the method return type. It is an object. REST Controllers serialize objects into JSON strings. What you see in your browser is a JSON representation of the LinkedHasMap
	 * The object return type triggers the response to set the content type as "application/json" which the browser understands to be a string and hands over to the calling page as a string
	 */
	//Because the above method does not return a JSON object this application can not be considered a Web Service.
	@GetMapping("/news")
	public LinkedHashMap<String, Object> getNews(){
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("status", "ok");
		map.put("total", 0);
		map.put("article", new String[] {"Article 1","Article 2","Article 3"});
		
		return map;
			
	}
	@PostMapping("/login")
	public String submitForm(@RequestParam("email") String email, @RequestParam("password") String password) {
		
		if(password.equals("pass")) {
			
			return "<h3>Login successfull!!</h3>";
		}else {
			
			return "<h3>Login failed</h3>";
		}	
	}
	/*
	 * Serialization is the process of converting the state of an object into a form that can be persisted or transported. In this case a JSON string over HTTP
	 * The html page submit a JSON object which is deserialized by Spring Boot and passed as a parameter to the method.
	 */
	@PostMapping("/submit")
	public String submitForm(@RequestBody Login login) {
		
		System.out.println("login: " + login.getPassword());
		
		if(login.getPassword().equals("pass")) {
			
			return "<h3>Login successfull!!</h3>";
		}else {
			
			return "<h3>Login failed</h3>";
		}	
	}

}
