package fr.richard.move.model;


/**
 * numéro+rue+code postal+ville
 * @author richard
 *
 */
public class Address {

	private int numero = 0;
	private String rue = "";
	private int cp = 0;
	private String ville;

	public Address(int numero, String rue, int cp, String ville) {
		super();
		this.numero = numero;
		this.rue = rue;
		this.cp = cp;
		this.ville = ville;
	}

	public int getCp() {
		return cp;
	}

	@Override
	public String toString() {
		//return "Address [numero=" + numero + ", rue=" + rue + ", cp=" + cp + ", ville=" + ville + "]";
		return numero + " " + rue + " " + cp + " " + ville
;
	}
	
}


