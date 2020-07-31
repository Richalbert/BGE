package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import exception.FichierException;



public class Fichier  {

	private String nom;
	
	
	
	public Fichier(String nom) {
		super();
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}


	public void lire() throws FichierException, IOException{
	
			 FileReader fr = new FileReader(getNom());
			 int i;
			 
			 while((i=fr.read())!=-1) {   
					System.out.print((char)i); 
			 }
		
			
	}
	public void ecrire() throws FichierException  {
		
		
		FileWriter fw = new FileWriter(new File(this.nom));
		fw.write("1ere ligne c moi qui ecrit\n");
		fw.write("1ere ligne c moi qui ecrit cette ligne\n");
		fw.write("2ere ligne c moi qui ecrit cette ligne egalement\n");
		fw.write("3ieme ligne c moi qui ecrit cette ligne ci\n");
		
		fw.close();
		
		
	
		
	}
	
	public void supprimer() {
		
	}
}
