package com.divergentsl.hms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "roomtype")
@Getter
@Setter
public class RoomType {

	@Id
	@Column(name = "roomtypeid")
	private int roomTypeId;
	
	@Column(name = "roomtype")
	private String roomType;
	
	@Column(name = "rooming")
	private String rooming;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "cost")
	private double cost;
	
	@Column(name = "status")
	private String status;
	
}
