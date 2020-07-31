package com.phdareys.bean;

/* bean simple */
public class Course {
	private int id;
	private String libelle;
	private int quantite;
	
	public Course() {
		super();
	}
	public Course(int id, String libelle, int quantite) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.quantite = quantite;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", libelle=" + libelle + ", quantite=" + quantite + "]";
	}
	

}
