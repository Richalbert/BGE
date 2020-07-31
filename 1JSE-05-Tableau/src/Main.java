import java.util.Scanner;


/**
 * 
 * @author richard
 * @version 1 - sans fonction
 */
public class Main {

	public static void main(String[] args) {

		char [] tableauCaractere = {'a','b','c','d','e','f','g'};
		char c;
		char sortir;

		boolean trouve = false;
		boolean fin = true;	

		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Rentrez une lettre en minuscule, SVP");
			
			// Récupération du 1er caractère entré par l'utilisateur
			c = sc.next().charAt(0);

			//Boucle de recherche dans le tableau
			for (int i=0 ; i<tableauCaractere.length; i++) {
				if ( tableauCaractere[i] == c ) {
					trouve = true;
					break;
				}
			}


			if (trouve) {
				System.out.println("la lettre " + c + " se trouve bien dans le tableau !");
				
				System.out.println("Voulez vous essayer à nouveau ? (0/N)");
				sortir = sc.next().charAt(0);
				if (sortir == 'Y' ||  sortir == 'y') {
					fin =false;
					sc.close();
				}
				
			} else {
				System.out.println("la lettre " + c + " ne se trouve pas dans le tableau !");

			}
	
			
		} while (fin);

		System.out.println("Au revoir !");
	}
	

}
