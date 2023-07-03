package com.cg.sales.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.sales.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	List<Customer> findByCustFirstName(String custFirstName);
	List<Customer> findByCustCity(String custCity);
	List<Customer> findByCustIncomeLevel(String custIncomeLevel);
	List<Customer> findByCustCreditLimit(Integer custCreditLimit);
}
