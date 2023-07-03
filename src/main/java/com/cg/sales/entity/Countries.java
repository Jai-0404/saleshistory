package com.cg.sales.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="countries")

public class Countries {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int countryId;
	
	@Column(name="country_iso_code")
	private String countryIsoCode;
	
	@Column(name="country_name")
	private String countryName;
	
	@Column(name="country_subregion")
	private String countrySubregion;
	
	@Column(name="country_subregion_id")
	private int countrySubregionId;
	
	@Column(name="country_region")
	private String countryRegion;
	
	@Column(name="country_region_id")
	private int countryRegionId;
	
	@Column(name="country_total")
	private String countryTotal;
	
	@Column(name="country_total_id")
	private int countryTotalId;
	
}
