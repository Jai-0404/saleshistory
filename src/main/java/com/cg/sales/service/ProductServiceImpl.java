package com.cg.sales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sales.entity.Product;
import com.cg.sales.exception.CustomerNotFoundException;
import com.cg.sales.exception.ProductNotFoundException;
import com.cg.sales.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	private ProductRepository productRepository;

	@Autowired
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product getProduct(Integer prodId) {
		return productRepository.findById(prodId).orElseThrow(()->new ProductNotFoundException("Product with ID: "+prodId+",not available "));
	}
	
	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}


}
