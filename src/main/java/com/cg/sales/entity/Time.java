package com.cg.sales.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="times")
public class Time {

    @Id
    private Date timeId;

    @Column(name="day_name")
    private String dayName;

    @Column(name="day_INT_in_week")
    private int dayIntInWeek;

    @Column(name="day_INT_in_month")
    private int dayIntInMonth;

    @Column(name="calendar_week_INT")
    private int calendarWeekInt;

    @Column(name="fiscal_week_INT")
    private int fiscalWeekInt;

    @Column(name="week_ending_day")
    private Date weekEndingDay;

    @Column(name="week_ending_day_id")
    private int weekEndingDayId;

    @Column(name="calendar_month_INT")
    private int calendarMonthInt;

    @Column(name="fiscal_month_INT")
    private int fiscalMonthInt;

    @Column(name="calendar_month_desc")
    private String calendarMonthDesc;

    @Column(name="calendar_month_id")
    private int calendarMonthId;

    @Column(name="fiscal_month_desc")
    private String fiscalMonthDesc;

    @Column(name="fiscal_month_id")
    private int fiscalMonthId;

    @Column(name="days_in_cal_month")
    private int daysInCalMonth;

    @Column(name="days_in_fis_month")
    private int daysInFisMonth;

    @Column(name="end_of_cal_month")
    private Date endOfCalMonth;

    @Column(name="end_of_fis_month")
    private Date endOfFisMonth;

    @Column(name="calendar_month_name")
    private String calendarMonthName;

    @Column(name="fiscal_month_name")
    private String fiscalMonthName;

    @Column(name="calendar_quarter_desc")
    private String calendarQuarterDesc;    //char(7)

    @Column(name="calendar_quarter_id")
    private int calendarQuarterId;

    @Column(name="fiscal_quarter_desc")
    private String fiscalQuarterDesc;

    @Column(name="fiscal_quarter_id")
    private int fiscalQuarterId;

    @Column(name="days_in_cal_quarter")
    private int daysInCalQuarter;

    @Column(name="days_in_fis_quarter")
    private int daysInFisQuarter;

    @Column(name="end_of_cal_quarter")
    private Date endOfCalQuarter;

    @Column(name="end_of_fis_quarter")
    private Date endOfFisQuarter;

    @Column(name="calendar_quarter_INT")
    private int calenderQuarterInt;

    @Column(name="fiscal_quarter_INT")
    private int fiscalQuarterInt;

    @Column(name="calendar_year")
    private int calendarYear;

    @Column(name="calendar_year_id")
    private int calendarYearId;

    @Column(name="fiscal_year")
    private int fiscalYear;

    @Column(name="fiscal_year_id")
    private int fiscalYearId;

    @Column(name="days_in_cal_year")
    private int daysInCalYear;

    @Column(name="days_in_fis_year")
    private int daysInFisYear;

    @Column(name="end_of_cal_year")
    private Date endOfCalYear;

    @Column(name="end_of_fis_year")
    private Date endOfFisYear;
    
}