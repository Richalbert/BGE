package com.phdareys.shape.model;

import com.phdareys.shape.exceptions.ShapeException;

public class Square extends Rectangle {
			// Square is a rectangle with width=height (called side)
	public Square(int x, int y, int side)  throws ShapeException {
		super(x, y, side, side);
	}

	@Override
	public String toString() {
		return "\tSquare [side=" + width + ", x=" + this.x + ", y=" + this.y + 
					", perim()=" + perim() + ", area()=" + area() + "]";
	}
	
}
