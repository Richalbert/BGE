package com.phdareys.shape.model;

import com.phdareys.shape.exceptions.ShapeException;

// basis form 
public abstract class Shape {
	private static final int DEC_NB = 2; // I want 2 digits after ,
    protected int x, y;	// attributes
    
    	// not called directly of course, called by children!
    	// throws exception in case of x, y not int
    protected Shape(int x, int y) throws ShapeException{
       this.x = x; 
       this.y = y;
    }
    	// move is independant from kind of form (concrete)
    public void moveOf( int dx, int dy) throws ShapeException { 
      x +=dx; y +=dy;
    }
    abstract public double perim ();	// specification only!
    abstract public double area (); 	// cannot calculate here of course!
    
    @Override
	public String toString() {
		return "--> GeoForm [x=" + x + ", y=" + y + ", perim()=" + 
				this.round(this.perim(), DEC_NB) + ", area()=" + 
				this.round(this.area(), DEC_NB) + "]";
	}

	public static int getDecNb() {
		return DEC_NB;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	private double round(double A, int B) {
		return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}

}

