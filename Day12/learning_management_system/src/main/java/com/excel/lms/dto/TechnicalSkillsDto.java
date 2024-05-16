package com.excel.lms.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class TechnicalSkillsDto {
	
	private Integer id;

	private String skillType;

	private String skillRating;

	private String yearOfExperience;

}
