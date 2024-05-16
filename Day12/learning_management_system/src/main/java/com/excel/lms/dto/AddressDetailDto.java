package com.excel.lms.dto;

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

public class AddressDetailDto {
	
	private Integer id;

	private String addressType;

	private String doorNumber;

	private String street;

	private String locality;

	private String city;

	private String state;

	private String pinCode;

	private String landMark;

}
