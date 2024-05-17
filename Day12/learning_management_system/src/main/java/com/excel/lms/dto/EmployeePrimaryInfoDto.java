package com.excel.lms.dto;

import com.excel.lms.enums.Designation;
import com.excel.lms.enums.EmployeeStatus;
import com.excel.lms.enums.Gender;

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
public class EmployeePrimaryInfoDto {

	private Integer id;
	private String employeeId;
	private String employeeName;
	private String dateOfJoining;
	private String datoOfBirth;
	private String email;
	private String bloodGroup;
	private Designation designation;
	private Gender gender;
	private String nationality;
	private EmployeeStatus employeeStatus;
}
