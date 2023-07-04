package com.cg.sales.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

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
    @NotNull(message = "Promo id may not be null")
    private int promoId;
    
    @Column(name="promo_name")
    @NotNull(message = "Promo name may not be null")
    private String promoName;
    
    @Column(name="promo_subcategory")
    @NotNull(message = "Promo subcategory may not be null")
    private String promoSubcategory;
    
    @Column(name="promo_subcategory_id")
    @NotNull(message = "Promo subcategory id may not be null")
    private int promoSubcategoryId;
    
    @Column(name="promo_category")
    @NotNull(message = "Promo category may not be null")
    private String promoCategory;
    
    @Column(name="promo_category_id")
    @NotNull(message = "Promo category id may not be null")
    private int promoCategoryId;
    
    @Column(name="promo_cost")
    @NotNull(message = "Promo cost may not be null")
    private BigDecimal promoCost;
    
    @Column(name="promo_begin_date")
    @NotNull(message = "Promo begin date may not be null")
    private Date promoBeginDate;
    
    @Column(name="promo_end_date")
    @NotNull(message = "Promo End Date may not be null")
    private Date promoEndDate;
    
    @Column(name="promo_total")
    private String promoTotal;
    
    @Column(name="promo_total_id")
    private int promoTotalId;

}