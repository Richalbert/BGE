package com.phdareys.file.app;

import com.phdareys.file.exception.FileException;
import com.phdareys.file.model.FileManager;
import com.phdareys.file.tools.Tools;

public class FileManagerMain {
	private static String [] TOKENS =  {
			"-i", "-o", "-io", "-d"	};
	// création de fichiers, traitement exceptions
	// passage de paramètres au programme
	public static void main(String[] args) {
		try {
			Tools tools = new Tools (args, 	TOKENS);
			FileManager f= new FileManager(tools.getValue());
			switch (tools.getReadOrWrite()) {
				case READ : 
					f.readFile();break;
				case WRITE : 
					f.writeFile();break;
				case DELETE : 
					f.deleteFile();break;
				case READANDWRITE : 
					f.writeFile();
					f.readFile();break;
			}
		} catch (FileException e1) {
			// TODO Auto-generated catch block
			e1.displayErr();
		}

	}

}
