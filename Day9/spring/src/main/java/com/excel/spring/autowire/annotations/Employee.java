package com.excel.spring.autowire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	//we can use @Autowired in the 3 following ways

	@Autowired
	@Qualifier("address1") //it will search for specific bean
	private Address address;
	
//	@Autowired
//	public Employee(Address address) {
//		this.address= address;
//	}

	public Address getAddress() {
		return address;
	}
	
//	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
