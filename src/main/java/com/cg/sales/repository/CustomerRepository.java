package com.cg.sales.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.sales.dto.CustomerResponse;
import com.cg.sales.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	List<Customer> findByCustFirstName(String custFirstName);
	List<Customer> findByCustCity(String custCity);
	List<Customer> findByCustIncomeLevel(String custIncomeLevel);
	List<Customer> findByCustCreditLimit(Integer custCreditLimit);
	
	java.util.Optional<Customer> findByCustId(int custId);
	
	@Query(value="SELECT new java.cg.sales.dto.CustomerResponse(c.cust_first_name,c.cust_last_name) FROM customers c",nativeQuery=true)
	public List<CustomerResponse> getInformation();

}
