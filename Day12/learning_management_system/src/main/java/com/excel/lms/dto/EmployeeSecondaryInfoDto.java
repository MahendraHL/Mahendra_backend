package com.excel.lms.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeSecondaryInfoDto {

	private String employeeID;
	private Integer id;

	private String panNumber;

	private String aadharNumber;

	private String fatherName;

	private String motherName;

	private String spouseName;

	private String passportNumber;

	private String maritalStatus;

}
