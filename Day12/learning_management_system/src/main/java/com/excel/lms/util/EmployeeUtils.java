package com.excel.lms.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.excel.lms.dto.AddressDetailsDto;
import com.excel.lms.dto.ContactDto;
import com.excel.lms.dto.EducationDetailsDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.ExperienceDto;
import com.excel.lms.dto.TechnicalSkillsDto;
import com.excel.lms.entity.AddressDetails;
import com.excel.lms.entity.Contact;
import com.excel.lms.entity.EducationDetails;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.entity.Experience;
import com.excel.lms.entity.TechnicalSkills;

public class EmployeeUtils {

	private EmployeeUtils() {

	}

	public static EmployeePrimaryInfo employeeDtoToEntity(EmployeePrimaryInfoDto dto) {
		return EmployeePrimaryInfo.builder().id(dto.getId()).employeeId(dto.getEmployeeId())
				.employeeName(dto.getEmployeeName()).dateOfJoining(dto.getDateOfJoining())
				.datoOfBirth(dto.getDatoOfBirth()).email(dto.getEmail()).bloodGroup(dto.getBloodGroup())
				.designation(dto.getDesignation()).gender(dto.getGender()).nationality(dto.getNationality())
				.employeeStatus(dto.getEmployeeStatus()).build();

	}

	public static List<EducationDetails> educationDtoToEntity(List<EducationDetailsDto> dtoList) {
		return dtoList.stream()
				.map(edu -> EducationDetails.builder().yearOfPassing(edu.getYearOfPassing())
						.educationType(edu.getEducationType()).specialization(edu.getSpecialization())
						.institutionName(edu.getInstitutionName()).percentage(edu.getPercentage()).state(edu.getState())
						.universityName(edu.getUniversityName()).build())
				.collect(Collectors.toList());
	}

	public static List<AddressDetails> addressDtoToEntity(List<AddressDetailsDto> addresses) {
		return addresses.stream()
				.map(e -> AddressDetails.builder().addressType(e.getAddressType())
						.doorNumber(e.getDoorNumber())
						.locality(e.getLocality())
						.street(e.getStreet())
						.city(e.getCity())
						.pinCode(e.getPinCode())
						.state(e.getState())
						.landMark(e.getLandMark()).build()).collect(Collectors.toList());

	}

	public static List<Experience> experienceDtoToEntity(List<ExperienceDto> experience) {
		return experience.stream()
				.map(e-> Experience.builder().companyName(e.getCompanyName()).dateOfJoining(e.getDateOfJoining())
						.dateOfRelieving(e.getDateOfRelieving())
						.designation(e.getDesignation())
						.yearsOfExperience(e.getYearsOfExperience())
						.location(e.getLocation()).build()).
						collect(Collectors.toList());
	}

	public static List<Contact> contactDtoToEntity(List<ContactDto> contacts) {
		return contacts.stream()
				.map(e->Contact.builder().contactType(e.getContactType())
						.contactNumber(e.getContactNumber()).build()).collect(Collectors.toList());
	}

	public static TechnicalSkills dtoToEntity(TechnicalSkillsDto skill) {
		return TechnicalSkills.builder().skillType(skill.getSkillType())
				.skillRating(skill.getSkillRating()).yearOfExperience(skill.getYearOfExperience())
				.employeePrimaryInfo(new ArrayList<>()).build();
	}
	
	

}
