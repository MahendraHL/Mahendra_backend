package com.excel.demo.util;

import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.entity.Employee;

public class EmployeeUtil {
	
	private EmployeeUtil() {
		
	}
	
	public static EmployeeDto employeeToDto(Employee employee) {
		return EmployeeDto.builder().id(employee.getId()).firstName(employee.getFirstName()).lastName(employee.getLastName())
					.mobileNumber(employee.getMobileNumber()).aadhar(employee.getAadhar()).panNumber(employee.getPanNumber())
					.employeeNumber(employee.getEmployeeNumber()).build();
	}

	public static Employee updatedFname(Employee employee, EmployeeDto dto) {
		employee.setFirstName(dto.getFirstName());
		return employee;
	}

	public static Employee updatedLname(Employee employee, EmployeeDto dto) {
		employee.setLastName(dto.getLastName());
		return employee;
	}

}
