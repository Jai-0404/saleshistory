package com.cg.sales.entity;

import java.util.Date;

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

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="customers")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int custId;
	@Column
	private String custFirstName;
	@Column
	private String custLastName;
	@Column
	private char custGender;
	@Column
	private int custYearOfBirth;
	@Column
	private String custMartialStatus;
	@Column
	private String custStreetAddress;
	@Column
	private String custPostalCode;
	@Column
	private String custCity;
	@Column
	private int custCityId;
	@Column
	private String custStateProvince;
	@Column
	private int custStateId;
	@Column
	private int countryId;
	@Column
	private String custMainPhoneINT;
	@Column
	private String custIncomeLevel;
	@Column
	private int custCreditLimit;
	@Column
	private String custEmail;
	@Column
	private String custTotal;
	@Column
	private int custTotalId;
	@Column
	private int custSrcId;
	@Column
	private Date custEffFrom;
	@Column
	private Date custEffTo;
	@Column
	private String custValid;
}
