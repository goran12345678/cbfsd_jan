package com.myonlineshop.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myonlineshop.ContextProvider;
import com.myonlineshop.db.Db;
import com.myonlineshop.model.Product;


/*
 * Controller act as a mediator between view and model.
 *  It is responsible to control the data transmission between the model and the view.
 */
@Controller
public class HomeController {
	
	// Annotation is used to map web requests to Spring Controller methods.
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String getHomePage() {
		
		Product p = new Product(); 
		p.setDescription("test"); 
		p.setMake("Ford");
		p.setName("T");
		p.setPrice(300.00f);
		
		ApplicationContext cxt = ContextProvider.provideContext();
		Db db = cxt.getBean("db",Db.class);
		//db.insert(p);
		
		//name of jsp file to display the view
		return "home";
	}

}
