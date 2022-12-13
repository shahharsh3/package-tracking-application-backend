package com.courier.service;

import com.courier.dto.BookingDTO;
import com.courier.exception.InfyCourierException;

public interface BookingService {
	
	public Integer bookCourier(BookingDTO bookingDTO) throws InfyCourierException ;
	
	public Float calculateBookingAmount(Integer weight, String priority) throws InfyCourierException ;
	
	public BookingDTO getCourierDetail(Integer bookingId) throws InfyCourierException;
	
	

}
