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
	private BigInteger subId;

	@Column(name="drv_id")
	private BigInteger drvId;
	
	@Column(name="veh_id")
	private BigInteger vehId;
	
	@Column(name="sub_status")
	private int subStatus;
	
	@Column(name="veh_type")
	private int vehType;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sub_start")
	private Date subStart;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sub_end")
	private Date subEnd;

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

}