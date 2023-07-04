package com.cg.sales.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
	//@ManyToOne(cascade = CascadeType.ALL)
	private int prodId;
	
	//@Column(name="time_id")
	@ManyToOne(cascade = CascadeType.ALL)
	private Time time;
	
	//@Column(name="promo_id")
	@ManyToOne(cascade = CascadeType.ALL)
	private Promotion promotion;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Channel channel;
	
	@Column(name="unit_cost")
	private int unitCost;
	
	@Column(name="unit_price")
	private double unitPrice;
}
