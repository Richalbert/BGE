package controller;


import java.util.Arrays;

import model.Employe;

public class EmployeMain {

	public static void main(String[] args) {

		//j'ai un tableau de 4 employés (nom, prénom, salaire) que je mets dans un tableau.
		Employe [] employes = {
				new Employe("John", "Doe", 2000),
				new Employe("Alicia", "Murray", 4000),
				new Employe("Pat", "Trump", 2000),
				new Employe("Sylvia", "Obama", 1000),
				new Employe("Xavier", "Dubois", 2000),
				new Employe("Bill", "Aviva", 1000),
				new Employe("Cameron", "Bares", 1000),
		};

		
		Arrays.sort(employes);
		for (Employe employe : employes) {
			System.out.println(employe);
		}
	
	
//		for (Employe employe : employes) {
//			employe.compareTo(employe);
//			System.out.println(employe);
//			
//		}

	}

}
