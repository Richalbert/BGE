package fr.bge.tiana.fichier.exception;

import fr.bge.tiana.fichier.model.ErreurType;

@SuppressWarnings("serial")
public class ExceptionFichiers extends Exception {

	private ErreurType type;
	private String message;

	public ExceptionFichiers(ErreurType type, String message) {
		super();
		this.type = type;
		this.message = message;
	}

	public void afficheMessage(){
		System.out.println("<<" + this.type + ">> :: " + this.message);
	}
}
