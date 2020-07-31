package com.phdareys.towns.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTable;

import com.phdareys.towns.model.Country;

public class ViewCountry extends JFrame {
	static final long serialVersionUID = 1L;

	public ViewCountry (Country [] tPays) {
		super(); 
		setTitle("CONTINENT/PAYS/VILLES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String[] header = {"Continent", "Pays", "Pop", "Villes", "Num"}; 

		// récup nb max de villes pour dimensionner tableau
		int nbLignesMax = 0;
		for (Country p:tPays)
			nbLignesMax += p.getTowns().size();
		String[][] data = new String[nbLignesMax][header.length] ;
		//System.out.println(tailleMax);
		int i=0;
		for (Country p:tPays) { // boucle sur Pays
			for (int k=0; k < p.getTowns().size(); k++) { // sur Villes
				int j=0;
				data[i][j++] = p.getContinent(); // 3 colonnes seulement
				data[i][j++] = p.getName();
				data[i][j++] = Integer.toString(p.getPop())
						;			
				data[i][j++] = p.getTowns().elementAt(k);
				data[i][j++] = (k+1) +
						"/"+ p.getTowns().size();
				i++; // attention 1 ligne par VILLE!!
			}			
		}
		JTable tableau = new JTable(data, header);
		getContentPane().add(tableau.getTableHeader(), BorderLayout.NORTH);
		getContentPane().add(tableau, BorderLayout.CENTER);
		//getContentPane().add(new JTextField ("test"));
		
		pack();
		setVisible (true); 
	}
	
}

