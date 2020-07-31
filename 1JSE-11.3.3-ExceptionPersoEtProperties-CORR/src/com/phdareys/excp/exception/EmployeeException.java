package com.phdareys.excp.exception;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeException extends Exception {
	private ExceptionType errorType;
	private String message;
	public EmployeeException(ExceptionType errorType, String message) {
		super();
		this.errorType = errorType;
		Date currentDate = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		;
		this.message = "<"+dateFormat.format(currentDate) + "> " + errorType + " " + message;
	}
	
	public void error() {
		System.out.println (message);
		if (errorType == ExceptionType.FATAL) {
			System.out.println ("Program is OVER!!");
			System.exit(1);  
		}
	}
}
