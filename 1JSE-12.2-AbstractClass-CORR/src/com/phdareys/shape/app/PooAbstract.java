package com.phdareys.shape.app;

import com.phdareys.shape.exceptions.ShapeException;
import com.phdareys.shape.model.Disk;
import com.phdareys.shape.model.Rectangle;
import com.phdareys.shape.model.Shape;
import com.phdareys.shape.model.Square;

/*
 * abstract class: circle&Rectangle extends AC GeoForm
 * move them them display all : position+perimeter+area
 */
public class PooAbstract {

	public static void main(String[] args) {
		System.out.println ("Start Prog...");
		int [] dataIn = {1,2,3,   4,5,6,7,8,   9,10,11,  12,};
		int i=0;
		try {			// initialize inside an array
			Shape [] gFArray = {
					new Disk (dataIn[i++], dataIn[i++], dataIn[i++]),
					new Rectangle (dataIn[i++], dataIn[i++], dataIn[i++], dataIn[i++]),
					new Square (dataIn[i++], dataIn[i++], dataIn[i++]),
			};
			for (Shape gF: gFArray) {
				System.out.println ("\t\tMove x&y of: " + dataIn[i] + 
						" from: " + gF.getX() + " & " +gF.getY());
				gF.moveOf (dataIn[i], dataIn[i]);	// a little move
				System.out.println (gF); // displays all info (position+area+perimeter
			}
		}
		catch ( ShapeException e) {
			e.display();
		}
		System.out.println ("End Prog");
	}

}
