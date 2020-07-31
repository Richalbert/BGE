package controller;

import model.Femme;
import model.Futilable;
import model.Homme;

public class InterfaceMain {

	public static void main(String[] args) {
		Femme femme = new Femme();
		Futilable homme = new Homme();
		
	
		femme.danser();
		homme.courrir();
		
		
		Futilable []  tab = {femme, homme };
		for (Futilable f : tab) {
			f.chanter();
		}
	}
}
