package com.phdareys.twoclasses.app;

import com.phdareys.twoclasses.model.Address;
import com.phdareys.twoclasses.model.Person;

public class PooPlusieursObjets {
	public static void main(String[] args) {
		/* Test POO objets imbriqu�s
		 * + objets statiques
		 * + notions packages
		 */  

		// 1- management simple
		Person jD = new Person ("Jean","Dupont", 30, 
				new Address (2, "Rue Richelieu", 75000, "Paris"));
		Person vD = new Person ("Valerie","Durant", 25, 
				new Address (2, "Rue Mage", 31000, "Toulouse"));
		System.out.println ("-------------> init:");
		System.out.println (jD);
		System.out.println (vD);
		System.out.println ("-------------> Valerie d�m�nage chez Jean: ");
		// d�m�nager chez un autre!!
		vD.setAddress(jD.getAddress());
		System.out.println (vD);

		// 2- exemple gestion data STATIQUE (trans objet en fait)
		System.out.println ("-------------> Calcul nb Haut-Garonnais:");
		Person [] pop = {
				new Person ("Gilles","Dupont", 32, 
						new Address (2, "Rue Canebi�re", 
								13000, "Marseille")),
				new Person ("Val�rie","Duparc", 20, 
						new Address (2, "Rue Pyr�n�es", 
								31800, "St-Gaudens")),
				new Person ("Virginie","Dulac", 30, 
						new Address (2, "Rue de la Paix", 
								75000, "Paris")),
				new Person ("Christine","Dubois", 40, 
						new Address (2, "Rue du Perdigu�re", 
								38000, "Grenoble")),
				new Person ("Jean","Dubois", 40, 
						new Address (2, "Rue Pargamini�res", 
								31200, "Toulouse")),
		};

		for (Person p:pop)
			System.out.println (p);
		System.out.println ("------> Il y a un d�m�nagement de Virginie chez Jean");
		pop[2].setAddress(pop[4].getAddress());

		for (Person p:pop)
			System.out.println (p);

		System.out.println ("------> Il y a au final : "+Person.getNbHautGaronnais()+ " Haut-Garonnais");
	}
}
