package com.excel.demo.service;


import java.util.List;


import com.excel.demo.dto.EmployeeDto;

public interface EmployeeService {
	public EmployeeDto addEmployee(EmployeeDto employee);
	public void deleteEmployee(EmployeeDto dto);
	public List<EmployeeDto> fetchEmployee();
	public EmployeeDto updateFname(EmployeeDto dto);
	public EmployeeDto updateLname(EmployeeDto dto);
	public EmployeeDto getEmployee(EmployeeDto dto);

}
