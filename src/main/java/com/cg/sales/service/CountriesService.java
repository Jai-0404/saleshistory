package com.cg.sales.service;

import java.util.List;
import java.util.Map;

import com.cg.sales.entity.Countries;

public interface CountriesService {

	public Countries saveCountries(Countries country);
	public List<Countries> getAllCountries();
	public Countries updateCountry(Integer countryId,Countries country);
	public Countries getCountry(Integer countryId);
	public void deleteCountry(Integer countryId);

	public Map<String, Integer> getCount();
}
