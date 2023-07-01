package com.cg.sales.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="sales")
public class Sales {
	
	@Id
	//@Column(name="prod_id")
	private int prodId;
	
	@Column(name="cust_id")
	private int custId;
	
	@Column(name="time_id")
	private Date timeId;
	
	@Column(name="channel_id")
	private int channelId;
	
	@Column(name="promo_id")
	private int promoId;
	
	@Column(name="quantity_sold")
	private int quantitySold;
	
	@Column(name="amount_sold")
	private double amountSold;

}
