package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Designation {

	TRAINEE("TRAINER"), MENTOR("MENTOR"), DEVELOPER("DEVELOPER");
	private final String designationType;

	}



