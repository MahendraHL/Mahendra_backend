package com.excel.lms.service;

import com.excel.lms.dto.AddressDetailsListDto;
import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.ContactListDto;
import com.excel.lms.dto.EducationDetailsListDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.ExperienceListDto;
import com.excel.lms.dto.TechnicalSkillsListDto;

public interface EmployeeService {

	public String savePrimaryInfo(EmployeePrimaryInfoDto dto);

	public String saveSecondaryInfo(EmployeeSecondaryInfoDto dto);

	public String saveEducationDetails(EducationDetailsListDto dto);

	public String saveAddressDetails(AddressDetailsListDto dto);

	public String saveBankDetails(BankDetailsDto dto);

	public String saveExperience(ExperienceListDto dto);

	public String saveContact(ContactListDto dto);

	public String saveTechnicalSkills(TechnicalSkillsListDto dto);
	
	

}
