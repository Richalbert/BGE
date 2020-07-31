package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import exception.FichierException;
import model.Fichier;

public class FichierMain {

	public static void main(String[] args){

		Fichier fichier = new Fichier("out.txt");
		
		File file = new File(fichier.getNom());

		char key = args[0].toUpperCase().charAt(0);
		System.out.println(key);


		switch (key) {
		case 'W':		//générer un nombre de lignes aléatoires dans un fichier: out.txt (entre 1 et 5)
			System.out.println("creation du fichier out.txt".toUpperCase());

			try {
				fichier.ecrire();
			} catch (FichierException e1) {
				e1.printStackTrace();
			}

			break;
			
		case 'R':		//lire out.txt
			System.out.println("lecture du fichier out.txt".toUpperCase());

			
			try {
				fichier.lire();
			} catch (FichierException | IOException e) {
				e.printStackTrace();
			}

			break;
			
			
		case 'D' :		//détruire out.txt
			System.out.println("suppression du fichier out.txt".toUpperCase());
			break;
		default:
			//throw new FichierException(null)
			break;
		}

	}
}





//passer un paramètre au programme (tableau args du main)
//		System.out.println("tableau des arguments : " + Arrays.toString(args));
//		System.out.println(args[0].toUpperCase().charAt(0));



//		char key = args[0].toUpperCase().charAt(0);
//		
//		switch (key) {
//		case 'W':		//générer un nombre de lignes aléatoires dans un fichier: out.txt (entre 1 et 5)
//			System.out.println("creation du fichier out.txt".toUpperCase());
//			
//			try {
//				BufferedWriter bfw = new BufferedWriter (new FileWriter("out.txt"));
//				String ligne = "cc c moi qui ecrit cela bla bla";Fichier fichier = new Fichier("out.txt");
//				bfw.write(ligne);
//				
//				
//				bfw.close();
//			} catch (FileNotFoundException e) {
//				System.err.println("File Not Found Exception : le fichier n existe pas");
//				e.printStackTrace();
//			} catch (IOException e) {
//				System.err.println("iossible d'ecrire le fichier");
//				e.printStackTrace();
//			}
//			
//			
//			
//			
//			break;
//		cas	
//
//Fichier fichier = new Fichier("out.txt");
//
//e 'R':		//lire out.txt
//			System.out.println("lecture du fichier out.txt".toUpperCase());
//			try {Fichier fichier = new Fichier("out.txt");
//				BufferedReader bfr = new BufferedReader (new FileReader("out.txt"));
//				String ligne;
//				while ( (ligne = bfr.readLine()) != null )  {
//					System.out.println("j ai lu : " + ligne);
//				}
//		
//				bfr.close();
//			} catch (FileNotFoundException e) {
//				System.err.println("File Not Found Eception : le fFichier fichier = new Fichier("out.txt");ichier n existe pas");
//				e.printStackTrace();
//			} catch (IOException e) {
//				System.err.println("Erreur de lecture avec readLine()");
//				e.printStackTrace();
//			}
//			break;	
//		cas	
//
//Fichier fichier = new Fichier("out.txt");
//
//e 'D' :		//détruire out.txt
//			System.out.println("suppression du fichier out.txt".toUpperCase());
//			break;	
//		default:
//			System.err.println("[parametre non valide] --> " + key );
//			break;
//		}
//		
//
