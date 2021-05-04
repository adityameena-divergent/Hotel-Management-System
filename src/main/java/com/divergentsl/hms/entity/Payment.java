package com.divergentsl.hms.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "payment")
@Getter
@Setter
public class Payment {

	@Id
	private int paymentId;
	
	@OneToOne(targetEntity = Booking.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "booking_id")
	private Booking booking;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "amount")
	private double amount;
	
	@Column(name = "payment_type")
	private String paymentType;
	
	@Column(name = "payment_detail")
	private String paymentDetail;
	
	@Column(name = "payment_date")
	private LocalDate paymentDate;
	
	@Column(name = "status")
	private String status;
	
}
