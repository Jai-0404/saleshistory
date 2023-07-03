package com.cg.sales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.sales.entity.Customer;
import com.cg.sales.service.CustomerService;

@RestController
@RequestMapping(value="/api/v1")
public class CustomerController {

	private CustomerService customerService;
	
	@Autowired
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	/*
	 * Post Mapping for Customer Entity
	 */
	@PostMapping(value="/customers")
	public ResponseEntity<?> saveCustomer(@RequestBody Customer customer){
		Customer savedCustomer = customerService.saveCustomer(customer);
		ResponseEntity<Customer> re = new ResponseEntity<Customer>(savedCustomer,HttpStatus.CREATED);
		return re;
		
	}
	
	/*
	 * Get Mapping for All Customers
	 */
	@GetMapping(value = "customers/allCustomers")
	public ResponseEntity<List<Customer>> getAllProducts() {
		List<Customer> allCustomers = customerService.getAllCustomers();		
		ResponseEntity<List<Customer>> re = new ResponseEntity<List<Customer>>(allCustomers,HttpStatus.OK);
		return re;
		
	}
	
	/*
	 * Put Mapping for Customer Entity
	 */
	@PutMapping(value = "/customers/{custId}")
	public ResponseEntity<Customer> updateProduct(@PathVariable Integer custId,@RequestBody Customer customer){
				
		Customer updatedCustomer= customerService.updateProduct(custId, customer);
		ResponseEntity<Customer> re=new ResponseEntity<Customer>(updatedCustomer,HttpStatus.OK);
		return re;
	}
}
