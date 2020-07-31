package fr.richard.voiture.controller;

import fr.richard.voiture.model.VehiculeCitadin;
import fr.richard.voiture.model.VehiculeDeSport;
import fr.richard.voiture.model.VehiculeFamilial;
import fr.richard.voiture.model.Voiture;


public class Main {

	public static void main(String[] args) {

		Voiture v1 = new Voiture("Toyota", "Corrola", "FS-456-EW");
		Voiture v2 = new VehiculeFamilial("Peugeot", "406", "922 CE 31", 5);
		Voiture v3 = new VehiculeDeSport("Ferrari", "812 GTS", "007-MI-06",340);
		Voiture v4 = new VehiculeCitadin("Renault","Clio","TY 766 PL", 500);

		Voiture voitures [] = {v1,v2,v3,v4};
		for (Voiture voiture : voitures) {
			//System.out.println(voiture.toString());

			
//			voiture.avanceUnCoup();
//			voiture.avanceUnCoup();
//			voiture.avanceUnCoup();
			
			voiture.avancePlusieursCoups(2);
			
			
			System.out.println(voiture.getMarque() + "\tDistance parcourue: " + voiture.getDistance() + "m apres " + 
					Voiture.compteur +  " coups");


		}

	}


}
