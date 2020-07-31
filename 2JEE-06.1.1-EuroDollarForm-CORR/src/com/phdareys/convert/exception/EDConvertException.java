package com.phdareys.convert.exception;

public class EDConvertException extends Exception {
	private String mess = "";

	public EDConvertException(String mess) {
		super();
		this.mess = "-- ERROR --> " + mess;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return mess;
	}
	

}
