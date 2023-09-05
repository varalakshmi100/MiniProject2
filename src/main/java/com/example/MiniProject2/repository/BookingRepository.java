package com.example.MiniProject2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MiniProject2.model.Booking;


public interface BookingRepository extends JpaRepository<Booking,Integer> {

}
