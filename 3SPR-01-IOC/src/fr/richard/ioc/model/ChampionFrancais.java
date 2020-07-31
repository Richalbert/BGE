package fr.richard.ioc.model;

/**
 * c la classe B
 * @author richard
 *
 */
public class ChampionFrancais implements TennisCapable {

	@Override
	public void etreEndurant() {
		System.out.println("je suis endurant");
	}

	@Override
	public void servirFort() {
		System.out.println("je sers fort");
	}

	@Override
	public void joueTennis() {
		System.out.println("je joue au tennis");
	}

}
