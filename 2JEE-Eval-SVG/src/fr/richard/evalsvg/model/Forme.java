package fr.richard.evalsvg.model;

public abstract class Forme {
	
	protected int x1;			// position initiale en x
	protected int y1;			// position initiale en y
	protected String couleur;	// couleur de la forme ... ex "yellow"
	
	protected Forme(int x1, int y1, String couleur) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.couleur = couleur;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return "Forme [x1=" + x1 + ", y1=" + y1 + ", couleur=" + couleur + "]";
	}
	
	
}
