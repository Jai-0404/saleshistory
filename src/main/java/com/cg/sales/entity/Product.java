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
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int prodId;
	
	@Column(name="prod_name")
	private String prodName;
	
	@Column(name="prod_desc")
	private String prodDesc;
	
	@Column(name="prod_subcategory")
	private String prodSubcategory;
	
	@Column(name="prod_subcategory_id")
	private int prodSubcategoryId;
	
	@Column(name="prod_subcategory_desc")
	private String prodSubcategoryDesc;
	
	@Column(name="prod_category")
	private String prodCategory;
	
	@Column(name="prod_category_id")
	private int prodCategoryId;
	
	@Column(name="prod_category_desc")
	private String prodCategoryDesc;
	
	@Column(name="prod_weight_class")
	private int prodWeightClass;
	
	@Column(name="prod_unit_of_measure")
	private String prodUnitOfMeasure;
	
	@Column(name="prod_pack_size")
	private String prodPackSize;
	
	@Column(name="supplier_id")
	private int supplierId;
	
	@Column(name="prod_status")
	private String prodStatus;
	
	@Column(name="prod_list_price")
	private double prodListPrice;
	
	@Column(name="prod_min_price")
	private double prodMinPrice;
	
	@Column(name="prod_total")
	private String prodTotal;
	
	@Column(name="prod_total_id")
	private int prodTotalId;
	
	@Column(name="prod_src_id")
	private Integer prodSrcId;
	
	@Column(name="prod_eff_from")
	private Date prodEffFrom;
	
	@Column(name="prod_eff_to")
	private Date prodEffTo;
	
	@Column(name="prod_valid")
	private String prodValid;
	
}
