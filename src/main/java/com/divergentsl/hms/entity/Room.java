package com.divergentsl.hms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "room")
@Getter
@Setter
public class Room {

	@Id
	@Column(name = "room_id")
	private int roomId;
	
	@ManyToOne(targetEntity = RoomType.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "room_type_id")
	private RoomType roomType;
	
	@Column(name = "room_number")
	private String roomNumber;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "status")
	private String status;
	
}
