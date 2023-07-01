package com.cg.sales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping(value="/customers")
	public Customer saveCustomer(@RequestBody Customer customer){
//		Customer savedCustomer = customerService.saveCustomer(customer);
//		ResponseEntity<Customer> re = new ResponseEntity<Customer>(savedCustomer,HttpStatus.CREATED);
		return customerService.saveCustomer(customer);
	}
}
