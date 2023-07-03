package com.cg.sales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	public ResponseEntity<String> saveCustomer(@RequestBody Customer customer){
		//Customer savedCustomer = customerService.saveCustomer(customer);
		//ResponseEntity<Customer> re = new ResponseEntity<Customer>(savedCustomer,HttpStatus.CREATED);
		//return re;
		
		customerService.saveCustomer(customer);
		return ResponseEntity.status(HttpStatus.CREATED).body("Record Created Successfully");
		
	}
	
	/*
	 * Get Mapping for All Customers
	 */
	@GetMapping(value = "customers/allCustomers")
	public ResponseEntity<List<Customer>> getAllCustomers() {
		List<Customer> allCustomers = customerService.getAllCustomers();		
		//ResponseEntity<List<Customer>> re = new ResponseEntity<List<Customer>>(allCustomers,HttpStatus.OK);
		return ResponseEntity.ok(allCustomers);
		
	}
	
	/*
	 * Put Mapping for Customer Entity Update
	 */
	@PutMapping(value = "/customers/{custId}")
	public ResponseEntity<Customer> updateProduct(@PathVariable Integer custId,@RequestBody Customer customer){
				
		Customer updatedCustomer= customerService.updateCustomer(custId, customer);
		ResponseEntity<Customer> re=new ResponseEntity<Customer>(updatedCustomer,HttpStatus.OK);
		return re;
	}
	
	/*
	 * Delete Mapping for Customer Entity
	 */
	@DeleteMapping(value = "/customers/{custId}")
	public ResponseEntity<String> deleteCustomer(@PathVariable Integer custId){
		customerService.deleteCustomer(custId);
		ResponseEntity<String> re=new ResponseEntity<String>("Customer with Id:"+custId+" Deleted Successfully!",HttpStatus.OK);
		return re;		
	}
	
	/*
	 * Get Mapping for Customer by FirstName
	 */
	@GetMapping(value="/customers/{custFirstName}")
	public ResponseEntity<List<Customer>> searchCustomerByFirstName(@PathVariable String custFirstName){
		List<Customer> customers = customerService.searchCustomerByFirstname(custFirstName);
		return ResponseEntity.ok(customers);
	}
	
	/*
	 * Get Mapping for Customer by City
	 */
	@GetMapping(value="/customers/{custCity}")
	public ResponseEntity<List<Customer>> searchCustomerByCity(@PathVariable String custCity){
		List<Customer> customers = customerService.searchCustomerByCity(custCity);
		return ResponseEntity.ok(customers);
	}
}
