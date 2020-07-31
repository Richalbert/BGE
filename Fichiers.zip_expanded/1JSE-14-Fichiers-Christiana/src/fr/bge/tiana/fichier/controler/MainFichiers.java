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

			// 1. Recup�ration des param�tres du programme
			try {
				if(args.length == 1){

					String optionFichier = args[0];

					Fichier fichier = new Fichier("out.txt");

					switch (optionFichier.charAt(0)){

					case 'W': // G�n�rer un nombre de lignes al�atoires dans le fichier out.txt
						fichier.ecrire();
						break;

					case 'R': // Lire out.txt
						fichier.lire();
						break;

					case 'D': // D�truire out.txt
						fichier.supprimer();
						break;

					default:
						throw new ExceptionFichiers(ErreurType.ARGUMENT_ERROR, "Argument non valide");
					}

				} else {
					throw new ExceptionFichiers(ErreurType.ARGUMENT_ERROR, "Action impossible, nombre d'argument non respect�");	
				}

			} catch (ExceptionFichiers ef) {
				ef.afficheMessage();
			}

			// L'absence du fichier de propri�t� l�ve un FATAL (et le programme s'arr�te)	
		} catch (ExceptionFichiers exception) {
			exception.afficheMessage();
		}
		
	}

}
