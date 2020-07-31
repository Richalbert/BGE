package controller;

import model.Citadine;
import model.Familiale;
import model.Vehicule;

//  Stocker plusieurs véhicules dans un tableau et afficher chaque véhicule ainsi que la révision!
public class AbstractMain {

	public static void main(String[] args) {
		
		Vehicule p1 = new Familiale("Citroen", "C4", "CE-922-31", 4);
		Vehicule p2 = new Familiale("Citroen", "C3", "CE-944-31", 4);
		Vehicule p3 = new Familiale("Citroen", "C2", "CE-666-31", 4);
		Vehicule p4 = new Familiale("Citroen", "C1", "CE-777-31", 4);

		Vehicule p5 = new Citadine("Peugot","406", "NB-333-77", 1000);
		Vehicule p6 = new Citadine("Peugot","504", "NB-333-77", 800);
		Vehicule p7 = new Citadine("Peugot","403", "NB-333-77", 600);
		Vehicule p8 = new Citadine("Peugot","303", "NB-333-77", 500);
		
		Vehicule [] tableauVehicule = {p1,p2,p3,p4,p5,p6,p7,p8};
		
		for (Vehicule vehicule : tableauVehicule) {
			vehicule.reviser() ;
		}
		
	}

}
