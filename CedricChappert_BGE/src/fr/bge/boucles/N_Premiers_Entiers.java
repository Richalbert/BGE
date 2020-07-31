package fr.bge.boucles;

import java.util.Scanner;

public class N_Premiers_Entiers {
	
	
	/**
	 * On ouvre un scanner et on recupere un entier.
	 * puis on ferme le scanner
	 * @return le nombre saisi
	 */
	public final static int getInt() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	

	public static void main(String[] args) {
		
		System.out.println("Programme qui calcule la somme des N premiers entiers ");
		System.out.println("Veuillez entrer N (entre 1 et 99 inclu) : ");
		int n = getInt();
		if ( n <= 0 || n>= 100 ) {
			System.out.println("Le nombre saisi n est pas compris entre 1 et 99 : " + n );
		}
		
		int Sn = n * ( n+1 ) / 2;
		System.out.println("[version Gauus] Sn = " + Sn + " pour n = " + n );
		
		int somme = 0;
		for (int i=1; i<= n; i++) {
			somme += i ;
		}
		System.out.println("[version for]   somme = " + somme);
		
		
		somme = 0;
		int i = 1;
		while ( i<=n ) {
			somme += i;
			i++;
		}
		
		somme = 0;
		i = 1;
		do {
			somme += i;
			i++;
		} while ( i <= n );
		
		System.out.println("[version while] somme = " + somme);
		
//		int [] tab;
//		tab = new int[n];
//		for (int i=0; i<n; i++) {
//			tab[i]= i+1;  
//		}
//		System.out.println(tab);
	}
}
