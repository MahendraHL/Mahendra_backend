package com.excel.demo.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.excel.demo.exception.EmployeeException;

@RestControllerAdvice
public class EmployeeControllerAdvice {

	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<String> noEmployeeFoundHandler(RuntimeException exe){
		return ResponseEntity.status(HttpStatus.OK).body(exe.getMessage());
	}
}
