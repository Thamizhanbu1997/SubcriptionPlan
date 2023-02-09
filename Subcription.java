package com.example.subcription;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="tbl_subcription")
@NamedQuery(name="Subcription.findAll", query="SELECT t FROM Subcription t")
public class Subcription implements Serializable {
	private static final long serialVersionUID = 1L;
	

	@Id
	@Column(name="sub_id")
	private Long subId;

	@Column(name="drv_id")
	private Long drvId;
	
	@Column(name="veh_id")
	private Long vehId;
	
	@Column(name="sub_status")
	private int subStatus;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="veh_type")
	private VehType type;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sub_start")
	private Timestamp subStart;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sub_end")
	private Timestamp subEnd;

	@Column(name="sub_amount")
	private double subAmount;
	
	@Column(name="sub_tax")
	private double subTax;


	@Column(name="sub_cancel_quota")
	private int subCancelQuota;
	
	@Column(name="sub_trip_quota")
	private int subTripQuota;

	
	@Column(name="sub_total")
	private double subTotal;

	@ManyToOne
	@JoinColumn(name="plan_id")
	private Plan tblPlan;

	public Subcription() {
	}

	public Long getSubId() {
		return subId;
	}

	public void setSubId(Long subId) {
		this.subId = subId;
	}

	public Long getDrvId() {
		return drvId;
	}

	public void setDrvId(Long drvId) {
		this.drvId = drvId;
	}

	public Long getVehId() {
		return vehId;
	}

	public void setVehId(Long vehId) {
		this.vehId = vehId;
	}

	public int getSubStatus() {
		return subStatus;
	}

	public void setSubStatus(int subStatus) {
		this.subStatus = subStatus;
	}

	public VehType getType() {
		return type;
	}

	public void setType(VehType type) {
		this.type = type;
	}

	public Timestamp getSubStart() {
		return subStart;
	}

	public void setSubStart(Timestamp subStart) {
		this.subStart = subStart;
	}

	public Timestamp getSubEnd() {
		return subEnd;
	}

	public void setSubEnd(Timestamp subEnd) {
		this.subEnd = subEnd;
	}

	public double getSubAmount() {
		return subAmount;
	}

	public void setSubAmount(double subAmount) {
		this.subAmount = subAmount;
	}

	public double getSubTax() {
		return subTax;
	}

	public void setSubTax(double subTax) {
		this.subTax = subTax;
	}

	public int getSubCancelQuota() {
		return subCancelQuota;
	}

	public void setSubCancelQuota(int subCancelQuota) {
		this.subCancelQuota = subCancelQuota;
	}

	public int getSubTripQuota() {
		return subTripQuota;
	}

	public void setSubTripQuota(int subTripQuota) {
		this.subTripQuota = subTripQuota;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public Plan getTblPlan() {
		return tblPlan;
	}

	public void setTblPlan(Plan tblPlan) {
		this.tblPlan = tblPlan;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}