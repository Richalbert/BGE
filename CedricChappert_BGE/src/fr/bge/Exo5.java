/*
 * *** Exo 5 ***
* 	Q : Ecrire un programme faisant saisir trois entiers x, y, z à l’utilisateur, et lui indiquant si ces
*	nombres sont dans l’ordre croissant (x <= y <= z).
 */

package fr.bge;

import java.util.Scanner;

public class Exo5 {
	
//	private static int askValue() {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		//int nombre = sc.nextInt();
//		String chaine = sc.nextLine();
//		int nombre = Integer.parseInt(chaine);
//		
//		sc.close();
//		
//		return nombre;
//	}
	

	public static void main(String[] args) {
		
//		System.out.print("Entrer le 1er nombre : ");
//		int n1 = askValue();
//		
//		System.out.print("Entrer le 2nd nombre : ");
//		int n2 = askValue();
//		
//		System.out.print("Entrer le 3nd nombre : ");
//		int n3 = askValue();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrer le 1er nombre : ");
		int n1 = sc.nextInt();
		
		System.out.print("Entrer le 1er nombre : ");
		int n2 = sc.nextInt();
		
		System.out.print("Entrer le 1er nombre : ");
		int n3 = sc.nextInt();
		
		sc.close();
		
		if ( n1 <= n2  && n2 <= n3 ) {
			System.out.println("les 3 nombres saisies sont dans l'ordre ");
		} else {
			System.out.println("les nombres saisies ne sont pas entres dans l ordre ");
		}
	}
}
/* TEST
	1 2 3	OK
	2 3 1	OK
	3 1 2	OK
	1 3 2	OK
	3 2 1	OK
	2 1 3	0K
*/