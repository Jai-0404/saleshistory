package com.cg.sales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.sales.entity.Customer;
import com.cg.sales.entity.Product;
import com.cg.sales.service.ProductService;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

	private ProductService productService;
	
	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	@PostMapping(value="/products")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product){
		Product savedProduct = productService.saveProduct(product);
		ResponseEntity<Product> re = new ResponseEntity<Product>(savedProduct,HttpStatus.CREATED);
		return re;
	}
	
	/*
	 * Get Mapping for getting Customer by Id
	 */
	@GetMapping(value = "/products/{prodId}")
	public ResponseEntity<Product> getProduct(@PathVariable Integer prodId) {
		Product product = productService.getProduct(prodId);
		ResponseEntity<Product> re=new ResponseEntity<Product>(product,HttpStatus.OK);
		return re;
		
	}
}
