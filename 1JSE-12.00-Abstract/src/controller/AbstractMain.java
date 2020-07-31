package controller;

import model.Telephone;
import model.Samsung;
import model.Wiko;

public class AbstractMain {

	public static void main(String[] args) {
	
		Telephone p = new Samsung("Samsung");
		p.sell(300);
		System.out.println(p.getName() + " : " + p.getPrice());

		
		p = new Wiko("Wiko");
		p.sell(300);
		System.out.println(p.getName() + " : " + p.getPrice());
				
	}

}
