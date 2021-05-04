package com.divergentsl.hms.entity;

import java.time.LocalDateTime;

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
@Table(name = "reminder")
@Setter
@Getter
public class Reminder {

	@Id
	private int reminderId;
	
	@OneToOne(targetEntity = Booking.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "booking_id")
	private Booking booking;
	
	@Column(name = "reminder_type")
	private String reminderType;
	
	@Column(name = "reminder_detail")
	private String reminderDetail;
	
	@Column(name = "date_time")
	private LocalDateTime dateTime;
	
	@Column(name = "status")
	private String status;
	
}
