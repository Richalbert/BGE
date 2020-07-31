package controller;

import model.Carre;
import model.Cercle;
import model.Form;
import model.Rectangle;

public class FormMain {

	public static void main(String[] args) {
		
		Form cercle = new Cercle(1, 2, 3);
		Form rectangle = new Rectangle(4, 5, 6, 7);
		Form carre = new Carre(8,9,10);
				
		double deplacement = 11;
		Form [] forms = { cercle, rectangle, carre };
		for (Form form : forms) {
			System.out.println("\tMove x&y of: " + (int)deplacement + " from: "	+ (int)form.getX() + " & " + (int)form.getY());
			form.moveXY(deplacement, deplacement);
			System.out.println(form);
		}

		
	}
	
	
	
}
