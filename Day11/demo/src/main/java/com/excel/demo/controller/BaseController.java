package com.excel.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.response.CommonResponse;
import com.excel.demo.service.EmployeeService;
import static com.excel.demo.constant.EmployeeConstants.EMPLOYEE_DELETED_MESSAGE;
import static com.excel.demo.constant.EmployeeConstants.EMPLOYEE_ADDED_MESSAGE;
import static com.excel.demo.constant.EmployeeConstants.EMPLOYEE_FIRSTNAME_MESSAGE;
import static com.excel.demo.constant.EmployeeConstants.EMPLOYEE_LASTNAME_MESSAGE;
import static com.excel.demo.constant.EmployeeConstants.ALL_EMPLOYEE_FETCHED_MESSAGE;
import static com.excel.demo.constant.EmployeeConstants.EMPLOYEE_DETAILS_FETCHED;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class BaseController {
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/add")
	public ResponseEntity<CommonResponse<EmployeeDto>> addEmployee(@RequestBody EmployeeDto employee) {
		EmployeeDto dto=employeeService.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.OK)
				.body(CommonResponse.<EmployeeDto>builder().data(dto)
				.isError(false).message(EMPLOYEE_ADDED_MESSAGE).build());
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<CommonResponse<List<EmployeeDto>>> fetchEmployee() {
		List<EmployeeDto> employees=employeeService.fetchEmployee();
		return ResponseEntity.status(HttpStatus.OK)
				.body(CommonResponse.<List<EmployeeDto>>builder().data(employees)
				.isError(false).message(ALL_EMPLOYEE_FETCHED_MESSAGE).build());
	}

	@PutMapping("/updateFname")
	public ResponseEntity<CommonResponse<EmployeeDto>> updateFname(@RequestBody EmployeeDto dto) {
		EmployeeDto updateFname = employeeService.updateFname(dto);
		return ResponseEntity.status(HttpStatus.OK)
				.body(CommonResponse.<EmployeeDto>builder().data(updateFname)
						.isError(false).message(EMPLOYEE_FIRSTNAME_MESSAGE).build());
	}
	
	@PutMapping("/updateLname")
	public ResponseEntity<CommonResponse<EmployeeDto>> updateLname(@RequestBody EmployeeDto dto) {
		EmployeeDto updateLname = employeeService.updateLname(dto);
		return ResponseEntity.status(HttpStatus.OK)
				.body(CommonResponse.<EmployeeDto>builder().data(updateLname)
						.isError(false).message(EMPLOYEE_LASTNAME_MESSAGE).build());
	}
	
	
	@DeleteMapping("/delete")
	public ResponseEntity<CommonResponse<String>> deleteEmployee(@RequestBody EmployeeDto dto) {
		employeeService.deleteEmployee(dto);
		return ResponseEntity.status(HttpStatus.OK)
			.body(CommonResponse.<String>builder()
			.isError(false).message(EMPLOYEE_DELETED_MESSAGE).build());
	}
	
	@GetMapping("/get")
	public ResponseEntity<CommonResponse<EmployeeDto>> getEmployeeById(@RequestBody EmployeeDto dto) {
	EmployeeDto getEmployee=employeeService.getEmployee(dto);
	return ResponseEntity.status(HttpStatus.OK)
			.body(CommonResponse.<EmployeeDto>builder().data(getEmployee)
					.isError(false).message(EMPLOYEE_DETAILS_FETCHED).build());
		
	}
}
