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

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="costs")
public class Cost {

	@Id
	//@Column(name="prod_id")
	private int prodId;
	@Column(name="time_id")
	private int timeId;
	@Column(name="promo_id")
	private Date promoId;
	@Column(name="channel_id")
	private int channelId;
	@Column(name="unit_cost")
	private int unitCost;
	@Column(name="unit_price")
	private double unitPrice;
}
