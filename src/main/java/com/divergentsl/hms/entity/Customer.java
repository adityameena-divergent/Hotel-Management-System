package com.divergentsl.hms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Customer {

	@Id
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "contact_number")
	private String contactNumber;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "id_proof")
	private String idProof;
	
	@Column(name = "address_proof")
	private String addressProof;
	
	@Column(name = "profile_image")
	private String profileImage;
	
	@Column(name = "status")
	private String status;
	
	
}
