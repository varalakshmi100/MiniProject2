package com.example.MiniProject2.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MiniProject2.exception.InvalidException;
import com.example.MiniProject2.model.Flightes;
import com.example.MiniProject2.repository.FlightesRepository;

@Service
@Transactional
public class FlightServiceImpl implements FlightService {
	
	
	@Autowired
	private FlightesRepository frep;
	@Override
	public Flightes createFlightes(Flightes flightes)
	{
		return frep.save(flightes);
	}
	@Override
	public Flightes updateFlightes(Flightes flightes) {
	Optional<Flightes> flightDb=this.frep.findById(flightes.getFlightid());
	if(flightDb.isPresent())
	{
		Flightes flightesUpdate=flightDb.get();
		flightesUpdate.setFlightid(flightes.getFlightid());
		flightesUpdate.setSource(flightes.getSource());
		flightesUpdate.setDestination(flightes.getDestination());
		flightesUpdate.setDepartureTime(flightes.getDepartureTime());
		flightesUpdate.setArrivalTime(flightes.getArrivalTime());
		flightesUpdate.setPrice(flightes.getPrice());
		flightesUpdate.setNumberOfStops(flightes.getNumberOfStops());
		flightesUpdate.setCategory(flightes.getCategory());
		
		frep.save(flightesUpdate);
		return flightesUpdate;
	}	
	else
	{
		throw new InvalidException("Record not found with id : " +flightes.getFlightid());
	}
	}
	@Override
	public List<Flightes> getAllFlightes() {

		return this.frep.findAll();
	}
	@Override
	public Flightes getFlightesById(int flightid) {
		Optional<Flightes>flightDb=this.frep.findById(flightid);
		if(flightDb.isPresent())
		{
			return flightDb.get();
		}
		else
		{
			throw new InvalidException("Record not found with id : " + flightid);	
		}
	}
	@Override
	public void deleteFlightes(int flightid) {
		Optional<Flightes>flightDb=this.frep.findById(flightid);
		if(flightDb.isPresent())
		{
			this.frep.delete(flightDb.get());
		}
		else
		{
			throw new InvalidException("Record not found with id : " + flightid);		
		}
					
		}
	}



