package com.courier.dto;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;

public class BookingDTO {

	private Integer bookingId;

	@NotNull(message = "{Weight is mandatory}")
	@Min(value = 30, message = "{Please enter weight above 30 grams}")
	private Integer weight;
	
	private LocalDate bookingDate;
	
	@NotNull(message = "{Source is mandatory}")
	@Pattern(regexp = "[a-zA-Z0-9 ]*", message = "{Enter source in valid format}")
	private String source;
	
	@NotNull(message = "{Destination is mandatory}")
	@Pattern(regexp = "[a-zA-Z0-9 ]*", message = "{Enter destination in valid format}")
	private String destination;

	@NotNull(message = "{Priority is mandatory}")
	@Pattern(regexp = "[LOW | MEDIUM | HIGH]", message = "{Priority can either be LOW, MEDIUM or HIGH}")
	private String priority;
	
	private Float bookingAmount;

	@Null(message = "Please do not set status")
	private CourierStatus status;

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public Float getBookingAmount() {
		return bookingAmount;
	}

	public void setBookingAmount(Float bookingAmount) {
		this.bookingAmount = bookingAmount;
	}

	public CourierStatus getStatus() {
		return status;
	}

	public void setStatus(CourierStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "BookingDTO [bookingId=" + bookingId + ", weight=" + weight + ", bookingDate=" + bookingDate
				+ ", source=" + source + ", destination=" + destination + ", priority=" + priority + ", bookingAmount="
				+ bookingAmount + ", status=" + status + "]";
	}

}
