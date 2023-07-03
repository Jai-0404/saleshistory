package com.cg.sales.service;

import java.util.List;

import com.cg.sales.entity.Customer;
import com.cg.sales.entity.Product;

public interface ProductService {

	public Product saveProduct(Product product);
	public Product getProduct(Integer prodId);
	public List<Product> getAllProducts();
}
