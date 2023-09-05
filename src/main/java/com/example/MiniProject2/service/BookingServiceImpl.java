package com.example.MiniProject2.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.MiniProject2.exception.InvalidException;
import com.example.MiniProject2.model.Booking;
import com.example.MiniProject2.repository.BookingRepository;
@Service
@Transactional
public class BookingServiceImpl implements BookingService {
@Autowired
private BookingRepository brep;
@Override
public Booking createBooking(Booking bookings) {
	return brep.save(bookings);	
}
@Override
public Booking updateBooking(Booking bookings) {
	
	Optional<Booking> bookDb=this.brep.findById(bookings.getBookingid());
	if(bookDb.isPresent())
	{
		Booking bookingsUpdate=bookDb.get();
		bookingsUpdate.setBookingid(bookings.getBookingid());
		bookingsUpdate.setPrice(bookings.getPrice());
		bookingsUpdate.setSeatno(bookings.getSeatno());
		bookingsUpdate.setPassengername(bookings.getPassengername());
		bookingsUpdate.setMobileno(bookings.getMobileno());
		bookingsUpdate.setDate(bookings.getDate());
		bookingsUpdate.setNoofpersons(bookings.getNoofpersons());
		
		brep.save(bookingsUpdate);
		return bookingsUpdate;
}
	else
	{
		throw new InvalidException("Record not found with no of persons : " +bookings.getBookingid());
	}
	}
@Override
public List<Booking> getAllBooking() {
	return this.brep.findAll();
}
@Override
public Booking getBookingById(int bookingid) {
	Optional<Booking>bookDb=this.brep.findById(bookingid);
	if(bookDb.isPresent())
	{
		return bookDb.get();
	}
	else
	{
		throw new InvalidException("Record not found with booking id: " + bookingid);	
	}
}
@Override
public void deleteBooking(int bookingid) {
	Optional<Booking>bookDb=this.brep.findById(bookingid);
	if(bookDb.isPresent())
	{
		this.brep.delete(bookDb.get());
	}
	else
	{
		throw new InvalidException("Record not found with booking id : " + bookingid);		
	}
				
	}
}