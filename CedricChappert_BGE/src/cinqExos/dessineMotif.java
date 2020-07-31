package cinqExos;

import java.util.Scanner;

public class dessineMotif {

	/*
	 * 	Q : écrire un programme qui demande à l’utilisateur de saisir un entier 
	 * 	positif inférieur à 20, puis afficher ça :
 	 *	X0X0X0X0X0
   	 *  0X0X0X0X0X
  	 *  X0X0X0X0X0
     *  0X0X0X0X0X
 	 *  X0X0X0X0X0
 	 *  0X0X0X0X0X
 	 *  X0X0X0X0X0
 	 *  0X0X0X0X0X
 	 *  X0X0X0X0X0
     *  0X0X0X0X0X
     *  si l utilisateur a saisi 10
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez un entier :");
		int entier = sc.nextInt();
		
		String motif = "";
		
		for (int i = 1; i < entier + 1; i++) {
			if (i % 2 == 0 ) {
				motif += "0";
			} else {
				motif += "X";
			}
		}
		
		System.out.println(motif);
		
		for (int i = 0 ; i < entier ; i++) {
			System.out.println(motif);
		}
		
		sc.close();
	}
}
