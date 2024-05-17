package com.excel.lms.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.repository.EmployeeRepository;
import com.excel.lms.service.EmployeeService;
import com.excel.lms.util.EmployeeUtils;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public String savePrimaryInfo(EmployeePrimaryInfoDto dto) {
		
		if(!employeeRepository.findByEmployeeId(dto.getEmployeeId()).isPresent()) {
			
			EmployeePrimaryInfo primaryInfo =EmployeeUtils.employeeDtoToEntity(dto);
			EmployeePrimaryInfo employee = employeeRepository.save(primaryInfo);
			return employee.getEmployeeId();
			
		}
		
		return null;
	}

	@Override
	public String saveSecondaryInfo(EmployeeSecondaryInfoDto dto) {
		Optional<EmployeePrimaryInfo> optionalEmployees =employeeRepository.findByEmployeeId(dto.getEmployeeID());
		
		
		return null;
	}

}
