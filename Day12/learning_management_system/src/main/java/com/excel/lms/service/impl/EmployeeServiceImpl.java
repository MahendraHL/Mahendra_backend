package com.excel.lms.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.lms.dto.AddressDetailsListDto;
import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.ContactListDto;
import com.excel.lms.dto.EducationDetailsListDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.ExperienceListDto;
import com.excel.lms.dto.TechnicalSkillsListDto;
import com.excel.lms.entity.AddressDetails;
import com.excel.lms.entity.BankDetails;
import com.excel.lms.entity.Contact;
import com.excel.lms.entity.EducationDetails;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.entity.EmployeeSecondaryInfo;
import com.excel.lms.entity.Experience;
import com.excel.lms.entity.TechnicalSkills;
import com.excel.lms.repository.EmployeeRepository;
import com.excel.lms.repository.TechnicalSkillsRepository;
import com.excel.lms.service.EmployeeService;
import com.excel.lms.util.EmployeeUtils;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private TechnicalSkillsRepository skillsRepository;

	@Override
	public String savePrimaryInfo(EmployeePrimaryInfoDto dto) {

		if (!employeeRepository.findByEmployeeId(dto.getEmployeeId()).isPresent()) {

			EmployeePrimaryInfo primaryInfo = EmployeeUtils.employeeDtoToEntity(dto);
			EmployeePrimaryInfo employee = employeeRepository.save(primaryInfo);
			return employee.getEmployeeId();

		}

		return null;
	}

	@Override
	public String saveSecondaryInfo(EmployeeSecondaryInfoDto dto) {
		Optional<EmployeePrimaryInfo> optionalEmployees = employeeRepository.findByEmployeeId(dto.getEmployeeID());
		if (optionalEmployees.isPresent()) {
			EmployeePrimaryInfo primaryInfo = optionalEmployees.get();
			if (primaryInfo.getEmployeeSecondaryInfo() == null) {
				EmployeeSecondaryInfo secondaryInfo = EmployeeSecondaryInfo.builder().panNumber(dto.getPanNumber())
						.aadharNumber(dto.getAadharNumber()).fatherName(dto.getFatherName())
						.motherName(dto.getMotherName()).spouseName(dto.getSpouseName())
						.passportNumber(dto.getPassportNumber()).maritalStatus(dto.getMaritalStatus()).build();
				primaryInfo.setEmployeeSecondaryInfo(secondaryInfo);
				secondaryInfo.setEmployeePrimaryInfo(primaryInfo);
				return employeeRepository.save(primaryInfo).getEmployeeId();
			} else {
				primaryInfo.getEmployeeSecondaryInfo().getId();
				EmployeeSecondaryInfo.builder().panNumber(dto.getPanNumber()).aadharNumber(dto.getAadharNumber())
						.fatherName(dto.getFatherName()).motherName(dto.getMotherName()).spouseName(dto.getSpouseName())
						.passportNumber(dto.getPassportNumber()).maritalStatus(dto.getMaritalStatus()).build();
				return employeeRepository.save(primaryInfo).getEmployeeId();
			}
		}
		return "Employee is not found";
	}

	@Override
	public String saveEducationDetails(EducationDetailsListDto dto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if (optional.isPresent()) {
			EmployeePrimaryInfo primaryInfo = optional.get();
			List<EducationDetails> educationDetails = EmployeeUtils.educationDtoToEntity(dto.getEducation());
			primaryInfo.setEducationDetails(educationDetails);
			educationDetails.stream().forEach(x -> x.setEmployeePrimaryInfo(primaryInfo));
			return employeeRepository.save(primaryInfo).getEmployeeId();
		}
		return null;
	}

	@Override
	public String saveAddressDetails(AddressDetailsListDto dto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if (optional.isPresent()) {
			EmployeePrimaryInfo primaryInfo = optional.get();
			List<AddressDetails> addressDetails = EmployeeUtils.addressDtoToEntity(dto.getAddresses());
			primaryInfo.setAddress(addressDetails);
			addressDetails.stream().forEach(x -> x.setEmployeePrimaryInfo(primaryInfo));
			return employeeRepository.save(primaryInfo).getEmployeeId();
		}
		return null;
	}

	@Override
	public String saveBankDetails(BankDetailsDto dto) {
		Optional<EmployeePrimaryInfo> optionalEmployees = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if (optionalEmployees.isPresent()) {
			EmployeePrimaryInfo primaryInfo = optionalEmployees.get();
			if (primaryInfo.getBankDetails() == null) {
				BankDetails bankDetails = BankDetails.builder().accountType(dto.getAccountType())
						.accountNumber(dto.getAccountNumber()).bankName(dto.getBankName()).ifscCode(dto.getIfscCode())
						.branch(dto.getBranch()).state(dto.getState()).build();
				primaryInfo.setBankDetails(bankDetails);
				bankDetails.setEmployeePrimaryInfo(primaryInfo);
				return employeeRepository.save(primaryInfo).getEmployeeId();
			} else {
				primaryInfo.getBankDetails().getId();
				BankDetails.builder().accountNumber(dto.getAccountNumber()).accountType(dto.getAccountType())
						.bankName(dto.getBankName()).branch(dto.getBranch()).ifscCode(dto.getIfscCode())
						.state(dto.getState()).build();
				return employeeRepository.save(primaryInfo).getEmployeeId();

			}
		}
		return "Employee not found";

	}

	@Override
	public String saveExperience(ExperienceListDto dto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if (optional.isPresent()) {
			EmployeePrimaryInfo primaryInfo = optional.get();
			List<Experience> experience = EmployeeUtils.experienceDtoToEntity(dto.getExperience());
			primaryInfo.setExperiences(experience);
			;
			experience.stream().forEach(x -> x.setEmployeePrimaryInfo(primaryInfo));
			return employeeRepository.save(primaryInfo).getEmployeeId();
		}
		return null;
	}

	@Override
	public String saveContact(ContactListDto dto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if (optional.isPresent()) {
			EmployeePrimaryInfo primaryInfo = optional.get();
			List<Contact> contact = EmployeeUtils.contactDtoToEntity(dto.getContacts());
			primaryInfo.setContact(contact);
			;
			contact.stream().forEach(x -> x.setEmployeePrimaryInfo(primaryInfo));
			return employeeRepository.save(primaryInfo).getEmployeeId();
		}
		return null;
	}

	@Override
	public String saveTechnicalSkills(TechnicalSkillsListDto dto) {
		Optional<EmployeePrimaryInfo> optionalEmployees = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if (optionalEmployees.isPresent()) {
			EmployeePrimaryInfo primaryInfo = optionalEmployees.get();
			List<TechnicalSkills> skills =dto.getSkills().stream().map(skill ->{
				Optional<TechnicalSkills> optional =skillsRepository
						.findBySkillTypeAndSkillRatingAndYearOfExperience(skill.getSkillType(), skill.getSkillRating(), skill.getYearOfExperience());
				return optional.isPresent()?optional.get():EmployeeUtils.dtoToEntity(skill);

			}).collect(Collectors.toList());
			
			if(primaryInfo.getTechnicalSkills() != null) {
				primaryInfo.getTechnicalSkills().clear();
			}
			skills.stream().forEach(x ->{
				if(!x.getEmployeePrimaryInfo().contains(primaryInfo))
					x.getEmployeePrimaryInfo().add(primaryInfo);
			});
			primaryInfo.setTechnicalSkills(skills);
			employeeRepository.save(primaryInfo);
			return primaryInfo.getEmployeeId();

		}
		return null;
	}

}
