package com.excel.lms.dto;

import com.excel.lms.enums.AddressType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class AddressDetailsDto {

	private Integer id;
	private AddressType addressType;
	private String doorNumber;
	private String street;
	private String locality;
	private String city;
	private String state;
	private String pinCode;
	private String landMark;

}
