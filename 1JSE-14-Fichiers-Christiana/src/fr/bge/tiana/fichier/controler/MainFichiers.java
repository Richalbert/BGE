package fr.bge.tiana.fichier.controler;

import fr.bge.tiana.fichier.exception.ExceptionFichiers;
import fr.bge.tiana.fichier.model.ErreurType;
import fr.bge.tiana.fichier.model.Fichier;

public class MainFichiers {

	/**
	 * @param args
	 * @throws ExceptionFichiers 
	 */
	public static void main(String[] args){

		try {
			Fichier.chargementProperties();
			
			System.out.println(Fichier.prop.getProperty("succes_chargement"));

			// 1. Recupération des paramètres du programme
			try {
				if(args.length == 1){

					String optionFichier = args[0];

					Fichier fichier = new Fichier("out.txt");

					switch (optionFichier.charAt(0)){

					case 'W': // Générer un nombre de lignes aléatoires dans le fichier out.txt
						fichier.ecrire();
						break;

					case 'R': // Lire out.txt
						fichier.lire();
						break;

					case 'D': // Détruire out.txt
						fichier.supprimer();
						break;

					default:
						throw new ExceptionFichiers(ErreurType.ARGUMENT_ERROR, "Argument non valide");
					}

				} else {
					throw new ExceptionFichiers(ErreurType.ARGUMENT_ERROR, "Action impossible, nombre d'argument non respecté");	
				}

			} catch (ExceptionFichiers ef) {
				ef.afficheMessage();
			}

			// L'absence du fichier de propriété lève un FATAL (et le programme s'arrête)	
		} catch (ExceptionFichiers exception) {
			exception.afficheMessage();
		}
		
	}

}
