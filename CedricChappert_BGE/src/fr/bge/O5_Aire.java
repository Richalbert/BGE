package fr.bge;

import java.util.Scanner;
import static java.lang.Math.*;

public class O5_Aire {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez entrer le rayon : ");
		int rayon = sc.nextInt();
		
		sc.close();
		
		double aire = PI * rayon * rayon;
		System.out.println("l'aire du cercle de rayon " + rayon + " est " + aire + " m*m")  ;
		
		double volume = ( 4 / 3 ) * PI * ( rayon*rayon*rayon );
		System.out.println("le volume de la sphere de rayon " + rayon + " est " + volume + " m*m*m2");
		
	
	}

}
