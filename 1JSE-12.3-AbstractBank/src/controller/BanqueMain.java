package controller;

import model.BNQ;
import model.BNR;
import model.BNS;
import model.Compte;

public class BanqueMain {

	public static void main(String[] args) {

		System.out.println("creation des comptes".toUpperCase());
		Compte paul = new BNQ("Paul");		//Paul est la BNQ
		Compte alice = new BNR("Alice");	//Alice est la BNR
		Compte jean  = new BNS("Jean");		//Jean est a la BNS

		Compte [] comptes = {paul,alice,jean};
		for (Compte compte : comptes) {
			System.out.println(compte);
		}

		System.out.println();

		System.out.println("premiers versements".toUpperCase());
		for (Compte compte : comptes) {
			compte.ajouter(2000);
			System.out.println(compte);
		}

		System.out.println();

		System.out.println("retrait de 3000€".toUpperCase());
		for (Compte compte : comptes) {
			compte.retirer(3000);
			//System.out.println(compte);
		}

		System.out.println();

		System.out.println("affichage des soldes".toUpperCase());
		for (Compte compte : comptes) {
			System.out.println(compte);
		}


		
	}



}
