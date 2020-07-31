package fr.richard.exceptionSpecifique.controller;

import fr.richard.exceptionSpecifique.exception.MyException;
import fr.richard.exceptionSpecifique.model.Salarie;

public class Main {

	public static void main(String[] args) {


		Salarie jean = new Salarie("Jean");
		try {
			jean.embaucher("Air France");
		} catch (MyException e) {
			e.affiche();
		}


		Salarie paul = new Salarie("Paul");
		try {
			paul.embaucher("Airbus");
		} catch (MyException e) {
			e.affiche();
		}

		Salarie philippe = new Salarie("Philippe");
		try {
			philippe.embaucher("Matignon");
		} catch (MyException e) {
			e.affiche();
		}
		
		
		Salarie jacques = new Salarie("Jacques","SFR");
	}

}
