package com.cg.sales.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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
	@NotNull(message = "Country id may not be null")
	private int countryId;
	
	@Column(name="country_iso_code", columnDefinition = "char(2)")
	@NotEmpty(message = "Country iso code may not be null")
	private String countryIsoCode;
	
	@Column(name="country_name",columnDefinition = "varchar(40)")
	@NotEmpty(message = " Country name may not be null")
	private String countryName;
	
	@Column(name="country_subregion",columnDefinition = "varchar(30)")
	@NotEmpty(message = "Country subregion may not be null")
	private String countrySubregion;
	
	@Column(name="country_subregion_id")
	@NotNull(message = "Country subregion id may not be null")
	private int countrySubregionId;
	
	@Column(name="country_region",columnDefinition = "varchar(40)")
	@NotEmpty(message = "Country region may not be null")
	private String countryRegion;
	
	@Column(name="country_region_id")
	@NotNull(message = "Country region id may not be null")
	private int countryRegionId;
	
	@Column(name="country_total",columnDefinition = "varchar(11)")
	@NotEmpty(message = "Country total may not be null")
	private String countryTotal;
	
	@Column(name="country_total_id")
	@NotNull(message = "Country total id may not be null")
	private int countryTotalId;

}
