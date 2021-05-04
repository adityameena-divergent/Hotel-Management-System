package com.divergentsl.hms.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "booking")
@Getter
@Setter
public class Booking {

	@Id
	private int bookingId;
	
	@OneToOne(targetEntity = Customer.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "room_id")
	private List<Room> room;
	
	@ManyToOne(targetEntity = Customer.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@Column(name = "booking_date")
	private LocalDate date;
	
	@Column(name = "check_in")
	private LocalDateTime checkIn;
	
	@Column(name = "check_out")
	private LocalDateTime checkOut;
	
	@Column(name = "status")
	private String status;
	
}
