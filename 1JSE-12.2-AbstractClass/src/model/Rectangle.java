package model;

public class Rectangle extends Form {

	protected double longueur;
	protected double largeur;
	protected double perimetre;
	protected double aire;



	public Rectangle(double x, double y, double longueur, double largeur) {
		super(x, y);
		this.longueur = longueur;
		this.largeur = largeur;
		this.perimetre = perimetre();
		this.aire = aire();
	}

	@Override
	protected double perimetre() {
		return 2*(this.longueur + this.largeur);

	}

	@Override
	protected double aire() {
		return this.longueur * this.largeur;
	}

	@Override
	public String toString() {
		return  "Rectangle [largeur=" + (int)largeur + ", longueur=" + this.longueur
				+ " --> GeoForm [x=" + (int)this.x + ", y=" + (int)this.y
				+ " perimetre()=" + this.perimetre
				+", aire()=" + this.aire;
	}
}
