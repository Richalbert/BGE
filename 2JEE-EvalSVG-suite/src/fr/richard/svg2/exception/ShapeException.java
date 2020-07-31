package fr.richard.svg2.exception;

public class ShapeException extends Exception {
	private String mess;

	public ShapeException(String mess) {
		super();
		this.mess = mess;
	}

	public String getMessage() {
		return mess;
	}

}
