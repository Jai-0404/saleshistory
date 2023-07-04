package com.cg.sales.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sales.entity.Product;
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

	@Override
	public Product updateProduct(Integer prodId, Product product) {
		Product existingProduct=getProduct(prodId);
		existingProduct.setProdCategory(product.getProdCategory());
		existingProduct.setProdCategoryDesc(product.getProdCategoryDesc());
		existingProduct.setProdCategoryId(product.getProdCategoryId());
		existingProduct.setProdDesc(product.getProdName());
		existingProduct.setProdEffFrom(product.getProdEffFrom());
		existingProduct.setProdEffTo(product.getProdEffTo());
		existingProduct.setProdListPrice(product.getProdListPrice());
		existingProduct.setProdMinPrice(product.getProdMinPrice());
		existingProduct.setProdName(product.getProdName());
		existingProduct.setProdPackSize(product.getProdPackSize());
		existingProduct.setProdSrcId(product.getProdSrcId());
		existingProduct.setProdWeightClass(product.getProdWeightClass());
		existingProduct.setProdValid(product.getProdValid());
		existingProduct.setProdUnitOfMeasure(product.getProdUnitOfMeasure());
		existingProduct.setProdStatus(product.getProdStatus());
		existingProduct.setProdTotal(product.getProdTotal());
		existingProduct.setProdTotalId(product.getProdTotalId());
		existingProduct.setProdSubcategory(product.getProdSubcategory());
		existingProduct.setProdSubcategoryDesc(product.getProdSubcategoryDesc());
		existingProduct.setProdSubcategoryId(product.getProdSubcategoryId());
		existingProduct.setSupplierId(product.getSupplierId());
		return productRepository.save(existingProduct);
	}

	@Override
	public void deleteProduct(Integer prodId) {
		Product product=getProduct(prodId);
		productRepository.deleteById(product.getProdId());
	}

	@Override
	public List<Product> searchAllProductsByCategory(String prodCategory) {
		return productRepository.findByProdCategory(prodCategory);
	}

	@Override
	public List<Product> searchAllProductsByStatus(String prodStatus) {
		return productRepository.findByProdStatus(prodStatus);
	}

	@Override
	public List<Product> searchAllProductsBySubcategory(String prodSubcategory) {
		return productRepository.findByProdSubcategory(prodSubcategory);
	}

	@Override
	public List<Product> searchAllProductsBySupplierId(Integer supplierId) {
		return productRepository.findBySupplierId(supplierId);
	}

	@Override
	public List<Product> searchAllDuplicateProducts() {
		List<Product> allProducts = getAllProducts();
		Set<Product> duplicates = new HashSet<>();
		List<Product> duplicateProducts = new ArrayList<>();
		
		for(Product product : allProducts) {
			if(!duplicates.add(product)) {
				duplicateProducts.add(product);
			}
		}
		
		return duplicateProducts;
	}


}
