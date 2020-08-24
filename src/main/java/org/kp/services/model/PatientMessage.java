package org.kp.services.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


public class PatientMessage {
	
	private Integer id;
	private String mg;
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'hh:mm")
	private Date timestamp;
	
	private Patient patient;
	
	public PatientMessage() {
		// TODO Auto-generated constructor stub
	}
	

	public PatientMessage(Integer id, String message, Date timestamp) {
		super();
		this.id = id;
		this.mg = message;
		this.timestamp = timestamp;
		
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMg() {
		return mg;
	}

	public void setMg(String mg) {
		this.mg = mg;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}


	@Override
	public String toString() {
		return "PatientMessage [id=" + id + ", mg=" + mg + ", timestamp=" + timestamp + "]";
	}

	
	
	
	

}
