package com.cybage.model;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="order_table")
public class Order {
	@Id
	private int orderId;
	@Column(name="total_amount")
	private int Totalamount;
	
	@OneToMany(mappedBy = "order")
	private List<Product> productList;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getTotalamount() {
		return Totalamount;
	}
	public void setTotalamount(int totalamount) {
		Totalamount = totalamount;
	}
	
	
	
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	public Order() {
		
	}
	
}
