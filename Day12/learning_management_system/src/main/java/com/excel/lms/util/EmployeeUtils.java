package com.excel.lms.util;

import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.entity.EmployeePrimaryInfo;

public class EmployeeUtils {
	
private EmployeeUtils() {
		
	}

public static EmployeePrimaryInfo employeeDtoToEntity(EmployeePrimaryInfoDto dto) {
	return EmployeePrimaryInfo.builder().id(dto.getId())
			.employeeId(dto.getEmployeeId()).employeeName(dto.getEmployeeName())
			.dateOfJoining(dto.getDateOfJoining()).datoOfBirth(dto.getDatoOfBirth())
			.email(dto.getEmail()).bloodGroup(dto.getBloodGroup())
			.designation(dto.getDesignation()).gender(dto.getGender())
			.nationality(dto.getNationality()).employeeStatus(dto.getEmployeeStatus()).build();
	
}


}
