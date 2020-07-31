package fr.richard.evalsvg.model;

public abstract class Forme {
	
	protected double x;			// position initiale en x
	protected double y;			// position initiale en y
	protected String couleur;	// couleur de la forme ... ex "yellow"
	
	protected Forme(double x, double y, String couleur) {
		this.x = x;
		this.y = y;
		this.couleur = couleur;
	}

	protected double getX() {
		return x;
	}

	protected void setX(double x) {
		this.x = x;
	}

	protected double getY() {
		return y;
	}

	protected void setY(double y) {
		this.y = y;
	}

	protected String getCouleur() {
		return couleur;
	}

	protected void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return "Forme [x=" + x + ", y=" + y + ", couleur=" + couleur + "]";
	}

	
}
