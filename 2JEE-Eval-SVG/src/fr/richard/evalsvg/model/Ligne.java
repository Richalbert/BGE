package fr.richard.evalsvg.model;

public class Ligne extends Forme {


	private int x2;				// position finale de la ligne en X
	private int y2;				// position finale de la ligne en y
	
	
	public Ligne(int x1, int y1, int x2, int y2, String couleur) {
		super(x1, y1, couleur);
		this.x2 = x2;
		this.y2 = y2;
	}


	public int getX2() {
		return x2;
	}


	public void setX2(int x2) {
		this.x2 = x2;
	}


	public int getY2() {
		return y2;
	}


	public void setY2(int y2) {
		this.y2 = y2;
	}


	@Override
	public String toString() {
		return "Ligne [x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + ", couleur=" + couleur + "]";
	}


	
	
}
