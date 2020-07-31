package fr.richard.move.model;

public class Person {

	private static final int TOULOUSE = 31;
	
	private String prenom = "";
	private int age = 0;
	private Address addresse = null;
	//private Tel [] tels;				// chaque personnes possedent plusieurs numero de telephone

	private static int nbToulousain = 0;	// appartient a la classe -> Pesrson.nbToulousain
	
	
	public Person(String prenom, int age, Address addresse) {
		super();
		this.prenom = prenom;
		this.age = age;
		//this.addresse = addresse;
		setAddresse(addresse);
	}

	public Address getAddresse() {
		return this.addresse;
	}

	/**
	 * a chaque fois que l on modifie l adresse on verifie si 
	 * on est de la Toulouse
	 * 
	 * TODO si on demenage de Toulouse il faut decrementer
	 * 
	 * @param addresse
	 */
	public void setAddresse(Address addresse) {
		this.addresse = addresse;
		if (( (int) (this.addresse.getCp() / 1000) ) == TOULOUSE) {
			Person.nbToulousain++;
			System.out.println("-> " + this.prenom + " habite Toulouse");
		}
	}


	@Override
	public String toString() {
		//return "Person [prenom=" + prenom + ", age=" + age + ", addresse=" + addresse + "]";
		return "Person [" + prenom + ", age=" + age + ", addresse=" + addresse + "]";
	}


	public static int getNbToulousain() {
		return nbToulousain;
	}





}
