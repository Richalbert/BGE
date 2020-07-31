package exception;

public class FichierException extends Exception {

	
	private String message;
	private ErreurType code;

	public FichierException(String message,) {
		super();
		this.message = message;
	}
	
	public void affichage() {
		System.err.println(this.message);
	}
}
