package com.cybage.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{

}
