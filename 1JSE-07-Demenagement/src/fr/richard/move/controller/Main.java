package fr.richard.move.controller;

import fr.richard.move.model.Address;
import fr.richard.move.model.Person;

public class Main {

	public static void main(String[] args) {
		
		
		Person paul     = new Person( "Paul", 25, new Address(16, "rue de la gare", 31000, "Toulouse"));
		Person virginie = new Person("Virginie", 26, new Address(4, "avenue de la Tour",81000, "Albi"));
		
		Person [] personnes = {paul,virginie};
		
		for (Person person : personnes) {
			System.out.println(person.toString());
		}
		
		System.out.println("\nvirginie demenage chez paul\n");		
		virginie.setAddresse(paul.getAddresse());
	
		for (Person person : personnes) {
			System.out.println(person.toString());
		}
		
		Person [] tabPerson = {
				new Person("Simon1", 25, new Address(16, "rue de la gare", 31000, "Toulouse")),
				new Person("Karla2", 26, new Address(4, "avenue de la Tour",81000, "Albi")),
				new Person("Karla3", 26, new Address(4, "avenue de la Tour",81000, "Albi")),
				new Person("Simon4", 25, new Address(16, "rue de la gare", 31000, "Toulouse")),
				new Person("Karla5", 26, new Address(4, "avenue de la Tour",81000, "Albi")),
				new Person("Karla6", 26, new Address(4, "avenue de la Tour",81000, "Albi")),
				new Person("Simon7", 25, new Address(16, "rue de la gare", 31000, "Toulouse")),
				new Person("Karla8", 26, new Address(4, "avenue de la Tour",81000, "Albi")),
				new Person("Karla3", 26, new Address(4, "avenue de la Tour",81000, "Albi"))
		};
		
		
		System.out.println("\nIl y a " + Person.getNbToulousain() + " toulousains");
		
		
	}

}
