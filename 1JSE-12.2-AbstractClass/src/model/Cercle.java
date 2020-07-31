package model;

public class Cercle extends Form {

	private double rayon;
	private double perimetre;
	private double aire;


	public Cercle(double x, double y, double rayon) {
		super(x,y);
		this.rayon = rayon;
		this.perimetre = perimetre();
		this.aire = aire();

	}

	public double getPerimetre() {
		return perimetre;
	}

	public double getRayon() {
		return rayon;
	}

	@Override
	protected double perimetre() {
		return 2*Math.PI*this.rayon;
	}

	@Override
	protected double aire() {
		return Math.PI*rayon*rayon;
	}

	@Override
	public String toString() {
		return   "Cercle [rayon=" + (int)rayon 
				+ " --> GeoForm [x=" + (int)this.x + ", y=" + (int)this.y
				+ " perimetre()=" + this.perimetre
				+", aire()=" + this.aire;
	}
}
