package com.example.MiniProject2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FlightJwt")
public class Flightes {
	@Id
    private int flightid;
	@Column(name="source")
    private String source;
	@Column(name="destination")
	private String destination;
	@Column(name="departureTime")
	private String departureTime;
	@Column(name="arrivalTime")
	private String arrivalTime;
	@Column(name="price")
	private Double price;
	@Column(name="numberOfStops")
	private int numberOfStops;
	@Column(name="category")
	private String category;
	public int getFlightid() {
		return flightid;
	}
	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getNumberOfStops() {
		return numberOfStops;
	}
	public void setNumberOfStops(int numberOfStops) {
		this.numberOfStops = numberOfStops;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	

}
