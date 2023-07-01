package com.cg.sales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sales.entity.Customer;
import com.cg.sales.exception.CustomerNotFoundException;
import com.cg.sales.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(null);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer getCustomer(Integer custId) {
		return customerRepository.findById(custId).orElseThrow(()->new CustomerNotFoundException("Customer with ID: "+custId+",not available "));
	}

	@Override
	public void deleteProduct(Integer custId) {
		Customer customer = getCustomer(custId);
		customerRepository.deleteById(customer.getCustId());
	}

	@Override
	public Customer updateProduct(Integer custId, Customer customer) {
		Customer existingCustomer = getCustomer(custId);
		existingCustomer.setCustFirstName(customer.getCustFirstName());
		//remaining methods
		
		return customerRepository.save(existingCustomer);
	}

}
