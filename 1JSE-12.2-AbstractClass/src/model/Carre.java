package model;

public class Carre extends Rectangle {

	private double cote;
	private double perimetre;
	private double aire;

	public Carre(double x, double y, double cote) {
		super(x, y, cote, cote);
		this.cote = cote;
		this.perimetre = perimetre();
		this.aire = aire();
	}

	@Override
	public String toString() {
		return  "Carre [largeur=" + (int)largeur + ", longueur=" + this.longueur
				+ " --> GeoForm [x=" + (int)this.x + ", y=" + (int)this.y
				+ " perimetre()=" + this.perimetre
				+", aire()=" + this.aire;
	}

}
