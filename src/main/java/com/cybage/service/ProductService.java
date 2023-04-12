package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.ProductDao;
import com.cybage.model.Product;

@Service
public class ProductService {
	@Autowired
	ProductDao dao;

	public void addProduct(Product newProduct) {
		dao.save(newProduct);
		
	}
	
	public List<Product> showAll(){
		return dao.findAll();
	}

	public Product getProductById(int id) {
		
		return dao.findById(id).orElse(null);
	}

	public void deleteProductById(int id) {
		dao.deleteById(id);
		
	}

	public void update(Product product,int id) {
		
		dao.save(product);
		
	}

}
