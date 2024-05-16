package com.excel.lms.entity;

import com.excel.lms.enums.AccountType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bank_details")
@Builder

public class BankDetails {
	
	@Column(name = "bank_details_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "account_number")
	private String accountNumber;

	@Column(name = "bank_name")
	private String bankName;

	@Enumerated(EnumType.STRING)
	@Column(name = "account_type")
	private AccountType accountType;
	
	@Column(name = "ifsc_code")
	private String ifscCode;
	
	@Column(name = "branch")
	private String branch;

	@Column(name = "state")
	private String state;


}
