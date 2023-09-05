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

import com.example.MiniProject2.model.Booking;
import com.example.MiniProject2.service.BookingService;

@RestController
public class BookingController {
@Autowired
private BookingService bservice;
@GetMapping("/bookings")
public ResponseEntity<List<Booking>>getAllBooking()
{
	return ResponseEntity.ok().body(bservice.getAllBooking());
}
@GetMapping("/bookings/{bookingid}")
public ResponseEntity<Booking>getBookingBybookingid(@PathVariable int bookingid)
{
	return ResponseEntity.ok().body(bservice.getBookingById(bookingid));
}
@PostMapping("/bookings")
public ResponseEntity<Booking>createBooking(@RequestBody Booking bookings)
{
	return ResponseEntity.ok().body(bservice.createBooking(bookings));	
}
@PutMapping("/bookings/{bookingid}")
	public ResponseEntity<Booking>updateBooking(@PathVariable int bookingid, @RequestBody Booking bookings)
	{
		bookings.setBookingid(bookingid);
		return ResponseEntity.ok().body(this.bservice.updateBooking(bookings));	
	}
@DeleteMapping("/bookings/{bookingid}")
public HttpStatus deleteBooking(@PathVariable int bookingid)
{
	this.bservice.deleteBooking(bookingid);
	return HttpStatus.OK;
}
}
