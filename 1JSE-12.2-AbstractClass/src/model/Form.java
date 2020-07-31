package model;

public abstract class Form {

	//protected String nom;
	protected double x;
	protected double y;
	
	
	public Form(double x, double y) {
		this.x = x;
		this.y = y;
	}
		
	protected abstract double perimetre();
	protected abstract double aire();
	

	public double moveX(double dX) {
		return this.x + dX;
	}
	
	public double moveY(double dY) {
		return this.y + dY;
	}
	
	public void moveXY(double dX, double dY) {
		this.x = moveX(dX);
		this.y = moveY(dY);
	}

	public double getX() {
		return x;
	}

	public double getY() {		
		return y;
	}


}
