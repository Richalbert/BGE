package fr.bge;

public class Cours_test_if {
	
	public static void main(String[] args) {
		int nombre = 0;
		
		if ( nombre ==  0 ) {
			System.out.println("Le nombre est egal a 0");
		} else if (nombre == 1 ) {
				System.out.println("Le nombre est egal a 1");
		} else {
			System.out.println("Le nombre n est pas egal a 0");
		}

		
		
		if ( nombre ==  0 ) {
			System.out.println("Le nombre est egal a 0");
		} else {
			if (nombre == 1 ) {
				System.out.println("Le nombre est egal a 1");
			} else {
			System.out.println("Le nombre n est pas egal a 0");
			}
		}
	}

	
	
}
