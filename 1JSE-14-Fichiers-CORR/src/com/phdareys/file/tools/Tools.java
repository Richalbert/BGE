package com.phdareys.file.tools;

import java.util.Random;

import com.phdareys.file.exception.FileException;

public class Tools {
	private final static int BORNE_INF = 1;
	private final static int BORNE_SUP = 10;
	private final static String ERROR_MESS = 
			"Syntaxe incorrecte: <-o, -i, -io, -d> <fichier> !";
	private String value;
	private InputOutput readOrWrite;
	private int randomInt;
	
	public Tools () {
		// ce constructor est d�di� au calcul d'un nb al�atoire
		Random r = new Random();
		randomInt = r.nextInt(BORNE_SUP-BORNE_INF) + BORNE_INF;
	}
	public Tools(String[] args, String... searchTokens) 
			throws FileException {
		// ce constructor est d�di� � l'analyse des arguments
		// args: les arguments, searchTokens les tokens autoris�s
		if (args.length !=2 )	// verif 2 arguments
			throw new FileException (ERROR_MESS);

		boolean tokTrouve = false;
		for (String tok:searchTokens) 
			if (args[0].equals(tok))
				tokTrouve = true;
		if (! tokTrouve) // l'argument 0 ne contient pas un des tokens
			throw new FileException (ERROR_MESS);			
			// m�morisation du param2 (le nom de fichier)
		this.value = args[1];
			// m�morisation du type de traitement (�criture/lecture..)
			// d�fini dans une �num�ration
		this.readOrWrite = InputOutput.READ;
		if (args [0].equals("-o"))
				this.readOrWrite = InputOutput.WRITE;
		if (args [0].equals("-io"))
			this.readOrWrite = InputOutput.READANDWRITE;
		if (args [0].equals("-d"))
			this.readOrWrite = InputOutput.DELETE;	
	}
	
	public String getValue() {
		return value;
	}

	public InputOutput getReadOrWrite() {
		return readOrWrite;
	}
	public int getRandomInt() {
		System.out.println ("Nb al�atoire retourn�: " + randomInt);
		return randomInt;
	}

}
