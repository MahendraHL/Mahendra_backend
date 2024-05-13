package com.excel.spring.setter;

public class Address {
	private int id;
	private String place;

	
	public Address() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", place=" + place + "]";
	}

}
