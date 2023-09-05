package com.example.MiniProject2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BookingJwt")
public class Booking {
	@Id
	private int bookingid;
	@Column(name="price")
	private Double price;
	@Column(name="seatno")
	private int seatno;
	public Booking(int i, int j, int k, String string, int l, String string2, int m) {
		// TODO Auto-generated constructor stub
	}
	public Booking()
	{
	}
	
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getSeatno() {
		return seatno;
	}
	public void setSeatno(int seatno) {
		this.seatno = seatno;
	}
	public String getPassengername() {
		return passengername;
	}
	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getNoofpersons() {
		return noofpersons;
	}
	public void setNoofpersons(int noofpersons) {
		this.noofpersons = noofpersons;
	}
	@Column(name="passengername")
	private String passengername;
	@Column(name="mobileno")
	private long mobileno;
	@Column(name="date")
	private String date;
	@Column(name="noofpersons")
	private int noofpersons;
	
	

}
