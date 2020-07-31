package com.phdareys.shape.model;

import com.phdareys.shape.exceptions.ShapeException;

public class Rectangle extends Shape {
	int width, height;	// att specific to rectangle
	
	public Rectangle(int x, int y, int w, int h) throws ShapeException {
	       super(x, y);
	       width = w; height = h;
	    }
	
	@Override
	public double perim() { //must be implemented!
		return 2*(width+height);
	}

	@Override
	public double area() { //must be implemented!
		return width*height;
	}

	@Override
	public String toString() {
		return "\tRectangle [width=" + width + ", heigth=" + height + " " + super.toString() + "]";
	}

}
