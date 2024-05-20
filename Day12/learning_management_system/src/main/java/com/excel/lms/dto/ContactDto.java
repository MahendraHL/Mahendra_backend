package com.excel.lms.dto;

import com.excel.lms.enums.ContactType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder

public class ContactDto {
	
	private Integer id;

	private ContactType contactType;

	private String contactNumber;


}
