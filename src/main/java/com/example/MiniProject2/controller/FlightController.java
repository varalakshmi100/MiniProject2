package com.example.MiniProject2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.MiniProject2.model.Flightes;
import com.example.MiniProject2.service.FlightService;

@RestController
public class FlightController {
	@Autowired
	private FlightService fservice;
	@GetMapping("/flightes")
	public ResponseEntity<List<Flightes>>getAllFlightes()
	{
		return ResponseEntity.ok().body(fservice.getAllFlightes());
	}
	@GetMapping("/flightes/{flightid}")
	public ResponseEntity<Flightes>getFlightesByflightid(@PathVariable int flightid)
	{
		return ResponseEntity.ok().body(fservice.getFlightesById(flightid));
	}
	@PostMapping("/flightes")
	public ResponseEntity<Flightes>createFlightes(@RequestBody Flightes flightes)
	{
		return ResponseEntity.ok().body(fservice.createFlightes(flightes));	
	}
	@PutMapping("/flightes/{flightid}")
		public ResponseEntity<Flightes>updateFlightes(@PathVariable int flightid, @RequestBody Flightes flightes)
		{
			flightes.setFlightid(flightid);
			return ResponseEntity.ok().body(this.fservice.updateFlightes(flightes));	
		}
	@DeleteMapping("/flightes/{flightid}")
	public HttpStatus deleteFlightes(@PathVariable int flightid)
	{
		this.fservice.deleteFlightes(flightid);
		return HttpStatus.OK;
	}
	}


