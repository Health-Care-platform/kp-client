package org.kp.services.model;

import java.util.Date;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Size;

import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;



@Component
@Scope("prototype")
public class Patient {
	
	
	private Integer mediacalNumber;
	@Size(min = 2,message = "Must have more than 2 Char")
	private String firstName;
	
	@Size(min = 2,message = "Must have more than 2 Char")
	private String lastName;
	
	@FutureOrPresent(message = "Must be in pressent or future")
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'hh:mm")
	private Date appointment;
	
	@Size(min = 2,message = "Must have more than 2 Char")
	private String doctor;
	

	private String email;
	private String message;
	private int port;
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	
	public Patient(Integer medicalNuber, String firstName, String lastName, Date appointment, String doctor,String email,String message,int port) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.appointment = appointment;
		this.doctor = doctor;
		this.mediacalNumber = medicalNuber;
		this.email = email;
		this.message = message;
		this.port = port;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getappointment() {
		return appointment;
	}
	public void setappointment(Date appointment) {
		this.appointment = appointment;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public Integer getMediacalNumber() {
		return mediacalNumber;
	}
	public void setMediacalNumber(Integer mediacalNumber) {
		this.mediacalNumber = mediacalNumber;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String  message) {
		this. message =  message;
	}

	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

//	public Date getAppointment() {
//		return appointment;
//	}
//
//	public void setAppointment(Date appointment) {
//		this.appointment = appointment;
//	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "Patient [mediacalNumber=" + mediacalNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", appointment=" + appointment + ", doctor=" + doctor + ", messaege=" +  message + "]";
	}

		

}
