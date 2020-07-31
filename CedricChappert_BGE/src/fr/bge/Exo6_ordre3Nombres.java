/*
 * *** Exo 6 ***
 * 	Q : Ecrire un programme faisant saisir trois nombres réels x, y, z à l’utilisateur et 
 *		qui les trie par ordre croissant (à la fin du déroulement du programme x ≤ y ≤ z).
 */

package fr.bge;

import java.util.Scanner;

public class Exo6_ordre3Nombres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("entrer le nombre x : ");
		int x = sc.nextInt();

		System.out.print("entrer le nombre y : ");
		int y = sc.nextInt();

		if ( y < x ) {  	// alors on permutte
			int tmp = x;
			x = y;
			y = tmp;
		} 
		//System.out.println( x + " < " + y );
		
		System.out.print("entrer le nombre z : ");
		int z = sc.nextInt();
		sc.close();
		
		if ( z < y ) {			// alors on permute
			int tmp = y;
			y = z;
			z = tmp;

			if ( y < x ) {  	// alors on permutte
				tmp = x;
				x = y;
				y = tmp;
			} 
		}
		
		System.out.println(x + " < " + y + " < " + z ); 		
	}
}

/* TEST 	10 20 30	OK
 * 			20 30 10	OK
 * 			30 10 20	OK
 * 			10 30 20	OK
 * 			30 20 10	OK
 * 			20 10 30	OK
 * */
