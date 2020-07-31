package com.phdareys.excp.exception;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeException extends Exception {
	private boolean errorType;
	private String message;
	public EmployeeException(boolean errorType, String message) {
		super();
		this.errorType = errorType;
		Date currentDate = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		this.message = "<"+dateFormat.format(currentDate) + "> " + message;
	}
	
	public void error() {
		System.out.println (message);
	}
}
