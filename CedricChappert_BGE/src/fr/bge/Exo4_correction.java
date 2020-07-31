package fr.bge;

public class Exo4_correction {
	
	public static void main(String[] args) {
		
		if ( args.length != 2 ) {
			System.out.println("Le programme n a pas 2 arguments, sortie");
			System.exit(0);
		}
		
		String calcul = args[0];
		float rayon = Float.parseFloat(args[1]);
		if ( rayon <= 0 ) {
			System.out.println("Le rayon doit etre positif");
			System.exit(0);
		}
		
		System.out.println("Action de calcul = " + calcul );
		System.out.println("Rayon du cercle = " + rayon );
	
		if ( calcul.equals("aire") ) {
			System.out.println("L'aire du cercle = " + (Math.PI * rayon * rayon) );
		} else if ( calcul.equals("perimetre") )  {
			System.out.println("Le perimetre du cercle = " + ( 2 * Math.PI * rayon ));
		} else {
			System.out.println("Le type de calcul n est pas supporte : " + calcul);
			System.exit(0);
		}
	}
}
