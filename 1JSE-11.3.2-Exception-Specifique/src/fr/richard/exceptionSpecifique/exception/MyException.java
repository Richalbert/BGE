package fr.richard.exceptionSpecifique.exception;

public class MyException extends Exception{

	private String message;
	private int code;
	
	public MyException() {
		System.err.println("--> Exception ");
	}
	


	public MyException(String message, int code) {
		super();
		this.message = message;
		this.code = code;
	}
	
	public void affiche() {
		System.err.println("--> Exception : " + code + " - " + message);

	}

}
