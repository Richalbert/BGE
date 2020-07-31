package fr.richard.evalsvg.model;

import java.util.ArrayList;



public class Lignes {

	private static final int MIN = 1;
	private static final int MAX = 500;

	private ArrayList<Forme> lignes = null;
	private int nbLigne;
	
	
	

	public Lignes(int nbLigne) {
		this.nbLigne = nbLigne;
		this.lignes = new ArrayList<Forme>();
		String couleur="yellow";

		for ( int i = 0; i < nbLigne ; i++ ) {
			this.lignes.add( new Ligne( randomInt(), randomInt() , randomInt(), randomInt(), couleur) );
		}
	}

	
	
	public int getNbLigne() {
		return nbLigne;
	}



	public void setNbLigne(int nbLigne) {
		this.nbLigne = nbLigne;
	}



	public ArrayList<Forme> getLignes() {
		return lignes;
	}

	public void setLignes(ArrayList<Forme> lignes) {
		this.lignes = lignes;
	}



	@Override
	public String toString() {
		return "Lignes [lignes=" + lignes + "]";
	}



	private int randomInt()	{
		return (int) (Math.random()*(MAX-MIN+1))+MIN;
	}



}

