package com.pesol.spring.dao;

import java.util.List;

import com.pesol.spring.entity.Product;

public interface ProductDao {
	
	List<Product> findAll();

	Product findById(int id);

	void update(Product product);

	void delete(int id);

	void add(Product product);
}
