package com.chainsys.jpa.application.doctor;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Doctor")
public class Doctor {
	@Id
	private long DOC_ID;
	/*;
	private String doc_name;           //DOC_ID
	/*
	 * DOC_NAME DOB SPECIALITY CITY PHONE_NO FEES
	 * 
	 * APPOIMENT_ID
APPOIMENT_DATE
DOC_ID
PATIENT_NAME
FEES_COLLECTED
	 */
	private String DOC_NAME;  
	private Date  DOB;
	private String SPECIALITY;
	private String CITY;
	private long PHONE_NO;
	@Column(name="FEES")
	private float fees;
	
	
	public long getDOC_ID() {
		return DOC_ID;
	}


	public void setDOC_ID(long dOC_ID) {
		DOC_ID = dOC_ID;
	}


	public String getDOC_NAME() {
		return DOC_NAME;
	}


	public void setDOC_NAME(String dOC_NAME) {
		DOC_NAME = dOC_NAME;
	}


	public Date getDOB() {
		return DOB;
	}


	public void setDOB(Date dOB) {
		DOB = dOB;
	}


	public String getSPECIALITY() {
		return SPECIALITY;
	}


	public void setSPECIALITY(String sPECIALITY) {
		SPECIALITY = sPECIALITY;
	}


	public String getCITY() {
		return CITY;
	}


	public void setCITY(String cITY) {
		CITY = cITY;
	}


	public long getPHONE_NO() {
		return PHONE_NO;
	}


	public void setPHONE_NO(long pHONE_NO) {
		PHONE_NO = pHONE_NO;
	}


	public float getFees() {
		return fees;
	}


	public void setFees(float fees) {
		this.fees = fees;
	}


	@Override
	public String toString() {
		return String.format("%l, %s, %s, %s, %d, %f",DOC_ID,DOC_NAME ,DOB,SPECIALITY,CITY,PHONE_NO,fees);

}}