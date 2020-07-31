
package fr.bge;

import java.util.Scanner;

public class O4_pythagore {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez entrer la longueur d'un cote du triangle rectangle : ");
	
		//		String chaineNombre1 = sc.nextLine();
		//		int nombre1 = Integer.parseInt(chaineNombre1);

		int n1 = sc.nextInt();
		
		System.out.println("Veuillez entrer la longueur du second cote : ");
		
		//		String chaineNombre2 = sc.nextLine();
		//		int nombre2 = Integer.parseInt(chaineNombre2);
		
		int n2 = sc.nextInt();
		
		double hypothenuse = Math.sqrt( n1*n1 + n2*n2 );
		
		System.out.println("Vous avez saisi : " + n1 + " " + n2 );
		System.out.println("Vous avez saisi : " + n1*n1 + " " + n2*n2 );
		
		System.out.println("l'hypothenuse du triangle est : " + hypothenuse );
		
		sc.close();
	}
}
