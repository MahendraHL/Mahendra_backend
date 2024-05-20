package com.excel.lms.controller;

import static com.excel.lms.constant.EmployeeConstants.EMPLOYEE_PRIMARY_INFO_SAVED;
import static com.excel.lms.constant.EmployeeConstants.EMPLOYEE_SECONDARY_INFO_SAVED;
import static com.excel.lms.constant.EmployeeConstants.EMPLOYEE_EDUCATION_DETAILS_SAVED;
import static com.excel.lms.constant.EmployeeConstants.EMPLOYEE_ADDRESS_DETAILS_SAVED;
import static com.excel.lms.constant.EmployeeConstants.EMPLOYEE_BANK_DETAILS_SAVED;
import static com.excel.lms.constant.EmployeeConstants.EMPLOYEE_TECHNICAL_SKILLS_DETAILS_SAVED;
import static com.excel.lms.constant.EmployeeConstants.EMPLOYEE_EXXPERIENCE_DETAILS_SAVED;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excel.lms.dto.AddressDetailsListDto;
import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.ContactListDto;
import com.excel.lms.dto.EducationDetailsListDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.ExperienceListDto;
import com.excel.lms.dto.TechnicalSkillsListDto;
import com.excel.lms.response.CommonResponse;
import com.excel.lms.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/employee")
public class EmployeeRegisterController {
	
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/primaryinfo")
	public ResponseEntity<CommonResponse<String>> 
	addEmployeePrimaryInfo(@RequestBody EmployeePrimaryInfoDto dto){
		String employeeId = employeeService.savePrimaryInfo(dto);		
		
		return ResponseEntity.status(HttpStatus.OK)
				.body(CommonResponse.<String>builder().data(employeeId)
				.isError(false).message(EMPLOYEE_PRIMARY_INFO_SAVED).build());
		
	}
	
	@PostMapping("/secondaryinfo")
	public ResponseEntity<CommonResponse<String>> addEmployeeSecondaryInfo(@RequestBody EmployeeSecondaryInfoDto dto) {
		String employeeId = employeeService.saveSecondaryInfo(dto);	
		return ResponseEntity.status(HttpStatus.OK)
				.body(CommonResponse.<String>builder().data(employeeId)
				.isError(false).message(EMPLOYEE_SECONDARY_INFO_SAVED).build());
	}
	
	@PostMapping("/education")
	public ResponseEntity<CommonResponse<String>> addEducationDetails(@RequestBody EducationDetailsListDto dto) {
		String employeeId = employeeService.saveEducationDetails(dto);	
		return ResponseEntity.status(HttpStatus.OK)
				.body(CommonResponse.<String>builder().data(employeeId)
				.isError(false).message(EMPLOYEE_EDUCATION_DETAILS_SAVED).build());
	}
	
	@PostMapping("/address")
	public ResponseEntity<CommonResponse<String>> addAddressDetails(@RequestBody AddressDetailsListDto dto) {
		String employeeId = employeeService.saveAddressDetails(dto);	
		return ResponseEntity.status(HttpStatus.OK)
				.body(CommonResponse.<String>builder().data(employeeId)
				.isError(false).message(EMPLOYEE_ADDRESS_DETAILS_SAVED).build());
	}
	
	@PostMapping("/bank")
	public ResponseEntity<CommonResponse<String>> addBankDetails(@RequestBody BankDetailsDto dto) {
		String employeeId = employeeService.saveBankDetails(dto);	
		return ResponseEntity.status(HttpStatus.OK)
				.body(CommonResponse.<String>builder().data(employeeId)
				.isError(false).message(EMPLOYEE_BANK_DETAILS_SAVED).build());
		
	}
	
	
	@PostMapping("/skill")
	public ResponseEntity<CommonResponse<String>> addTechnicalSkill(@RequestBody TechnicalSkillsListDto dto){
		String employeeId= employeeService.saveTechnicalSkills(dto);
		return ResponseEntity.status(HttpStatus.OK)
				.body(CommonResponse.<String>builder().data(employeeId)
				.isError(false).message(EMPLOYEE_TECHNICAL_SKILLS_DETAILS_SAVED).build());
		
	}
	
	@PostMapping("/experience")
	public ResponseEntity<CommonResponse<String>> addExperience(@RequestBody ExperienceListDto dto) {
		String employeeId = employeeService.saveExperience(dto);	
		return ResponseEntity.status(HttpStatus.OK)
				.body(CommonResponse.<String>builder().data(employeeId)
				.isError(false).message(EMPLOYEE_EXXPERIENCE_DETAILS_SAVED).build());
		
	}
	
	@PostMapping("/contact")
	public ResponseEntity<CommonResponse<String>> addContact(@RequestBody ContactListDto dto) {
		String employeeId = employeeService.saveContact(dto);	
		return ResponseEntity.status(HttpStatus.OK)
				.body(CommonResponse.<String>builder().data(employeeId)
				.isError(false).message(EMPLOYEE_EXXPERIENCE_DETAILS_SAVED).build());
		
	}

}
