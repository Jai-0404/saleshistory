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
    
    @Column
    private String promoName;
    
    @Column
    private String promoSubcategory;
    
    @Column
    private int promoSubcategoryId;
    
    @Column
    private String promoCategory;
    
    @Column
    private int promoCategoryId;
    
    @Column
    private double promoCost;
    
    @Column
    private Date promoBeginDate;
    
    @Column
    private Date promoEndDate;
    
    @Column
    private String promoTotal;
    
    @Column
    private int promoTotalId;

}