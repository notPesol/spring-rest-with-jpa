package com.pesol.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.pesol.spring.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Product> findAll() {
		TypedQuery<Product> query = entityManager.createQuery("FROM Product", Product.class);
		return query.getResultList();
	}

	@Override
	public Product findById(int id) {
		return entityManager.find(Product.class, id);
	}

	@Override
	public void update(Product product) {
		entityManager.merge(product);
	}

	@Override
	public void delete(int id) {
//		Product product = this.findById(id);
//		if (product != null) {
//			entityManager.remove(product);
//		}
		// or
		Query query = entityManager.createQuery("DELETE FROM Product where id = :id");
		query.setParameter("id", id);
		query.executeUpdate();
		
	}

	@Override
	public void add(Product product) {
		entityManager.persist(product);
	}

}
