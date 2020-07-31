package fr.richard.prj.exception;

public class PrjException extends Exception{

	private String message;
	private int code;
	
	public PrjException() {
		System.err.println("--> Exception ");
	}
	


	public PrjException(String message, int code) {
		super();
		this.message = message;
		this.code = code;
	}
	
	public void affiche() {
		System.err.println("--> Exception : " + code + " - " + message);
		
		
	}
}
