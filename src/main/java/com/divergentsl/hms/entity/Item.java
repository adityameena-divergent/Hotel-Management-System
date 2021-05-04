package com.divergentsl.hms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "item")
@Getter
@Setter
public class Item {

	@Id
	@Column(name = "item_id")
	private int itemId;
	
	@Column(name = "item_type")
	private String itemType;
	
	@Column(name = "item_name")
	private String itemName;
	
	@Column(name = "item_cost")
	private double itemCost;
	
	@Column(name = "item_details")
	private String itemDetails;
	
	@Column(name = "status")
	private String status;
	
}
