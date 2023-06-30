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
	@Column
	private String countryIsoCode;
	@Column
	private String countryName;
	@Column
	private String countrySubregion;
	@Column
	private int countrySubregionId;
	@Column
	private String countryRegion;
	@Column
	private int countryRegionId;
	@Column
	private String countryTotal;
	@Column
	private int countryTotalId;
	
}
