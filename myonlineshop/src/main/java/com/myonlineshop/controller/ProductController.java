package com.myonlineshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myonlineshop.model.Product;

@Controller
public class ProductController {

	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute Product product, Model model) {
		model.addAttribute("product", product);
		
		return "product";
	}
	
}
