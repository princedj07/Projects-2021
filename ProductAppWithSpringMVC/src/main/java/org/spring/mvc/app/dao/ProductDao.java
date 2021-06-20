package org.spring.mvc.app.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.spring.mvc.app.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
//	Create Product
	@Transactional
	public void createProduct(Product product) {
		
//		this.hibernateTemplate.save(product);
		this.hibernateTemplate.saveOrUpdate(product);
	}

// Get the Single product
	public Product getProduct(int pid) {

		Product product = this.hibernateTemplate.get(Product.class, pid);
		return product;
		
	}
	
//	Get All Products
	public List<Product> getAllProducts() {
		
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;

	}
	
//	delete the single product
	@Transactional
	public void deleteProduct(int pid) {

		Product obj = this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(obj);
		
	}
	
	
}
