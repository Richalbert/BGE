package com.phdareys.itf.model;

public interface PersonneFutile {
	// voici le contrat � respecter
	void seDivertir(String activite);
	void faireDuSport(String sport);
	// cette clause permet de rentrer du code
	// mais � d�conseiller!!
	default void resterAuLit(String nom) {
		System.out.println (nom+": aime dormir");
	}
}
