package com.cg.sales.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="customers")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int custId;
	
	@Column(name="cust_first_name")
	private String custFirstName;
	
	@Column(name="cust_last_name")
	private String custLastName;
	
	@Column(name="cust_gender")
	private char custGender;
	
	@Column(name="cust_year_of_birth")
	private int custYearOfBirth;
	
	@Column(name="cust_martial_name")
	private String custMartialStatus;
	
	@Column(name="cust_street_address")
	private String custStreetAddress;
	
	@Column(name="cust_postal_code")
	private String custPostalCode;
	
	@Column(name="cust_city")
	private String custCity;
	
	@Column(name="cust_city_id")
	private int custCityId;
	
	@Column(name="cust_state_province")
	private String custStateProvince;
	
	@Column(name="cust_state_id")
	private int custStateId;
	
	//@Column(name="cust_country_id")
	@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="country_id", referencedColumnName = "countryId")
	private Countries country;
	
	@Column(name="cust_main_phone_INT")
	private String custMainPhoneINT;
	
	@Column(name="cust_income_level")
	private String custIncomeLevel;
	
	@Column(name="cust_credit_limit")
	private int custCreditLimit;
	
	@Column(name="cust_email")
	private String custEmail;
	
	@Column(name="cust_total")
	private String custTotal;
	
	@Column(name="cust_total_id")
	private int custTotalId;
	
	@Column(name="cust_src_id")
	private int custSrcId;
	
	@Column(name="cust_eff_from")
	private Date custEffFrom;
	
	@Column(name="cust_eff_to")
	private Date custEffTo;
	
	@Column(name="cust_valid")
	private String custValid;
}
