package com.cg.sales.service;

import java.util.List;

import com.cg.sales.entity.Customer;
import com.cg.sales.entity.Product;

public interface ProductService {

	public Product saveProduct(Product product);
	public Product getProduct(Integer prodId);
	public List<Product> getAllProducts();
	public Product updateProduct(Integer prodId,Product product);
	public void deleteProduct(Integer prodId);
	public List<Product> searchAllProductsByCategory(String prodCategory);
	public List<Product> searchAllProductsByStatus(String prodStatus);
	public List<Product> searchAllProductsBySubcategory(String prodSubcategory);
	public List<Product> searchAllProductsBySupplierId(Integer supplierId);
	
	public List<Product> searchAllDuplicateProducts();
	
	public List<Product> getSoldProducts(String prodStatus);
	
}
