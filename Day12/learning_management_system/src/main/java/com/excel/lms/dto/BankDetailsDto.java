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

public class BankDetailsDto {
	
	private Integer id;

	private String accountNumber;

	private String bankName;

	private String accountType;
	
	private String ifscCode;
	
	private String branch;

	private String state;


}
