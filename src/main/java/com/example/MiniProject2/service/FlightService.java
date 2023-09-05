package com.example.MiniProject2.service;

import java.util.List;

import com.example.MiniProject2.model.Flightes;

public interface FlightService {
	Flightes createFlightes(Flightes flightes);
	Flightes updateFlightes(Flightes flightes);
	List<Flightes> getAllFlightes();
	Flightes getFlightesById(int flightid);
	void deleteFlightes(int flightid);

}
