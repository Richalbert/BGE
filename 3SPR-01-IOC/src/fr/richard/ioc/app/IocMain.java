package fr.richard.ioc.app;

import fr.richard.ioc.model.TennisCapable;
import fr.richard.ioc.model.TennisFactory;

/**
 * c la casse A
 * Inversion Of Control : c pas toi qui va chercher !!!
 * @author richard
 *
 */
public class IocMain {

	public static void main(String[] args) {
		
		TennisFactory f = new TennisFactory("Tennis Club Toulouse");
		
		TennisCapable jouer = f.get();
		
		jouer.etreEndurant();
		jouer.servirFort();
		jouer.joueTennis();
		

	}

}
