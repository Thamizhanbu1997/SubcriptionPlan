package com.example.subcription;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;



@Entity
@Table(name="tbl_subcription")
@NamedQuery(name="Subcription.findAll", query="SELECT t FROM Subcription t")
public class Subcription implements Serializable {
	private static final long serialVersionUID = 1L;
	

	@Id
	@Column(name="sub_id")
	private long subId;

	@Column(name="drv_id")
	private BigInteger drvId;

	@Column(name="sub_amount")
	private double subAmount;

	@Column(name="sub_cancel_quota")
	private int subCancelQuota;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sub_end")
	private Date subEnd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sub_start")
	private Date subStart;

	@Column(name="sub_status")
	private int subStatus;

	@Column(name="sub_tax")
	private double subTax;

	@Column(name="sub_total")
	private double subTotal;

	@Column(name="sub_trip_quota")
	private int subTripQuota;

	@Column(name="veh_id")
	private BigInteger vehId;

	@Column(name="veh_type")
	private int vehType;

	//bi-directional many-to-one association to TblPlan
	@ManyToOne
	@JoinColumn(name="plan_id")
	private Plan tblPlan;

	public Subcription() {
	}

	public long getSubId() {
		return this.subId;
	}

	public void setSubId(long subId) {
		this.subId = subId;
	}

	public BigInteger getDrvId() {
		return this.drvId;
	}

	public void setDrvId(BigInteger drvId) {
		this.drvId = drvId;
	}

	public double getSubAmount() {
		return this.subAmount;
	}

	public void setSubAmount(double subAmount) {
		this.subAmount = subAmount;
	}

	public int getSubCancelQuota() {
		return this.subCancelQuota;
	}

	public void setSubCancelQuota(int subCancelQuota) {
		this.subCancelQuota = subCancelQuota;
	}

	public Date getSubEnd() {
		return this.subEnd;
	}

	public void setSubEnd(Date subEnd) {
		this.subEnd = subEnd;
	}

	public Date getSubStart() {
		return this.subStart;
	}

	public void setSubStart(Date subStart) {
		this.subStart = subStart;
	}

	public int getSubStatus() {
		return this.subStatus;
	}

	public void setSubStatus(int subStatus) {
		this.subStatus = subStatus;
	}

	public double getSubTax() {
		return this.subTax;
	}

	public void setSubTax(double subTax) {
		this.subTax = subTax;
	}

	public double getSubTotal() {
		return this.subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public int getSubTripQuota() {
		return this.subTripQuota;
	}

	public void setSubTripQuota(int subTripQuota) {
		this.subTripQuota = subTripQuota;
	}

	public BigInteger getVehId() {
		return this.vehId;
	}

	public void setVehId(BigInteger vehId) {
		this.vehId = vehId;
	}

	public int getVehType() {
		return this.vehType;
	}

	public void setVehType(int vehType) {
		this.vehType = vehType;
	}

	public Plan getTblPlan() {
		return this.tblPlan;
	}

	public void setTblPlan(Plan tblPlan) {
		this.tblPlan = tblPlan;
	}

}