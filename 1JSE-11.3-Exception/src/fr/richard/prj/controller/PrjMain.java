package fr.richard.prj.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import fr.richard.prj.exception.PrjException;


public class PrjMain {

	public static void main(String[] args) {

		
		try {
			methodeAvecExceptionSurveillee();
		} catch (PrjException e) {
			e.affiche();
		}


		try {
			methodeAvecExceptionNonSurveillee();
		} catch (PrjException e) {
			// TODO Auto-generated catch block
			e.affiche();
		}
	}



	/**
	 * methode1 avec exception surveillee
	 * @throws PrjException 
	 * @throws FileNotFoundException 
	 */
	public static void methodeAvecExceptionSurveillee() throws PrjException  {
		System.out.println("je suis dans methode 1 avec exception surveillee");

		File file = new File("toto.txt");	
		try {
			FileReader fR = new FileReader(file);
		} catch (FileNotFoundException e) {
			throw new PrjException("File Not Found Exception", 25);
		}
	}

	/**
	 * methode2 avec exception non surveille
	 * @throws PrjException 
	 * 
	 */
	public static void methodeAvecExceptionNonSurveillee () throws PrjException {

		System.out.println("je suis dans methode 2 avec non exception surveillee");
		System.out.println();
		double solde = 5 ;
		double retrait = 10;

		if ( retrait > solde ) throw new PrjException("retrait superieur au solde", 123);
		solde -= retrait;

		System.out.println("solde : " + solde);

	}

}
