package com.chainsys.jpa.application.doctor;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Doctor")
public class Doctor {
	@Id
	private int doctor_Id;
	private String name;
	private Date dob;
	private String speciality;
	private String city;
	private long phone_number;
	@Column(name="std_fees")
	private float std_fees;

	/*
	 * @OneToMany private List<Appointment> appointments; public List<Appointment>
	 * getAppointments(){ return this.appointments; }
	 */
	public int getDoc_id() {
		return doctor_Id;
	}
	public void setDoc_id(int doc_id) {
		this.doctor_Id = doc_id;
	}
	public String getDoc_name() {
		return name;
	}
	public void setDoc_name(String doc_name) {
		this.name = doc_name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhone_no() {
		return phone_number;
	}
	public void setPhone_no(long phone_no) {
		this.phone_number = phone_no;
	}
	public float getFees() {
		return std_fees;
	}
	public void setFees(float fees) {
		this.std_fees = fees;
	}
	@Override
	public String toString() {
		return String.format("%d,%s,%s,%s,%s,%d,%d","doctor_Id","name","dob","speciality","city","phone_number","std_fees");
	}
}
