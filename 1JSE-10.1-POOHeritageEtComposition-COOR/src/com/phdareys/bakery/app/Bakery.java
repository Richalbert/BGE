package com.phdareys.bakery.app;

import com.phdareys.bakery.model.Baker;
import com.phdareys.bakery.model.Employee;
import com.phdareys.bakery.model.Firm;
import com.phdareys.bakery.model.Product;
import com.phdareys.bakery.model.Seller;
import com.phdareys.bakery.model.SpecialProduct;
import com.phdareys.bakery.view.ViewBakery;

public class Bakery {

	public static void main(String[] args) {
			// products
		Product bag = new Product("baguette", 0.10F, 0.78F);
		Product croiss = new Product("croissant", 0.15F, 1.10F);
		Product pain = new Product("pains de mie", 0.35F, 2.50F);
		//SpecialProduct choc = new SpecialProduct("Chocolate Box", 3.2F, 10.2F, 250);
			// members
		Seller violaine = new Seller("Violaine");
		Seller virginie = new Seller("Virginie");
		Baker bernard = new Baker("Bernard");
			// actions
		bernard.make(bag, 80);
		bernard.make(pain, 25);
		bernard.make(croiss, 60);
		//bernard.make(choc, 20);
		violaine.sell(bag, 75);
		violaine.sell(croiss, 50);
		virginie.sell(pain, 20);
		//virginie.sell(choc, 10);
			// myFirm
		Firm myBakery = new Firm("AuBonPain");
		myBakery.hire(new Employee[] {violaine, virginie, bernard});
		myBakery.run();
			// view
		new ViewBakery(myBakery);
		
	}

}
