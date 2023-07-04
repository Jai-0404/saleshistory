//package com.cg.sales.entity;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.EmbeddedId;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import lombok.AllArgsConstructor;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//@EqualsAndHashCode
//public class Sales {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	
//	@ManyToOne
//	@JoinColumn(name="prod_id")
//	private Product product;
//	
//	@ManyToOne
//	@JoinColumn(name="cust_id")
//	private Customer customer;
//	
//	@ManyToOne
//	@JoinColumn(name="time_id")
//	private Time time;
//	
//	@ManyToOne
//	@JoinColumn(name="channel_id")
//	private Channel channel;
//	
//	@ManyToOne
//	@JoinColumn(name="promo_id")
//	private Promotion promotion;
//
//	@Column(name="quantity_sold")
//	private int quantitySold;
//	
//	@Column(name="amount_sold")
//	private double amountSold;
//}
