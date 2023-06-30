package com.cg.sales.entity;

import java.util.Date;

import javax.persistence.Entity;
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

	private int custId;
	private String custFirstName;
	private String custLastName;
	private char custGender;
	private int custYearOfBirth;
	private String custMartialStatus;
	private String custStreetAddress;
	private String custPostalCode;
	private String custCity;
	private int custCityId;
	private String custStateProvince;
	private int custStateId;
	private int countryId;
	private String custMainPhoneINT;
	private String custIncomeLevel;
	private int custCreditLimit;
	private String custEmail;
	private String custTotal;
	private int custTotalId;
	private int custSrcId;
	private Date custEffFrom;
	private Date custEffTo;
	private String custValid;
}
