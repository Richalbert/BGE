package fr.bge;

import java.util.Arrays;
import java.util.Scanner;

public class Exo6_correction2 {

	public static void main(String[] args) {
		
		// saisir trois entiers x, y, z
				Scanner sc = new Scanner(System.in);
				System.out.print("Entrer un entier x : ");
				float x = sc.nextFloat();
				System.out.print("Entrer un entier y : ");
				float y = sc.nextFloat();
				System.out.print("Entrer un entier z : ");
				float z = sc.nextFloat();
				sc.close();
				
				System.out.println(String.format("Les réels saisis sont\n" 
						+ "\tx = %s" + "\ty = %s" + "\tz = %s", x, y, z));
				
				Float[] array = { x, y, z};
				
				Arrays.parallelSort(array);;
				
				System.out.println(Arrays.toString(array));
	}

}
