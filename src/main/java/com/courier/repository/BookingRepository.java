package com.courier.repository;

import org.springframework.data.repository.CrudRepository;

import com.courier.entity.Booking;

public interface BookingRepository extends CrudRepository<Booking, Integer> {

}
