package com.cg.sales.controller;

import java.util.List;
import java.util.Map;

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

import com.cg.sales.entity.Countries;
import com.cg.sales.service.CountriesService;
import com.cg.sales.service.CustomerService;

@RestController
@RequestMapping(value="/api/v1")
public class CountryController {

	private CountriesService countryService;
	
	@Autowired
	public void setCountryService(CountriesService countryService) {
		this.countryService = countryService;
	}
	
	/*
	 * Getting All Countries
	 */
	@GetMapping(value="/countries")
	public ResponseEntity<List<Countries>> getAllCountries(){
		List<Countries> allCountries = countryService.getAllCountries();
		return ResponseEntity.ok(allCountries);
	}
	
	/*
	 * Post Country
	 */
	@PostMapping(value="/countries")
	@ResponseStatus(value=HttpStatus.OK,reason="Country record created successfully")
	public Countries saveCountry(@RequestBody Countries country){
		return countryService.saveCountries(country);
	}
	
	/*
	 * Put Mapping using Country Id
	 */
	@PutMapping(value="/countries/{countryId}")
	@ResponseStatus(value=HttpStatus.ACCEPTED,reason="Country details updated successfuly")
	public Countries updateCounty(@PathVariable Integer countryId,@RequestBody Countries country){
		Countries updatedCountry= countryService.updateCountry(countryId, country);
		return updatedCountry;
	}
	
	/*
	 * Delete Country
	 */
	@DeleteMapping(value="/countries/{countryId}")
	@ResponseStatus(value=HttpStatus.ACCEPTED, reason="Record deleted successfully")
	public void deleteCustomer(@RequestParam(value="countryId") Integer countryId){
		countryService.deleteCountry(countryId);
	}
	
	@GetMapping(value="/count")
	public ResponseEntity<Map<String, Integer>> getCount(){
		Map<String, Integer> counts = countryService.getCount();
		return ResponseEntity.ok(counts);
	}
}
