package com.phdareys.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

//import com.exception.DivBy0Exception;
public class MainException {

	public static void main(String[] args) {

		System.out.println("DEB Prog...");
		int tab2[] = {2, 4};
		int age=100;
		
		try {	
			if (age > 110)	// erreur applicative (non surveillée) // instruction 1
				throw new Exception("age entre 1 et 110!!");
			System.out.println(tab2[1]);					// instruction 2
			System.out.println(3/0);						// instruction 3					
		} 
		catch (ArithmeticException e1) {
			System.out.println("Erreur division par 0");
		}
		catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Erreur dépassement Tableau");
		}
		catch (Exception e1) {
			System.out.println("Autre erreur: "+e1.getMessage());
		}
		System.out.println("FIN Prog...");

	/*	
		
		
		try {
			int i=1;int j = 2;
			System.out.println(j/i);
		}
		catch (ArithmeticException ae) {
			System.out.println("ERREUR à la division: "+
					ae.getMessage());			
		}
		catch (Exception e) {
			System.out.println("ERREUR à la division: "+
					e.getMessage());			
		}
		
		try {
			String tab[] = {"s1", "s2"};
			System.out.println(tab[1]);
		}
		catch (Exception e) {
			System.out.println
			("ERREUR dépassement tableau!! ");		
		}
		System.out.println("FIN Prog...");*/
	}
	
	public static void cas2() {
		int numerateur = 10 ;
		int denominateur = 0 ;
		int resultat = 0 ;
		/*
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Entrer dénominateur: ");
		 denominateur=sc.nextInt();
		 System.out.println("Entrer numérateur: ");
		 numerateur=sc.nextInt();
		 try {
			checkNum(numerateur);

		} catch (DivBy0Exception e) {
			// TODO Auto-generated catch block
			e.trace();
		}
		 try {

		 resultat =  numerateur/denominateur ;
		 }
		 catch ( ArithmeticException ae) {
			 System.out.println("Erreur : " + ae.getMessage() );
			// bloc d’instructions du catch
			// Gestion de l’exception

			}
		 System.out.println("Le résultat de la division est : " + resultat );
		 sc.close();
	}
	public static boolean checkNum (int pVal) throws DivBy0Exception {
		if (pVal == 2)
			throw new DivBy0Exception(pVal);
		return true;
	}
		 */
	}

}
