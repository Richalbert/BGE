package fr.bge.tiana.fichier.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

import fr.bge.tiana.fichier.exception.ExceptionFichiers;

public class Fichier {

	private String nom;
	private File monFichier;
	
	public static Properties prop = new Properties();
	
	public Fichier(String nom) {
		this.nom = nom;
		monFichier = new File(nom);
	}
	
	public void ecrire() throws ExceptionFichiers{

		FileWriter fw;

		try {
			
			fw = new FileWriter(getMonFichier());
			
			Random random = new Random();
			int nb;
			nb = 1 + random.nextInt(5);
			
			for(int i = 0; i < nb; i++) {
				fw.write("Ligne " + (i+1) + "\n"); 
			}      
			fw.close();
			System.out.println(getproperties("succes_ecriture")); 
			
		} catch (IOException e) {
			throw new ExceptionFichiers(ErreurType.WRITE_ERROR, getproperties("echec_ecriture"));
		}    
			   
	}  
	
	public void lire() throws ExceptionFichiers{
		
		try {
			
			FileReader fr = new FileReader(getMonFichier());
			int i;  
			
			try { // Lecture du fichier
				
				System.out.println(getproperties("lecture")); 
				while((i=fr.read())!=-1){    
					System.out.print((char)i);
				}
				
			} catch (IOException e) { // NON TESTE
				throw new ExceptionFichiers(ErreurType.READ_ERROR, getproperties("echec_lecture"));
			}
			
			try { // Fermeture du fichier
				System.out.println("Fermeture");
				
				fr.close();
				
			} catch (IOException e) { // NON TESTE
				throw new ExceptionFichiers(ErreurType.READ_ERROR, getproperties("fermeture_erreur"));
			} 
			
		} catch (FileNotFoundException e) {
			throw new ExceptionFichiers(ErreurType.READ_ERROR, getproperties("fichier_introuvable"));
		}
		
	}

	public void supprimer() throws ExceptionFichiers{
		
		File nouveaul = new File(this.nom);
		boolean a = nouveaul.delete();
		
		if(!a){
			throw new ExceptionFichiers(ErreurType.DELETE_ERROR, getproperties("erreur_suppression"));
		}
	}
	
	public static void chargementProperties() throws ExceptionFichiers {
		
		InputStream input = null;

		try {
			input = new FileInputStream("messages.properties");
			
		} catch (FileNotFoundException e) {
			throw new ExceptionFichiers(ErreurType.FATAL_ERROR, "Fichier de properties non chargé");
		}

		try {
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static String getproperties(String cle) throws ExceptionFichiers{
		
		String message = prop.getProperty(cle);
		
		if(message == null){
			throw new ExceptionFichiers(ErreurType.FATAL_ERROR, "argument pb");
		}
		return message;
	}

	
	public File getMonFichier() {
		return monFichier;
	}

	
}
