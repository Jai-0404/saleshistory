//package com.cg.sales.entity;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.EmbeddedId;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//import javax.validation.constraints.NotNull;
//
//import lombok.AllArgsConstructor;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//@EqualsAndHashCode
//public class Cost {
//
//	@JoinColumn(name="prod_id")
//	@ManyToOne(cascade = CascadeType.ALL)
//	@NotNull(message = "Product ID may not be null")
//	private int prodId;
//	
//	@JoinColumn(name="time_id")
//	@ManyToOne(cascade = CascadeType.ALL)
//	@NotNull(message = "Time ID may not be null")
//	private Time time;
//	
//	@JoinColumn(name="promo_id")
//	@ManyToOne(cascade = CascadeType.ALL)
//	@NotNull(message = "Promotion ID may not be null")
//	private Promotion promotion;
//	
//	@JoinColumn(name="channel_id")
//	@ManyToOne(cascade = CascadeType.ALL)
//	@NotNull(message = "Channel ID may not be null")
//	private Channel channel;
//	
//	@Column(name="unit_cost")
//	@NotNull(message = "Unit Cost may not be null")
//	private int unitCost;
//	
//	@Column(name="unit_price")
//	@NotNull(message = "Unit Price may not be null")
//	private double unitPrice;
//}
