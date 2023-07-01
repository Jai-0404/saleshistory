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

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
@Entity
@Table(name="promotions")
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int promoId;
    
    @Column(name="promo_name")
    private String promoName;
    
    @Column(name="promo_subcategory")
    private String promoSubcategory;
    
    @Column(name="promo_subcategory_id")
    private int promoSubcategoryId;
    
    @Column(name="promo_category")
    private String promoCategory;
    
    @Column(name="promo_category_id")
    private int promoCategoryId;
    
    @Column(name="promo_cost")
    private double promoCost;
    
    @Column(name="promo_begin_date")
    private Date promoBeginDate;
    
    @Column(name="promo_end_date")
    private Date promoEndDate;
    
    @Column(name="promo_total")
    private String promoTotal;
    
    @Column(name="promo_total_id")
    private int promoTotalId;

}