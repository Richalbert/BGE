import java.util.Scanner;


/**
 * Le programme demande un nombre et 
 * fournit la somme des entiers jusq'a ce nombre
 * ainsi la somme des multiples de trois jusqu a ce nombre
 * @author richard
 * @version 0624-1537
 *
 */
public class Algo {

	public static void main(String[] args) {


		Algo algo = new Algo();

		// Declaration Initialisation
		int entier = algo.entrerDuClavierUnNombre();

		// Traitement
		//int somme           = algo.sommeDesEntiersAvecMultiple(entier, 1);
		int multipleDeTrois = algo.sommeDesEntiersAvecMultiple(entier, 3); 
		int somme = algo.calculSommeRec(entier);

		// Affichage
		algo.displaySommeEtMultiple(entier, somme, multipleDeTrois);
		System.out.println(algo.factoriel(5)) ;

	}

	
//	private int fibo(int n)
//	{
//		
//		if (n<=2) 
//		{
//			return 1;
//		}
//				
//	return fibo(n-1) + fibo(n-2); 
//	}
	
	
	private int factoriel(int n ) {
		
		// n! = n * (n-1) * ... * 1
		
//		int resultat = 1;
//		for ( int i = 1; i<=n; i++) {
//			resultat *= i;
//		}
		if (n <= 1 ) {
			return 1;
		}
		
		return n*factoriel(n-1);
	}

	private int calculSommeRec (int pNumber) {

		if (pNumber == 1) {
			return 1;
		}

		int sommeNMoinsUn = calculSommeRec(pNumber - 1);
		System.out.println("sortie -> " + pNumber);

		return sommeNMoinsUn + pNumber;			

	}

	private void displaySommeEtMultiple(int entier, int somme, int multiple) {
		System.out.println("Somme des entiers jusqu'a: " + entier + " = " + somme);
		System.out.println("Somme des multipes de trois de l'entier: " + entier + " = " + multiple );
	}

	private int entrerDuClavierUnNombre() {

		int resultat = 0;

		System.out.println("Entrer un entier : ");
		Scanner sc = new Scanner(System.in);
		resultat = sc.nextInt();

		sc.close();

		return resultat;
	}

	private int sommeDesEntiersAvecMultiple(int pEntier, int pMultiple) {

		int resultat = 0;

		for (int i=pEntier; i>0; i--) {
			if ( i % pMultiple == 0 ) {
				resultat += i;
			}
		}

		return resultat;
	}

}

/*
 *  JEU DE TEST
 * 
 * 	14 	=>	somme = 105
 * 		=> 	somme des muiltiples de 3 = 30
 * 
 */
