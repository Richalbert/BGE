package com.phdareys.shape.exceptions;

public class ShapeException extends Exception {
	/**
	 * specialized exception in case of a bad input (int expected as in values)
	 */
	private static final long serialVersionUID = 1L;
	String errMess;

	public ShapeException(String errMess) {
		super();
		this.errMess = errMess;
	}
	
	public void display () {
		System.out.println ("<<<<<<< " + this.errMess + " >>>>>>>>");
	}
}
