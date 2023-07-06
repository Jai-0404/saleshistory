package com.cg.sales.controller;

import java.util.List;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.sales.dto.CustomerResponse;
import com.cg.sales.entity.Customer;
import com.cg.sales.repository.CustomerRepository;
import com.cg.sales.service.CustomerService;

@RestController
@RequestMapping(value="/api/v1")
public class CustomerController {

	private CustomerService customerService;
	private CustomerRepository customerRepository;
	
	@Autowired
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	/*
	 * Post Mapping for Customer Entity
	 */
	@PostMapping(value="/customers")
	@ResponseStatus(value=HttpStatus.CREATED,reason="Customer Created")
	public Customer saveCustomer(@RequestBody Customer customer){
		return customerService.saveCustomer(customer);
		//return ResponseEntity.status(HttpStatus.CREATED).body("Record Created Successfully");
	}
	
	/*
	 * Get Mapping for getting Customer by Id
	 */
	@GetMapping(value = "/customers/{custId}")
	public ResponseEntity<Customer> getCustomer(@RequestParam(value="custId") Integer custId) {
		Customer customer = customerService.getCustomer(custId);
		ResponseEntity<Customer> re=new ResponseEntity<Customer>(customer,HttpStatus.OK);
		return re;
		
	}
	
	@GetMapping(value = "/customers/name/{custId}")
	public String getCustomerName(@RequestParam(value="custId") Integer custId) {
		return customerService.getCustomerNameById(custId);
	}
	
	/*
	 * Get Mapping for All Customers
	 */
	@GetMapping(value = "/customers")
	public ResponseEntity<List<Customer>> getAllCustomers() {
		List<Customer> allCustomers = customerService.getAllCustomers();		
		//ResponseEntity<List<Customer>> re = new ResponseEntity<List<Customer>>(allCustomers,HttpStatus.OK);
		return ResponseEntity.ok(allCustomers);
		
	}
	
	
	/*
	 * Put Mapping for Customer Entity Update
	 */
	@PutMapping(value = "/customers/{custId}")
	@ResponseStatus(value=HttpStatus.ACCEPTED, reason="Customer details Updated")
	public Customer updateCustomer(@PathVariable Integer custId,@RequestBody Customer customer){
				
		Customer updatedCustomer= customerService.updateCustomer(custId, customer);
		
		return updatedCustomer;
	}
	
	
	/*
	 * Delete Mapping for Customer Entity
	 */
	@DeleteMapping(value = "/customers/{custId}")
	@ResponseStatus(value=HttpStatus.ACCEPTED,reason="Customer Deleted Successfully")
	public void deleteCustomer(@RequestParam(value="custId") Integer custId){
		customerService.deleteCustomer(custId);
	}
	
	
	/*
	 * Get Mapping for Customer by FirstName
	 */
	@GetMapping(value="/customers/{custFirstName}")
	public ResponseEntity<List<Customer>> searchCustomerByFirstName(@RequestParam(value="custFirstName") String custFirstName){
		List<Customer> customers = customerService.searchCustomerByFirstname(custFirstName);
		return ResponseEntity.ok(customers);
	}
	
	
	/*
	 * Get Mapping for Customer by City
	 */
	@GetMapping(value="/customers/{custCity}")
	public ResponseEntity<List<Customer>> searchCustomerByCity(@RequestParam(value="custCity") String custCity){
		List<Customer> customers = customerService.searchCustomerByCity(custCity);
		return ResponseEntity.ok(customers);
	}
	
	
	/*
	 * Get Mapping for Customer by income
	 */
	@GetMapping(value="/customers/{custIncomeLevel}")
	public ResponseEntity<List<Customer>> searchCustomerIncome(@RequestParam(value="custIncomeLevel") String custIncomeLevel){
		List<Customer> customers = customerService.searchCustomerByIncome(custIncomeLevel);
		return ResponseEntity.ok(customers);
	}
	
	@GetMapping(value="/customers/{custCreditLimit}")
	public ResponseEntity<List<Customer>> searchCustomerByCreditLimit(@RequestParam(value="custCreditLimit") Integer custCreditLimit){
		List<Customer> customers = customerService.searchCustomerByCreditLimit(custCreditLimit);
		return ResponseEntity.ok(customers);
	}
	
	/*
	 * Put Mapping for Customer Entity Credit Limit
	 */
	@PutMapping(value = "/customers/creditlimit/{custId}")
	@ResponseStatus(value=HttpStatus.OK,reason="Customer credit limit updated successfully")
	public Customer updateCustomers(@PathVariable Integer custId,@RequestBody Customer customer){
				
		Customer updatedCustomer= customerService.updateCustomerCreditLimit(custId, customer);
		return updatedCustomer;
	}
	
	@GetMapping(value="/csutomers/getAllInformation")
	public List<CustomerResponse> getAllInformation(){
		return customerRepository.getInformation();
	}
	
	
	
}
