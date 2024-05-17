package com.excel.lms.service;

import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;

public interface EmployeeService {

	public String savePrimaryInfo(EmployeePrimaryInfoDto dto);

	public String saveSecondaryInfo(EmployeeSecondaryInfoDto dto);
	
	

}
