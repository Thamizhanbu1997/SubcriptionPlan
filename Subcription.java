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
	private Long id;

	@Column(name="drv_id")
	private Long drvId;
	
	@Column(name="veh_id")
	private Long vehId;
	
	@Column(name="sub_status")
	private int status;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="veh_type")
	private VehType type;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sub_start")
	private Timestamp start;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sub_end")
	private Timestamp end;

	@Column(name="sub_amount")
	private double amount;
	
	@Column(name="sub_tax")
	private double tax;


	@Column(name="sub_cancel_quota")
	private int cancelQuota;
	
	@Column(name="sub_trip_quota")
	private int tripQuota;

	
	@Column(name="sub_total")
	private double total;

	@ManyToOne
	@JoinColumn(name="plan_id")
	private Plan tblPlan;

	public Subcription() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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


	public VehType getType() {
		return type;
	}

	public void setType(VehType type) {
		this.type = type;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Timestamp getStart() {
		return start;
	}

	public void setStart(Timestamp start) {
		this.start = start;
	}

	public Timestamp getEnd() {
		return end;
	}

	public void setEnd(Timestamp end) {
		this.end = end;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public int getCancelQuota() {
		return cancelQuota;
	}

	public void setCancelQuota(int cancelQuota) {
		this.cancelQuota = cancelQuota;
	}

	public int getTripQuota() {
		return tripQuota;
	}

	public void setTripQuota(int tripQuota) {
		this.tripQuota = tripQuota;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	
	}

