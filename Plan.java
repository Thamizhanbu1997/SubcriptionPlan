package com.example.subcription;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tbl_plan")
@NamedQuery(name="Plan.findAll", query="SELECT t FROM Plan t")
public class Plan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="plan_id")
	private BigInteger id;

	@Column(name="plan_name")
	private String name;

	@Column(name="veh_type")
	private int vehType;
	
	@Column(name="plan_monthly_amount")
	private double monthlyAmount;

	@Column(name="plan_yearly_amount")
	private double yearlyAmount;
	
	@Column(name="plan_monthly_days")
	private int monthlyDays;
	
	@Column(name="plan_yearly_days")
	private int yearlyDays;
	
	@Column(name="plan_tax")
	private double tax;

    @Column(name="plan_monthly_cancel")
	private int monthlyCancel;
    
	@Column(name="plan_yearly_cancel")
	private int yearlyCancel;

	@Column(name="plan_monthly_trips")
	private int monthlyTrips;
	
	@Column(name="plan_yearly_trips")
	private int yearlyTrips;

	@Column(name="plan_createdby")
	private BigInteger planCreatedby;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="plan_createdon")
	private Date createdon;

	@Column(name="plan_modifiedby")
	private BigInteger modifiedby;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="plan_modifiedon")
	private Date modifiedon;


	@OneToMany(mappedBy="tblPlan")
	private List<Subcription> tblSubcriptions;

	public Plan() {
	}

	
		
	}
	
	

