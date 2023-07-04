package com.cg.sales.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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
	@NotNull(message = "Customer Id may not be null")
	private int custId;
	
	@Column(name="cust_first_name",columnDefinition = "varchar(20)")
	@NotEmpty(message="Customer first name may not be null")
	private String custFirstName;
	
	@Column(name="cust_last_name",columnDefinition = "varchar(40)")
	@NotEmpty(message="Customer last name may not be null")
	private String custLastName;
	
	@Column(name="cust_gender",columnDefinition = "char(1)")
	@NotEmpty(message="Customer gender may not be null")
	private String custGender;
	
	@Column(name="cust_year_of_birth")
	@NotNull(message = "Date of Birth may not be null")
	private int custYearOfBirth;
	
	@Column(name="cust_marital_status",columnDefinition = "varchar(20)")
	private String custMartialStatus;
	
	@Column(name="cust_street_address",columnDefinition = "varchar(40)")
	private String custStreetAddress;
	
	@Column(name="cust_postal_code",columnDefinition = "varchar(10)")
	private String custPostalCode;
	
	@Column(name="cust_city",columnDefinition = "varchar(30)")
	@NotEmpty(message = "Customer City may not be null")
	private String custCity;
	
	@Column(name="cust_city_id")
	private int custCityId;
	
	@Column(name="cust_state_province",columnDefinition = "varchar(40)")
	private String custStateProvince;
	
	@Column(name="cust_state_province_id")
	@NotNull(message = "State Province may not be null")
	private int custStateProvinceId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="country_id")
	@NotNull(message = "Country Id may not be null")
	private Countries country;
	
	@Column(name="cust_main_phone_INT",columnDefinition = "varchar(40)")
	@NotEmpty(message = "Customer Phone may not be null")
	private String custMainPhoneINT;
	
	@Column(name="cust_income_level",columnDefinition = "varchar(30)")
	private String custIncomeLevel;
	
	@Column(name="cust_credit_limit")
	private int custCreditLimit;
	
	@Column(name="cust_email",columnDefinition = "varchar(50)")
	@Email(message="Please write valid email")
	private String custEmail;
	
	@Column(name="cust_total",columnDefinition = "varchar(14)")
	private String custTotal;
	
	@Column(name="cust_total_id")
	@NotNull(message = "Customer Total may not be null")
	private int custTotalId;
	
	@Column(name="cust_src_id")
	private Integer custSrcId;
	
	@Column(name="cust_eff_from")
	private Date custEffFrom;
	
	@Column(name="cust_eff_to")
	private Date custEffTo;
	
	@Column(name="cust_valid",columnDefinition = "varchar(1)")
	private String custValid;
	
	@ManyToMany
	@JoinTable(name="sales",
			joinColumns = {@JoinColumn(name = "custId")},
            inverseJoinColumns = {@JoinColumn(name = "prodId")})
	private List<Product> products;
	
	@ManyToMany
	@JoinTable(name="sales",
			joinColumns = {@JoinColumn(name = "custId")},
            inverseJoinColumns = {@JoinColumn(name = "channelId")})
	private List<Channel> channels;
	
	@ManyToMany
	@JoinTable(name="sales",
			joinColumns = {@JoinColumn(name = "custId")},
            inverseJoinColumns = {@JoinColumn(name = "timeId")})
	private List<Time> time;
	
	@ManyToMany
	@JoinTable(name="sales",
			joinColumns = {@JoinColumn(name = "custId")},
            inverseJoinColumns = {@JoinColumn(name = "promoId")})
	private List<Promotion> promotions;
}

