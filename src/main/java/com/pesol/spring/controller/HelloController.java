package com.pesol.spring.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pesol.spring.entity.Product;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {
	
	@GetMapping
	public String hello(
			@RequestParam(
					name = "name", 
					required = false, 
					defaultValue = "World") String name) {
		
		return String.format("Hello %s!", name);
	}
	
	@GetMapping("/product")
	public Product getDummyProduct() {
		Product product = new Product();
		product.setId(1);
		product.setName("Adda shoe");
		return  product;
	}
}
