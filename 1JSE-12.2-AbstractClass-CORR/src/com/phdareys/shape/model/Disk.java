package com.phdareys.shape.model;

import com.phdareys.shape.exceptions.ShapeException;

public class Disk extends Shape {
	int radius; // IV specific to disk
    
	public Disk(int x, int y, int r)  throws ShapeException {
        super(x, y);
        radius = r;
    }

	public Disk(int r)  throws ShapeException {
        this(0, 0, r);

    }
 	@Override
	public double perim() { //must be implemented!
		return 2*Math.PI*radius;
	}
 	
	@Override
	public double area() { //must be implemented!
		return Math.PI*radius*radius;
	}
	@Override
	public String toString() {
		return "\tDisk [radius=" + radius + " " + super.toString()+ "]";
	}

}
