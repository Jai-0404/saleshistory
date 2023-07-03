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
		return customerRepository.save(customer);
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
	public List<Customer> searchCustomerByFirstname(String custFirstName) {
		return customerRepository.findByCustFirstName(custFirstName);
	}

	@Override
	public List<Customer> searchCustomerByCity(String custCity) {
		return customerRepository.findByCustCity(custCity);
	}
	
	@Override
	public void deleteCustomer(Integer custId) {
		Customer customer = getCustomer(custId);
		customerRepository.deleteById(customer.getCustId());
	}

	@Override
	public Customer updateCustomer(Integer custId, Customer customer) {
		Customer existingCustomer = getCustomer(custId);
		existingCustomer.setCustFirstName(customer.getCustFirstName());
		existingCustomer.setCustLastName(customer.getCustLastName());
		//remaining methods
		
		return customerRepository.save(existingCustomer);
	}

	@Override
	public List<Customer> searchCustomerByIncome(String custIncomeLevel) {
		return customerRepository.findByCustIncomeLevel(custIncomeLevel);
	}

	@Override
	public Customer updateCustomerCreditLimit(Integer custId,Customer customer) {
		Customer existingCustomer = getCustomer(custId);
		existingCustomer.setCustCreditLimit(customer.getCustCreditLimit());
		return customerRepository.save(existingCustomer);
	}

	@Override
	public List<Customer> searchCustomerByCreditLimit(Integer custCreditLimit) {
		return customerRepository.findByCustCreditLimit(custCreditLimit);
	}


}
