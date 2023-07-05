package com.cg.sales.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
	
	/*
	 * POST Products
	 */
	@PostMapping(value="/products")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product){
		Product savedProduct = productService.saveProduct(product);
		ResponseEntity<Product> re = new ResponseEntity<Product>(savedProduct,HttpStatus.CREATED);
		return re;
	}
	
	/*
	 * Get Products
	 */
	@GetMapping(value="/products")
	public ResponseEntity<List<Product>> getAllProducts() {
		List<Product> allProducts=productService.getAllProducts();
		ResponseEntity<List<Product>> re=new ResponseEntity<List<Product>>(allProducts,HttpStatus.OK);
		return re;
	}
	
	/*
	 * Get Mapping for getting Product by Id
	 */
	@GetMapping(value = "/products/{prodId}")
	public ResponseEntity<Product> getProduct(@PathVariable Integer prodId) {
		Product product = productService.getProduct(prodId);
		ResponseEntity<Product> re=new ResponseEntity<Product>(product,HttpStatus.OK);
		return re;	
	}
	
	/*
	 * Delete Product By Id
	 */
	@DeleteMapping(value = "/products/{prodId}")
	public ResponseEntity<String> deleteProduct(@RequestParam(value="prodId") Integer prodId){
		productService.deleteProduct(prodId);
		ResponseEntity<String> re=new ResponseEntity<String>("Product with Id:"+prodId+" Deleted Successfully!",HttpStatus.OK);
		return re;		
	}
	
	/*
	 * Getting Products by Category
	 */
	@GetMapping(value="/products/{prodCategory}")
	public ResponseEntity<List<Product>> getProductByCategory(@RequestParam(value="prodCategory") String prodCategory){
		
		List<Product> products = productService.searchAllProductsByCategory(prodCategory);
		return ResponseEntity.ok(products);
	}
	
	/*
	 * Getting Products by Status
	 */
	@GetMapping(value="/products/{prodStatus}")
	public ResponseEntity<List<Product>> getProductByStatus(@RequestParam(value="prodStatus") String prodCategory){
		
		List<Product> products = productService.searchAllProductsByStatus(prodCategory);
		return ResponseEntity.ok(products);
	}
	
	/*
	 * Getting Products by SubCategory
	 */
	@GetMapping(value="/products/{prodSubcategory}")
	public ResponseEntity<List<Product>> getProductBySubcategory(@RequestParam(value="prodSubcategory") String prodSubcategory){
		
		List<Product> products = productService.searchAllProductsBySubcategory(prodSubcategory);
		return ResponseEntity.ok(products);
	}
	
	/*
	 * Getting Products by SubCategory
	 */
	@GetMapping(value="/products/{supplierId}")
	public ResponseEntity<List<Product>> getProductBySupplierId(@RequestParam(value="supplierId") Integer supplierId){
		
		List<Product> products = productService.searchAllProductsBySupplierId(supplierId);
		return ResponseEntity.ok(products);
	}
	
	/*
	 * Getting Duplicate Products
	 */
	@GetMapping(value="/products/duplicates")
	public List<Product> getDuplicateProducts(){
		return productService.searchAllDuplicateProducts();
	}
	
	/*
	 * Get List of Sold Products
	 */
	
	
	/*
	 * Get List of Products Channel wise sold products
	 */
	
	/*
	 * Get list of products order by query field
	 */
	
	
}
