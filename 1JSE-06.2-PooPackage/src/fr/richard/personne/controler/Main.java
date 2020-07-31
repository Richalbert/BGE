package fr.richard.personne.controler;

import fr.richard.personne.model.Employe;
import fr.richard.personne.view.Affichage;

public class Main {

	public static void main(String[] args) {
		
		
		// init : inject data into model
		Employe p1,p2,p3,p4,p5,p6,p7,p8;
		
		p1 = new Employe();		
		p2 = new Employe("Martin");	
		p3 = new Employe("Dupond","Jerome");
		p4 = new Employe("Albert","Einstein","Brevet and Co");
		p5 = new Employe("Amstrong","Neil","Nasa",100_000);
		p6 = new Employe("Newton","Isaac","Royal Society",2000);
		p7 = new Employe("Eiffel","Gustave","La tour",3000);
		p8 = new Employe("Planck","Max","Nobel Institute",3500)	;	
		
		
		Employe tabEmploye [] = {p6,p7,p8};
		System.out.println(tabEmploye.length);
		
		// use model to the job
		// le traitement (calcul du salaire annuel)
		for (Employe employe : tabEmploye) {
			employe.run();	
		}
		
	
		// le controleur declanche un affichage
		new Affichage (tabEmploye);
	}

}
