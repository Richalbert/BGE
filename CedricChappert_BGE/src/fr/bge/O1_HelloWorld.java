package fr.bge;

import java.util.Arrays;

public class O1_HelloWorld {

	public static void main(String[] args) {
		// args est une variable contenant un tableau de chaine de caractere
		// ce sont les options que l on donne au programme depuis un terminale
		System.out.println("hello world " + Arrays.toString(args));
		
		//je recupere le contenu texte dans la premiere case du tableau
		System.out.println("Hello " + args[0]);
		
		// ici on accede a une case a l exterieur du tableau args
		//System.out.println("Hello " + args[1]);
	}

}






