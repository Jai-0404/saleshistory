package com.cg.sales.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<String> handleCustomerNotFoundException(CustomerNotFoundException cnfe){
		ResponseEntity re=new ResponseEntity<String>(cnfe.getMessage(),HttpStatus.NOT_FOUND);
		return re;
	}
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<String> handleProductNotFoundException(ProductNotFoundException pnfe){
		ResponseEntity re=new ResponseEntity<String>(pnfe.getMessage(),HttpStatus.NOT_FOUND);
		return re;
	}
	
	
	
	
}
