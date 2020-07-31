package com.phdareys.towns.app;

import com.phdareys.towns.model.Country;
import com.phdareys.towns.view.ViewCountry;

public class PooObjetsEtListes {
/* 
 * TD: concept modèle/vue, 
 * utilisation de listes (vecteur), vue en SWING
 *  
 */
	public static void main(String[] args) {
		// déclaration de pays
		Country [] pTab = new Country [] {
				new Country ("AM Nord", "US", 300_000,
						new String[] {"Boston", "NY", "LA", "SanFrancisco"}),
				new Country ("AM Sud", "Pérou", 20_000,
						new String[] {"Lima", "Huaraz"}),
				new Country ("AM Nord", "Canada", 40_000,
						new String[] {"Calgary", "Toronto", "Montreal"}),
				new Country ("ASIE", "Chine", 1_400_000,
						new String[] {"Pékin", "Shanghai"}),
				new Country ("Europe", "Espagne", 30_000,
						new String[] 
								{"Madrid", "Malaga", "Valence", "Saragosse", "Bilbao"}),};
			// enlever/ajouter une ville dans un pays
			// et réafficher derrière...
		String town="Huesca";
		if (! pTab[3].addTown(town))
			System.out.println("Town: " + town + " allready exists!");
		System.out.println (pTab[3]);
		town = "Malaga";
		if (! pTab[3].removeTown(town))
			System.out.println("Town: " + town + " does not exist!");
				// affichage de tous les pays traités
		//System.out.println (Pays.getListePays());
				// présentation dans une popup
		new ViewCountry (pTab);
	}

}
