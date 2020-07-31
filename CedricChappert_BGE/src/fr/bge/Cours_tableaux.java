package fr.bge;

import java.util.Arrays;

public class Cours_tableaux {

	public static void main(String[] args) {
		
		// je cree un tableau de 4 cases
		Integer[] mesEntiers = new Integer[4];
		int[] mesPetitsInt = new int[4];
		
		System.out.println(args.length);
		System.out.println(mesEntiers.length );
		System.out.println(mesPetitsInt.length );
		
		int[] monTableau = { 0, 1, 2, 3, 4 };
		System.out.println( Arrays.toString(args) );
		System.out.println( Arrays.toString( mesEntiers) );
		System.out.println( Arrays.toString( mesPetitsInt) );
		System.out.println( Arrays.toString( monTableau  ));
		
		Integer[] mesEntiers2 = new Integer[] {
				//new Integer(10), new Integer(20)  DEPRECATED
				Integer.valueOf(10), Integer.valueOf(20)				
		};
		System.out.println(Arrays.toString(mesEntiers2));
		
		Integer nombreDansLaCase2 = mesEntiers2[1];
		System.out.println(nombreDansLaCase2);
		
		mesEntiers2[0] = Integer.valueOf(23);
		System.out.println(Arrays.toString(mesEntiers2));
	}
}
