package com.cg.sales.entity;

import java.math.BigDecimal;
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
	
	
	@Column(name="prod_name",columnDefinition = "varchar(50)",nullable = false)
	private String prodName;
	
	@Column(name="prod_desc",columnDefinition = "varchar(4000)",nullable = false)
	private String prodDesc;
	
	@Column(name="prod_subcategory",columnDefinition = "varchar(50)",nullable = false)
	private String prodSubcategory;
	
	@Column(name="prod_subcategory_id",nullable = false)
	private int prodSubcategoryId;
	
	@Column(name="prod_subcategory_desc",columnDefinition = "varchar(2000)",nullable = false)
	private String prodSubcategoryDesc;
	
	@Column(name="prod_category",columnDefinition = "varchar(50)",nullable = false)
	private String prodCategory;
	
	@Column(name="prod_category_id")
	private int prodCategoryId;
	
	@Column(name="prod_category_desc",columnDefinition = "varchar(2000)",nullable = false)
	private String prodCategoryDesc;
	
	@Column(name="prod_weight_class",nullable = false)
	private int prodWeightClass;
	
	@Column(name="prod_unit_of_measure",columnDefinition = "varchar(20)")
	private String prodUnitOfMeasure;
	
	@Column(name="prod_pack_size",columnDefinition = "varchar(30)",nullable = false)
	private String prodPackSize;
	
	@Column(name="supplier_id",nullable = false)
	private int supplierId;
	
	@Column(name="prod_status",columnDefinition = "varchar(20)",nullable = false)
	private String prodStatus;
	
	@Column(name="prod_list_price",precision = 8,scale = 2,nullable = false)
	private BigDecimal prodListPrice;
	
	@Column(name="prod_min_price",precision = 8,scale = 2,nullable = false)
	private BigDecimal prodMinPrice;
	
	@Column(name="prod_total",columnDefinition = "varchar(13)",nullable = false)
	private String prodTotal;
	
	@Column(name="prod_total_id",nullable = false)
	private int prodTotalId;
	
	@Column(name="prod_src_id")
	private Integer prodSrcId;
	
	@Column(name="prod_eff_from")
	private Date prodEffFrom;
	
	@Column(name="prod_eff_to")
	private Date prodEffTo;
	
	@Column(name="prod_valid",columnDefinition = "varchar(1)",nullable = false)
	private String prodValid;
	
}
