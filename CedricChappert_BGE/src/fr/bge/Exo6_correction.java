package fr.bge;

import java.util.Scanner;

public class Exo6_correction {

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
		if (x >= y && y >= z) { // z <= y <= x
			float temp = x;
			x = z;
			z = temp;
		} else if (x >= y && y <= z) { // x >= y mais x <= z 
			float temp = x;
			x = y;
			y = temp;
		} else if (x <= y && y >= z) { // x <= y mais x >= z
			float temp = y;
			y = z;
			z = temp;
		}
		System.out.println(x + " " + y + " " + z);
	}
	
	
}
