package fr.bge;

import java.util.Scanner;

public class O3_MaPremiereFonction {
	
	public static int getInt() {
		Scanner sc = new Scanner(System.in);
		int monEntier = sc.nextInt();
		sc.close();
		return monEntier;		
	}
	

	public static void main(String[] args) {
		
		System.out.println("entre un nombre : ");
		int n1 = getInt();
		
		System.out.println("entre un nombre : ");
		int n2 = getInt();
		
		System.out.println("entre un nombre : ");
		int n3 = getInt();
		
		System.out.println("Vous avez entre : " + n1 + n2 + n3);
	}

}
