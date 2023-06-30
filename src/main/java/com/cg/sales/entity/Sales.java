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

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="sales")
public class Sales {
	
	@Column
	private int prodId;
	@Column
	private int custId;
	@Column
	private Date timeId;
	@Column
	private int channelId;
	@Column
	private int promoId;
	@Column
	private int quantitySold;
	@Column
	private double amountSold;

}
