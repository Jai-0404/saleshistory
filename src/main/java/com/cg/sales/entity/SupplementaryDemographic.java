package com.cg.sales.entity;

 

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

 
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="supplementary_demographics")
public class SupplementaryDemographic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int custId;

    @Column(name="education",columnDefinition = "varchar(21)")
    private String education;

    @Column(name="occupation",columnDefinition = "varchar(21)")
    private String occupation;
    
    @Column(name="household_size",columnDefinition = "varchar(21)")
    private String householdSize;

    @Column(name="yrs_residence")
    private int yrsResidence;

    @Column(name="affinity_card")
    private int affintyCard;

    @Column(name="bulk_pack_diskettes")
    private int bulkPackDiskettes;

    @Column(name="flat_panel_monitor")
    private int flatPanelMonotor;

    @Column(name="home_theater_package")
    private int homeTheaterPackage;

    @Column(name="bookkeeping_application")
    private int bookkeepingApplication;

    @Column(name="printer_supplies")
    private int printerSupplies;

    @Column(name="y_box_games")
    private int yBoxGames;

    @Column(name="os_doc_set_kanji")
    private int osDocSetKanji;

    @Column(name="comments",columnDefinition = "varchar(4000)")
    private String comments;

}