package com.cg.sales.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
public class Costs {

	@Column
	private int prodId;
	@Column
	private int timeId;
	@Column
	private Date promoId;
	@Column
	private int channelId;
	@Column
	private int unitCost;
	@Column
	private double unitPrice;
}
