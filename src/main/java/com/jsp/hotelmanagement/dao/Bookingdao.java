package com.jsp.hotelmanagement.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.hotelmanagement.dto.Booking;
import com.jsp.hotelmanagement.repo.Bookingrepo;

@Repository
public class Bookingdao {

	
	@Autowired
	private Bookingrepo bookingrepo;
	
	public Booking saveBooking(Booking booking) {
		return bookingrepo.save(booking);
	}
	
	
	public Booking updateBooking(Booking booking) {
		return bookingrepo.save(booking);
	}
	public Booking deleteBooking(Booking booking) {
		 bookingrepo.delete(booking);
		return booking;
	}
	public  Booking getBookingbyId(int bid) {
		if(bookingrepo.findById(bid).isPresent()) {
			return bookingrepo.findById(bid).get();
		}
		return null;
	}
	
	public Booking getBookingbycheckin(String check_in_date) {
		if(bookingrepo.getBookingbycheckin(check_in_date)!=null) {
			return bookingrepo.getBookingbycheckin(check_in_date);
		}
		return null;
	}
	
	public Booking getBookingbycheckout(String check_out_date) {
		if(bookingrepo.getBookingbycheckout(check_out_date) != null) {
			return bookingrepo.getBookingbycheckout(check_out_date);
		}return null;
	}
	
	public List<Booking>getallBookings(){
		return bookingrepo.findAll();
	}


	


	
	
	
}
