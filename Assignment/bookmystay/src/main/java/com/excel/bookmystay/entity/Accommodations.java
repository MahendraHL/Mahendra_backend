package com.excel.bookmystay.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "accomodation")
public class Accommodations {
	
	@Id
	@Column(name= "accommodation_id")
	private int accommodationId;
	
	private String name;
	
	private String description;
	
	@Column(name = "total_rooms")
	private int totalRooms;
	
	@Column (name = "price_per_night")
	private Double price;
	
	

}
