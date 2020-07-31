package fr.richard.heritage.controller;

import fr.richard.heritage.model.Pdg;
import fr.richard.heritage.model.Personne;
import fr.richard.heritage.model.PersonneMarie;
import fr.richard.heritage.model.PersonneTresInterresse;
import fr.richard.heritage.model.Salarie;

public class Main {

	public static void main(String[] args) {

		Personne moi = new Personne("Richard", 55);
		Salarie toi = new Salarie("James",45,"MI6");
		Personne lui = new Salarie("toto",22,"google");
		System.out.println("\n");
		
		Personne tab[] = { moi, toi, lui,
				new PersonneMarie("Josephine", 28, moi),
				new PersonneTresInterresse("Laeticia",40,new Pdg("Ghosn", 50,100000 ))};
		for (Personne personne : tab) {
			personne.afficher();
		}
	}


}
