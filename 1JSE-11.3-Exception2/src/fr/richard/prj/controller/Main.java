package fr.richard.prj.controller;


import fr.richard.prj.exception.PrjException;
import fr.richard.prj.model.ExempleClass;

public class Main {

	public static void main(String[] args) {
		
		ExempleClass obj = new ExempleClass();
		
		
		obj.start();
		
		try {
			obj.run();
		} catch (PrjException e) {
		
			e.affiche();
		} finally {
			obj.finish();
		}
		

	}


	
}
