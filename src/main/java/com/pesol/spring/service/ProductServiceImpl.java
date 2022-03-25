package com.pesol.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pesol.spring.dao.ProductDao;
import com.pesol.spring.entity.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> findAll() {
		return productDao.findAll();
	}

	@Override
	public void update(Product product) {
		productDao.update(product);
	}

	@Override
	public void delete(int id) {
		productDao.delete(id);
	}

	@Override
	public void add(Product product) {
		productDao.add(product);
		
	}

	@Override
	public Product findById(int id) {
		return productDao.findById(id);
	}

}
