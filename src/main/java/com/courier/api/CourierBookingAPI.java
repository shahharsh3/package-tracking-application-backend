package com.courier.api;


import javax.validation.Valid;
import javax.validation.constraints.Max;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.courier.dto.BookingDTO;
import com.courier.exception.InfyCourierException;
import com.courier.service.BookingService;

@RestController
@RequestMapping(value = "/courier")
@Validated
public class CourierBookingAPI {

	@Autowired
	private BookingService bookingService;

	@Autowired
	private Environment environment;

	@PostMapping(value = "/courier")
	public ResponseEntity<String> bookCourier(@Valid @RequestBody BookingDTO bookingDTO) throws InfyCourierException {
		int bookingId = bookingService.bookCourier(bookingDTO);
		String booking = environment.getProperty("API.BOOKING_SUCCESS") + bookingId;
		return new ResponseEntity<String>(booking, HttpStatus.CREATED);

	}

	@GetMapping(value = "/courier/{bookingId}")
	public ResponseEntity<BookingDTO> getCourierDetails(@PathVariable @Max(value = 5, message = "Booking Id should be of 5 digits") Integer bookingId) throws InfyCourierException {
		BookingDTO bookingDTO = bookingService.getCourierDetail(bookingId);
		return new ResponseEntity<BookingDTO>(bookingDTO, HttpStatus.OK);
	}

}
