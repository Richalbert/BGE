package fr.bge;

import java.util.Scanner;

public class Exo10_horloge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Entrer l heure : ");
		int heure;
		heure = sc.nextInt();
			
		if ( heure < 0 || heure > 23 ) {
			System.err.print("L'heure est fausse : doit etre compris entre 0 et 23");
			System.exit(1);
		}
		
		System.out.println("Entrer les minutes : ");
		int minute;
		minute = sc.nextInt();
		
		sc.close();
		
		if ( minute < 0 || minute > 59 ) {
			System.err.println("Les minutes sont fausses : doit etre compris entre 0 et 59");
			System.exit(2);
		}

		int temps = heure * 60 + minute;
		temps ++;
		
		heure = ( temps / 60 ) % 24;
		minute = temps % 60;
		
//		String m;
//		if (minute < 10 ) {
//			m = "0" + minute;
//		} else {
//			m = Integer.toString(minute);
//		}
//		System.out.println(h + ":" + m);
//
//		System.out.println(String.format("%2s", heure));
//			
		
		// operateur ternaire
		// if CONDITION ? si Vrai : sinon
		String h = ( heure < 10 ) ? "0" + heure : Integer.toString(heure) ;
		String m = ( minute< 10 ) ? "0" + minute: Integer.toString(minute);
		System.out.println(h + ":" + m);
	}
}

/* TEST
 * 		hh	mm
 * 		0	59		OK
 * 		12	35		OK
 * 		23	59		OK
 * 
 * */
