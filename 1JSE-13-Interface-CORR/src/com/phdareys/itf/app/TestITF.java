package com.phdareys.itf.app;

import com.phdareys.itf.model.Femme;
import com.phdareys.itf.model.Homme;
import com.phdareys.itf.model.PersonneFutile;

public class TestITF {
	// test de la notion d'interface, 
	// ici un homme et femme vont devoir � leur mani�re
	// faire les m�mes choses...
	public static void main(String[] args) {
		Femme f = new Femme("Elise"); 		
		f.faireDuSport("Danse");
		f.seDivertir("Shopping");
		f.travaillerBeaucoup(" faire de la programmation");
		
		Homme h = new Homme("Jean");
		h.faireDuSport("Boxe");
		h.seDivertir("Boire de la bi�re");
		h.travaillerBeaucoup(" cultiver les champs");
		h.resterAuLit(h.getNom());		
		
/*			// tableau possible aussi
		PersonneFutile [] arr = 
				{new Femme("Emma"),
				 new Homme ("Paul")};
		for (PersonneFutile pf:arr) {
			pf.faireDuSport("Tennis");
			pf.seDivertir("Cin�ma");
			System.out.println (pf.getClass().getName());
		}*/
	}

}
