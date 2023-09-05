package com.example.MiniProject2.service;

import java.util.List;

import com.example.MiniProject2.model.Booking;

public interface BookingService {
	Booking createBooking(Booking bookings);
	Booking updateBooking(Booking bookings);
	List<Booking> getAllBooking();
	Booking getBookingById(int bookingid);
	void deleteBooking(int bookingid);

}
