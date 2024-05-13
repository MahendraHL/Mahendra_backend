package com.excel.bookmystay.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bookings")
public class Bookings {

	@Id
	@Column(name = "booking_id")
	private int bookingId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "email_id")
	private User email;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "accommodation_id")
	private Accommodations accommodationId;
	

	@Temporal(TemporalType.DATE)
	@Column(name = "checkin_date")
	private Date checkIn;

	@Temporal(TemporalType.DATE)
	@Column(name = "checkout_date")
	private Date checkOut;

	@Column(name = "total_price")
	private Double totalPrice;

	@Column(name = "booking_status")
	private String bookingStatus;
	
	@Temporal(TemporalType.DATE)
	@Column (name = "created_at")
	private Date created;
}
