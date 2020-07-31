//import java.util.Arrays;
import java.util.Scanner;

public class JavaArray {
	public static void main(String[] args) {
		/*
		 * cr�ation d'objet sur la classe permet d'�viter de 
		 * d�clarer des m�thodes statiques
		 */
		JavaArray jA = new JavaArray();
		/*
		 * possible en Stand alone de passer des param�tres au programme
		 * (faire run configuration/arguments)
		 */
		if (args.length > 0)	// si param�tre je fais le bonus (parcours tab 2 dim)
			jA.twoDimsArray();
		else					// sinon le programme demand� (array 1 dim)
			jA.oneDimArray();
	}

		/* 
		 * exo simple: parcours d'un tableau de chars fixes, entr�e d'une lettre
		 * si dans la liste message, sinon un autre message
		 */
	private void oneDimArray() {
		char tableauCaractere[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		int i = 0;
		char reponse = ' ', carac = ' ';
		
		Scanner sc = new Scanner(System.in);
		System.out.println("TABLEAU 1 DIM");
		
		do {//Boucle principale
			
			do { //On r�p�te cette boucle tant que l'utilisateur n'a pas rentr� une lettre figurant dans le tableau
				
				System.out.println("Rentrez une lettre en minuscule, SVP ");
				
				// R�cup�ration du 1er caract�re entr� par l'utilisateur
				carac = sc.nextLine().charAt(0);
				
				//Boucle de recherche dans le tableau
				// (on peut utiliser aussi:
				//Arrays.toString(tableauCaractere).contains(sc.nextLine());
				i = 0;
				while(i < tableauCaractere.length && carac != tableauCaractere[i])
					i++;
				
				
				//Si i < 7 c'est que la boucle n'a pas d�pass� le nombre de cases du tableau
				if (i < tableauCaractere.length)
					System.out.println("La lettre " +carac+ " se trouve bien dans le tableau !");
				else //Sinon
					System.out.println("La lettre " +carac+ " ne se trouve pas dans le tableau !");		
				
			}while(i >= tableauCaractere.length);
			
			
			do { //Tant que la lettre de l'utilisateur ne correspond pas � une lettre du tableau
				System.out.println("Voulez-vous essayer � nouveau ? (O/N)");
				reponse = sc.nextLine().toUpperCase().charAt(0);
			}while(reponse != 'N' && reponse != 'O');
			
			
		}while (reponse == 'O');
		sc.close();
		System.out.println("Au revoir !");
	}

	/* 
	 * exo bonus parcours d'une table � 2 dims et affichage
	 */
	private void twoDimsArray() {
		String tab[][]={
				{"toto", "titi", "tutu", "tete", "tata"}, 
				{"1", "2", "3", "4"}};
		System.out.println("TABLEAU 2 DIMs");

		int i = 0, j = 0;
		for(String sousTab[] : tab) {
			i = 0;
			for(String str : sousTab) {
				System.out.println("La valeur de la nouvelle boucle est : " +
						str);
				System.out.println("La valeur du tableau � l'indice ["+j+"]["+i+"] est : " + 
						tab[j][i]);
				i++;
			}
			j++;
		}
	}
}

