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
	private long planId;

	private BigInteger createdby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdon;

	private BigInteger id;

	private BigInteger modifiedby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedon;

	@Column(name="monthly_cancel")
	private int monthlyCancel;

	@Column(name="monthly_days")
	private int monthlyDays;

	@Column(name="monthly_trips")
	private int monthlyTrips;

	@Column(name="plan_createdby")
	private BigInteger planCreatedby;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="plan_createdon")
	private Date planCreatedon;

	@Column(name="plan_modifiedby")
	private BigInteger planModifiedby;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="plan_modifiedon")
	private Date planModifiedon;

	@Column(name="plan_monthly_amount")
	private double planMonthlyAmount;

	@Column(name="plan_monthly_cancel")
	private int planMonthlyCancel;

	@Column(name="plan_monthly_days")
	private int planMonthlyDays;

	@Column(name="plan_monthly_trips")
	private int planMonthlyTrips;

	@Column(name="plan_name")
	private String planName;

	@Column(name="plan_tax")
	private double planTax;

	@Column(name="plan_yearly_amount")
	private double planYearlyAmount;

	@Column(name="plan_yearly_cancel")
	private int planYearlyCancel;

	@Column(name="plan_yearly_days")
	private int planYearlyDays;

	@Column(name="plan_yearly_trips")
	private int planYearlyTrips;

	private double tax;

	@Column(name="veh_type")
	private int vehType;

	@Column(name="yearly_amount")
	private double yearlyAmount;

	@Column(name="yearly_cancel")
	private int yearlyCancel;

	@Column(name="yearly_days")
	private int yearlyDays;

	@Column(name="yearly_trips")
	private int yearlyTrips;

	//bi-directional many-to-one association to TblSubcription
	@OneToMany(mappedBy="tblPlan")
	private List<Subcription> tblSubcriptions;

	public Plan() {
	}

	public long getPlanId() {
		return this.planId;
	}

	public void setPlanId(long planId) {
		this.planId = planId;
	}

	public BigInteger getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(BigInteger createdby) {
		this.createdby = createdby;
	}

	public Date getCreatedon() {
		return this.createdon;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getModifiedby() {
		return this.modifiedby;
	}

	public void setModifiedby(BigInteger modifiedby) {
		this.modifiedby = modifiedby;
	}

	public Date getModifiedon() {
		return this.modifiedon;
	}

	public void setModifiedon(Date modifiedon) {
		this.modifiedon = modifiedon;
	}

	public int getMonthlyCancel() {
		return this.monthlyCancel;
	}

	public void setMonthlyCancel(int monthlyCancel) {
		this.monthlyCancel = monthlyCancel;
	}

	public int getMonthlyDays() {
		return this.monthlyDays;
	}

	public void setMonthlyDays(int monthlyDays) {
		this.monthlyDays = monthlyDays;
	}

	public int getMonthlyTrips() {
		return this.monthlyTrips;
	}

	public void setMonthlyTrips(int monthlyTrips) {
		this.monthlyTrips = monthlyTrips;
	}

	public BigInteger getPlanCreatedby() {
		return this.planCreatedby;
	}

	public void setPlanCreatedby(BigInteger planCreatedby) {
		this.planCreatedby = planCreatedby;
	}

	public Date getPlanCreatedon() {
		return this.planCreatedon;
	}

	public void setPlanCreatedon(Date planCreatedon) {
		this.planCreatedon = planCreatedon;
	}

	public BigInteger getPlanModifiedby() {
		return this.planModifiedby;
	}

	public void setPlanModifiedby(BigInteger planModifiedby) {
		this.planModifiedby = planModifiedby;
	}

	public Date getPlanModifiedon() {
		return this.planModifiedon;
	}

	public void setPlanModifiedon(Date planModifiedon) {
		this.planModifiedon = planModifiedon;
	}

	public double getPlanMonthlyAmount() {
		return this.planMonthlyAmount;
	}

	public void setPlanMonthlyAmount(double planMonthlyAmount) {
		this.planMonthlyAmount = planMonthlyAmount;
	}

	public int getPlanMonthlyCancel() {
		return this.planMonthlyCancel;
	}

	public void setPlanMonthlyCancel(int planMonthlyCancel) {
		this.planMonthlyCancel = planMonthlyCancel;
	}

	public int getPlanMonthlyDays() {
		return this.planMonthlyDays;
	}

	public void setPlanMonthlyDays(int planMonthlyDays) {
		this.planMonthlyDays = planMonthlyDays;
	}

	public int getPlanMonthlyTrips() {
		return this.planMonthlyTrips;
	}

	public void setPlanMonthlyTrips(int planMonthlyTrips) {
		this.planMonthlyTrips = planMonthlyTrips;
	}

	public String getPlanName() {
		return this.planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public double getPlanTax() {
		return this.planTax;
	}

	public void setPlanTax(double planTax) {
		this.planTax = planTax;
	}

	public double getPlanYearlyAmount() {
		return this.planYearlyAmount;
	}

	public void setPlanYearlyAmount(double planYearlyAmount) {
		this.planYearlyAmount = planYearlyAmount;
	}

	public int getPlanYearlyCancel() {
		return this.planYearlyCancel;
	}

	public void setPlanYearlyCancel(int planYearlyCancel) {
		this.planYearlyCancel = planYearlyCancel;
	}

	public int getPlanYearlyDays() {
		return this.planYearlyDays;
	}

	public void setPlanYearlyDays(int planYearlyDays) {
		this.planYearlyDays = planYearlyDays;
	}

	public int getPlanYearlyTrips() {
		return this.planYearlyTrips;
	}

	public void setPlanYearlyTrips(int planYearlyTrips) {
		this.planYearlyTrips = planYearlyTrips;
	}

	public double getTax() {
		return this.tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public int getVehType() {
		return this.vehType;
	}

	public void setVehType(int vehType) {
		this.vehType = vehType;
	}

	public double getYearlyAmount() {
		return this.yearlyAmount;
	}

	public void setYearlyAmount(double yearlyAmount) {
		this.yearlyAmount = yearlyAmount;
	}

	public int getYearlyCancel() {
		return this.yearlyCancel;
	}

	public void setYearlyCancel(int yearlyCancel) {
		this.yearlyCancel = yearlyCancel;
	}

	public int getYearlyDays() {
		return this.yearlyDays;
	}

	public void setYearlyDays(int yearlyDays) {
		this.yearlyDays = yearlyDays;
	}

	public int getYearlyTrips() {
		return this.yearlyTrips;
	}

	public void setYearlyTrips(int yearlyTrips) {
		this.yearlyTrips = yearlyTrips;
	}

	public List<Subcription> getTblSubcriptions() {
		return this.tblSubcriptions;
	}

	public void setTblSubcriptions(List<Subcription> tblSubcriptions) {
		this.tblSubcriptions = tblSubcriptions;
	}

	public Subcription addTblSubcription(Subcription tblSubcription) {
		getTblSubcriptions().add(tblSubcription);
		tblSubcription.setTblPlan(this);

		return tblSubcription;
	}

	public Subcription removeTblSubcription(Subcription tblSubcription) {
		getTblSubcriptions().remove(tblSubcription);
		tblSubcription.setTblPlan(null);

		return tblSubcription;
	}

}