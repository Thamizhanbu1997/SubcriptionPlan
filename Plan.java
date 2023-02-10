package com.example.subcription;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
	private Long id;

	@Column(name="plan_name")
	private String name;

	@Enumerated(EnumType.ORDINAL)
	@Column(name="veh_type")
	private VehicleType type;
	
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

	@Column(name="plan_createdBy")
	private Long createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="plan_createdon")
	private Timestamp createdOn;

	@Column(name="plan_modifiedby")
	private Long modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="plan_modifiedon")
	private Timestamp modifiedOn;


	@OneToMany(mappedBy="plan")
	private List<Subcription> subcriptions;

	public Plan() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}

	public double getMonthlyAmount() {
		return monthlyAmount;
	}

	public void setMonthlyAmount(double monthlyAmount) {
		this.monthlyAmount = monthlyAmount;
	}

	public double getYearlyAmount() {
		return yearlyAmount;
	}

	public void setYearlyAmount(double yearlyAmount) {
		this.yearlyAmount = yearlyAmount;
	}

	public int getMonthlyDays() {
		return monthlyDays;
	}

	public void setMonthlyDays(int monthlyDays) {
		this.monthlyDays = monthlyDays;
	}

	public int getYearlyDays() {
		return yearlyDays;
	}

	public void setYearlyDays(int yearlyDays) {
		this.yearlyDays = yearlyDays;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public int getMonthlyCancel() {
		return monthlyCancel;
	}

	public void setMonthlyCancel(int monthlyCancel) {
		this.monthlyCancel = monthlyCancel;
	}

	public int getYearlyCancel() {
		return yearlyCancel;
	}

	public void setYearlyCancel(int yearlyCancel) {
		this.yearlyCancel = yearlyCancel;
	}

	public int getMonthlyTrips() {
		return monthlyTrips;
	}

	public void setMonthlyTrips(int monthlyTrips) {
		this.monthlyTrips = monthlyTrips;
	}

	public int getYearlyTrips() {
		return yearlyTrips;
	}

	public void setYearlyTrips(int yearlyTrips) {
		this.yearlyTrips = yearlyTrips;
	}

	
	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Long getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Subcription> getSubcriptions() {
		return subcriptions;
	}

	public void setSubcriptions(List<Subcription> subcriptions) {
		this.subcriptions = subcriptions;
	}

	

	
	
		
	}
	
	

