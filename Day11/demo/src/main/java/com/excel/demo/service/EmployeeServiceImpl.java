package com.excel.demo.service;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.entity.Employee;
import com.excel.demo.exception.EmployeeException;
import com.excel.demo.repository.EmployeeRepository;
import com.excel.demo.util.EmployeeUtil;
import static com.excel.demo.constant.EmployeeConstants.EMPLOYEE_NOT_FOUND;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public EmployeeDto addEmployee(EmployeeDto dto) {
		Employee employee=Employee.builder().firstName(dto.getFirstName()).lastName(dto.getLastName())
			.mobileNumber(dto.getMobileNumber()).aadhar(dto.getAadhar())
			.panNumber(dto.getPanNumber()).employeeNumber(dto.getEmployeeNumber()).build();
		return EmployeeUtil.employeeToDto(employeeRepository.save(employee));
		
	}

	@Override
	public void deleteEmployee(EmployeeDto dto) {
		Optional<Employee> optional=employeeRepository.findById(dto.getId());
		if(optional.isPresent()){
			employeeRepository.delete(optional.get());
		}
		else {
			throw new EmployeeException(EMPLOYEE_NOT_FOUND);
		}
	}

	@Override
	public List<EmployeeDto> fetchEmployee() {
		return employeeRepository.findAll().stream().map(EmployeeUtil::employeeToDto).toList();
	}

	@Override
	public EmployeeDto updateFname(EmployeeDto dto) {
		Optional<Employee> optional = employeeRepository.findById(dto.getId());
		if(optional.isPresent()) {
			Employee employee =optional.get();
			Employee updatedFname=EmployeeUtil.updatedFname(employee,dto);
			return EmployeeUtil.employeeToDto(employeeRepository.save(updatedFname));
		}
		else {
			throw new EmployeeException(EMPLOYEE_NOT_FOUND);
		}
	}

	@Override
	public EmployeeDto updateLname(EmployeeDto dto) {
		Optional<Employee> optional = employeeRepository.findById(dto.getId());
		if(optional.isPresent()) {
			Employee employee =optional.get();
			Employee updatedLname=EmployeeUtil.updatedLname(employee,dto);
			return EmployeeUtil.employeeToDto(employeeRepository.save(updatedLname));
		}
		else {
			throw new EmployeeException(EMPLOYEE_NOT_FOUND);
		}
			
	}

	@Override
	public EmployeeDto getEmployee(EmployeeDto dto) {
		Optional<Employee> optional = employeeRepository.findById(dto.getId());
		if(optional.isPresent()) {
			Employee employee =optional.get();
			return EmployeeUtil.employeeToDto(employee);
		}
		else {
			throw new EmployeeException(EMPLOYEE_NOT_FOUND);
		}
	}


	

}
