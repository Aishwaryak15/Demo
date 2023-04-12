package com.cybage.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="product_table")
public class Product {
@Id
private int productId;
private int productNumber;
private String productName;
@ManyToOne
@JsonBackReference
private Order order;

public Product() {
	
}


public Order getOrder() {
	return order;
}


public void setOrder(Order order) {
	this.order = order;
}


public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public int getProductNumber() {
	return productNumber;
}
public void setProductNumber(int productNumber) {
	this.productNumber = productNumber;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}





}
