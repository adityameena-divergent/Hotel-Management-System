package com.divergentsl.hms.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Setter;

import lombok.Getter;

@Entity
@Table(name = "order")
@Getter
@Setter
public class Order {

	@Id
	@Column(name = "order_id")
	private int orderId;
	
	@ManyToOne
	@JoinColumn(name = "item_id")
	private Item item;
	
	@OneToOne
	@JoinColumn(name = "booking_id")
	private Booking booking;
	
	@Column(name = "order_date")
	private LocalDate orderDate;
	
	@Column(name = "quantity")
	private double quantity;
	
	@Column(name = "cost")
	private double cost;
	
	@Column(name = "status")
	private String status;
	
	
	
}
