package cinqExos;

import java.util.Arrays;
import java.util.Scanner;

public class BufferTournant {
	
//	public static char menu (String str) {
//		
//			System.out.println();
//			
//			return 
//	}	for (int e: tab ) {
//	System.out.print(e);
//}
//
//
//Scanner sc = new Scanner(System.in);
//
//System.out.println(tab.toString());
//

	public static void main(String[] args) {
		
		/*
		 * Q : Buffer tournant
		 * On sortira du programme quand l’utilisateur saisira exit,
		 * soit un tableau contenant 5 valeurs. [-2, -1, 0, +1, +2]
		 * Le but est de faire un tourniquet, le programme se met sur 0 et affiche 0
		 * [-2, -1, 0, +1, +2]
		 * Si l’utilisateur tape ‘gauche’ ou ‘g’, le tourniquet se deplace sur la gauche, affiche -1
		 * [-2, -1, 0, +1, +2]
		 * Si l’utilisateur tape encore ‘g’, le tourniquet se déplace à gauche et affiche -2
		 * [-2, -1, 0, +1, +2]
		 * Si l’utilisateur tape encore ‘g’, le tourniquet se déplace à gauche, comme il n’y a rien, il passe à +2
		 * [-2, -1, 0, +1, +2]
		 * Si l’utilisateur tape encore ‘droite’ ou ‘d’, le tourniquet se déplace à droite et affiche -2
		 * [-2, -1, 0, +1, +2]
		 */
		
		int [] tab = new int[] {-2, -1, 0, +1, +2};
		System.out.println( Arrays.toString(tab) );
		
		
		
		String[] monTableau = new String[] {"Un", "Deux", "Trois"};
		System.out.println(Arrays.toString(monTableau));; 
		
		
		//	for (int e: tab ) {
//		System.out.print(e);
//	}
//	
//	
//	Scanner sc = new Scanner(System.in);
//	
//	System.out.println(tab.toString());
//	
		
	
		
//		for (int e: tab ) {
//			System.out.print(e);
//		}
//		
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println(tab.toString());
//		
//		
//		System.out.print("Taper \"exit\" pour sortir");
//		String str = sc.nextLine();
//		
//		
//		
//		switch (str) {
//		case "exit":	
//			System.out.println("coucou");
//			System.exit(0);
//			
//			break;
//
//		default:
//			break;
//		}
//		
		
	//	sc.close();
	}
}
