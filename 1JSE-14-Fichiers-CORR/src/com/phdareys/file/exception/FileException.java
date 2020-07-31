package com.phdareys.file.exception;

// classe spécialisée d'exception
// qui traite tous les cas d'erreurs ou message
public class FileException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mess;

	public FileException(String mess) {
		super();
		this.mess = mess;
	}
	public void display() {	// affichage d'une trace, pas d'erreur
		System.out.println("FILE, trace -> "+mess);
	}
	public void displayErr() {// affichage d'une erreur
		System.out.println("FILE, ERREUR ->"+mess);
	}

}
