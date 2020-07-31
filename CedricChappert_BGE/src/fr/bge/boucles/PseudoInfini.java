package fr.bge.boucles;

import java.util.Scanner;

public class PseudoInfini {
	
	public static void main(String[] args) {
		
		/*
		 * Faire un programme qui additionne les nombres saisis par un utilisateur, 
		 * arrête dès que l’utilisateur saisit zéro (0)
		 * Commencer par une version avec un while
		 * Puis la refaire avec un do while (vous verrez à ce moment l'utilité d'un do while 
		 * que l'on place rarement dans un code mais qu'on est fier de poser quand ça le fait 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int somme = 0;
		boolean fin = false;
		while (fin == false ) {
			System.out.print("Entrer un nombre (0 pour sortir) : ");
			n = sc.nextInt();
			if ( n==0 ) {
				fin = true;
			}
			somme += n ;
			//System.out.println( n );	
		}
		
		System.out.println( "(boucle while ) somme = " + somme );
		
		somme = 0;
		do {
			System.out.print("Entrer un nombre (0 pour sortir) : ");
			n = sc.nextInt();
			somme += n;
		} while ( n != 0 );
		System.out.println( "(boucle do...while) somme = " + somme );
		
		sc.close();
	}
	
	
	
	
	
}
