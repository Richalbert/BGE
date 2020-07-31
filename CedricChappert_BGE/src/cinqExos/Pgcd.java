package cinqExos;

import java.util.Scanner;

public class Pgcd {

	public static void main(String[] args) {
		
		/*
		 * trouver le PGCD de deux entiers A et B.
		 * 1 - Si B est non nul, diviser A par B. On note R le reste de
		 * cette division euclidienne.
		 * 2 - Remplacer A par B et B par R.
		 * 3 - Recommencer tant que cela est possible à partir de
		 * l’étape 1.
		 * 4 - Le PGCD est alors la dernière valeur non nulle de R.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PGCD de A et B ");
		System.out.print("Saisissez les deux nombres :");
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		sc.close();
		
		System.out.println("a : " + A + "\t b : " + B);
		
		int a = A;
		int b = B;
		int r;
		int pgcd;
		
		while ( b != 0 ) {
			r = a % b;			// pgcd est la derniere valeur non nulle du reste
			a = b;				// au dernier tour r = 0 et donc ecrase b
			b = r;				// le ggcd est dans a
		}
		

		System.out.println("pgcd(" + a + "," + b + ") = " + a);
		
		
		
		
		int dividende;
		int diviseur ;
		if ( A > B ) {
			dividende = A;
			diviseur = B;
		} else {
			dividende = B;
			diviseur = A;
		}
	
		
		
		int reste = 1;
		do {
			pgcd = reste;					// pgcd dernier reste non nul
			reste = dividende % diviseur;
			dividende = diviseur;	
			diviseur = reste;
		} while( reste != 0);		
		
		System.out.println("PGCD(" + A + "," + B + ") = " + pgcd);
	
		
		
	}
	
	
}
