package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.exception.CustomException;
import com.cybage.model.Product;
import com.cybage.service.ProductService;

@RestController
@CrossOrigin("http://localhost:4200/")
public class ProcuctController {
	@Autowired
	ProductService service;
	
	@PostMapping("/addProduct")
	public ResponseEntity<String> addProduct(@RequestBody Product newProduct){
		service.addProduct(newProduct);
		return new ResponseEntity<String>("Product added successfuly", HttpStatus.CREATED);
	}
	
	@GetMapping("/showAll")
	public ResponseEntity<List<Product>> getAllProducts(){
		return new ResponseEntity<List<Product>>(service.showAll(), HttpStatus.OK);
	}
	
	@GetMapping("/getProduct/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable int id) throws NullPointerException{
		Product product = service.getProductById(id);
		if(product!=null) 
		return new ResponseEntity<Product>(product, HttpStatus.FOUND);
		else throw new CustomException("record not found");
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable int id){
		service.deleteProductById(id);
		return new ResponseEntity<String>("product deleted", HttpStatus.OK);
	}
	@PutMapping("/updateAll/{id}")
	public ResponseEntity<String> updateproduct(@PathVariable int id,@RequestBody Product product){
		service.update(product,id);
		return new ResponseEntity<String>("product updated", HttpStatus.OK);
		
	}
	
	// this method will handle the exception but for this controller only
	/*
	 * @ExceptionHandler(CustomException.class) public ResponseEntity<String>
	 * handleException(CustomException error) { return new
	 * ResponseEntity<String>(error.getMessage(), HttpStatus.NOT_FOUND); }
	 */
}
