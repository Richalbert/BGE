package com.phdareys.file.model;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.phdareys.file.exception.FileException;
import com.phdareys.file.tools.Tools;

public class FileManager {
	private String fName;	// le nom du fichier
	
	public FileManager(String fName) { 
		// le constructor mémorise le nom de fichier
		this.fName = fName;
	}
	public void copyFile(String newName) throws FileException {
		File file = new File(fName);
		file.renameTo(new File(newName));
		this.writeFile();

	}
	
	public void deleteFile() throws FileException {
		File file = new File(fName);
		boolean b=file.delete();
		if (! b)
			throw new FileException ("Impossible de détruire fichier: "+fName);
		System.out.println ("Destruction fichier: "+fName+ " ok");
	}
	public void writeFile() throws FileException {
		Tools t = new Tools();
		int nbRand = t.getRandomInt();
		try {
			File file = new File(fName);
			FileWriter fw= new FileWriter(file);
			fw.write("USER: " + this.getUserName() + " FICHIER: " +  fName + " Date: " + 
					this.getDate() + "\n");
			for (int i=0; i < nbRand; i ++) 
				fw.write("Line: " +(i+1) + "\n");
			fw.close();
			System.out.println ("Ecriture fichier: "+fName+ " ok");
		}
		catch (IOException e) {
			// on passe par une exception spécialisée
			throw new FileException ("Pb écriture avec fichier: "+fName);
		}
	}
	public void readFile() 
			throws FileException {
		try {
			File file = new File(fName);
			FileReader fr= new FileReader(file);
			int i;
			String s="";
			while((i = fr.read()) != -1)	// lecture car par car
				s += (char)i;
			//Affichage
			System.out.println(s);
			fr.close();
			System.out.println ("Lecture fichier: "+fName+ " ok");
		}
		catch (IOException e) { // on passe par une exception spécialisée
			throw new FileException ("Pb lecture avec fichier: "+fName);			
		}
		
	}
	private String getUserName() {
		return (System.getProperty("user.name"));
	}
	private String getDate() {
		Date actuelle = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		return (dateFormat.format(actuelle));
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
}
