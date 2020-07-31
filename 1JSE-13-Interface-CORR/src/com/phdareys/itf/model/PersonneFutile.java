package com.phdareys.itf.model;

public interface PersonneFutile {
	// voici le contrat à respecter
	void seDivertir(String activite);
	void faireDuSport(String sport);
	// cette clause permet de rentrer du code
	// mais à déconseiller!!
	default void resterAuLit(String nom) {
		System.out.println (nom+": aime dormir");
	}
}
