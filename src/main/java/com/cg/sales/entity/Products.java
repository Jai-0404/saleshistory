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


@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="products")
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int prodId;
	@Column
	private String prodName;
	@Column
	private String prodDesc;
	@Column
	private String prodSubcategory;
	@Column
	private int prodSubcategoryId;
	@Column
	private String prodSubcategoryDesc;
	@Column
	private String prodCategory;
	@Column
	private int prodCategoryId;
	@Column
	private String prodCategoryDesc;
	@Column
	private int prodWeightClass;
	@Column
	private String prodUnitOfMeasure;
	@Column
	private String prodPackSize;
	@Column
	private int supplierId;
	@Column
	private String prodStatus;
	@Column
	private double prodListPrice;
	@Column
	private double prodMinPrice;
	@Column
	private String prodTotal;
	@Column
	private int prodTotalId;
	@Column
	private int prodSrcId;
	@Column
	private Date prodEffFrom;
	@Column
	private Date prodEffTo;
	@Column
	private String prodValid;
	
	
	

}
