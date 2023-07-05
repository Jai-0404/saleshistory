package com.cg.sales.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.sales.entity.Countries;

@Repository
public interface CountriesRepository extends JpaRepository<Countries, Integer> {

	}


