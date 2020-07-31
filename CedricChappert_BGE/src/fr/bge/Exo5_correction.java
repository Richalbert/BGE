package fr.bge;

import java.util.Scanner;

public class Exo5_correction {

	public static void main(String[] args) {
		
		// saisir 3 entiers x, y, z
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrer un entier x : ");
		int x = sc.nextInt();
		System.out.print("Entrer un entier y : ");
		int y = sc.nextInt();
		System.out.print("Entrer un entier z : ");
		int z = sc.nextInt();
		
		sc.close();
		
		System.out.println(( String.format(
				"Les entiers saisis sont \n" +
				"\tx = %s" +
				"\ty = %s" +
				"\tz = %s" , x , y, z)));
		
//		if (x <= y) {
//			
//			if (y <= z) {
//				System.out.println("Les nombres sont dans l'ordre croissant");
//			} else {
//				System.out.println("Pas croissant");
//			}
//			
//		} else {
//			System.out.println("Pas croissant");
//		}

		if ( x<=y && y<=z ) {	// x <= y <= z
			System.out.println("Les nombres sont dans l'ordre croissant");
		} else {
			System.out.println("Pas croissant");
		}
		
	}

}
