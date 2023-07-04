package com.cg.sales.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.sales.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findByProdCategory(String prodCategory);
	List<Product> findByProdStatus(String prodStatus);
	List<Product> findByProdSubcategory(String prodSubcategory);
	List<Product> findBySupplierId(int supplierId);
}
