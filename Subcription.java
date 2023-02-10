package com.example.subcription;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="subcription")
@NamedQuery(name="Subcription.findAll", query="SELECT t FROM Subcription t")
public class Subcription implements Serializable {
	private static final long serialVersionUID = 1L;
	

	@Id
	@Column(name="sub_id")
	private Long id;

	@Column(name="drv_id")
	private Long driverId;
	
	@Column(name="veh_id")
	private Long vehicleId;
	
	@Column(name="sub_status")
	private int status;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="veh_type")
	private VehicleType type;
	
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
	private Plan plan;

	public Subcription() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Long getDriverId() {
		return driverId;
	}

	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}

	public Long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
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

