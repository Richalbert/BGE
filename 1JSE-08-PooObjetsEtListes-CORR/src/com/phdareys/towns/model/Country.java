package com.phdareys.towns.model;

import java.util.Iterator;
import java.util.Vector;

public class Country {
		// attributs de type IN
	private String continent = null;
	private String name = null;
	private int pop = 0;
		// attributs de type OUT (stockage villes)
	private Vector<String> towns = null;
		// stockage statique des pays
	private static Vector<String> countryList = null;

	public Country(String continent, String nom, int pop, String [] tabVilles) {
		super();
		this.continent = continent.toUpperCase();
		this.name = nom;
		this.pop = pop;
		this.towns = new Vector<>();
		for (String s:tabVilles) 
			this.addTown(s);
		if (Country.countryList == null)
			Country.countryList = new Vector<String>();
		Country.countryList.add(this.name);
		System.out.println (this);
	}

	public boolean removeTown (String uneVille) {
		return this.towns.remove(uneVille);	// faux si la ville n'y est pas
		// autre solution
		/*
		for (int i=0; i<this.villes.size(); i ++) {
			String v = (String) this.villes.elementAt(i);
			if (v.equals(uneVille)) {
				this.villes.removeElementAt(i);
			}
		}*/
	}
	
	public boolean addTown (String uneVille) {
		boolean b = this.towns.contains(uneVille);
		if (! b)	// ville inexistante -> rajout
			this.towns.add(uneVille);
		return ! b;	// vrai si ville rajoutée, faux sinon
	}
	
	public String getContinent() {
		return continent;
	}

	public String getName() {
		return name;
	}

	public Vector<String> getTowns() {
		return towns;
	}

	public int getPop() {
		return pop;
	}

	public static Vector<String> getCountryList() {
		return countryList;
	}

	@Override
	public String toString() {
	       //parcourir avec Iterator un Vecteur
		String townsS = "";
        Iterator<String> itr = towns.iterator();
        while(itr.hasNext()){
            townsS += "" + itr.next() + "||";
        }

		return "Pays [continent=" + continent + ", nom=" + name + ", pop=" + pop + ", villes=" + towns + "]";
	}

}
