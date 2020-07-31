
public class TypesFlottants {

	public static void main(String[] args) {
	
		float f1 = 3.14f;				// 4 octets
		double f2 = 3.14 ;				// 8 octets
		
		// les constantes sont double par defaut
		
		System.out.println(f1 + " - " + f2);
		
		// 2 formes de representation de flottants
		double first = 1.234;
		double second = 1234e-3;
		System.out.println(first + " - " + second);
		
		double result = 1 / 3;			// division entiere entre 2 constante entiere
		System.out.println(result);	
		
		result = 1 / 3.0;				// 3.0 est une constante typee double
		System.out.println(result);
		// aire
		// Valeurs possibles
		double essai1 = 3.1415;
		double essai2 = Double.POSITIVE_INFINITY; 		// 3 / 0.0;
		double essai3 = Double.NaN;						// 0.0 / 0.0;		// NaN - Not a Number
		System.out.println(essai1 + " - " + essai2 + " - " + essai3);
		
		// https://www.youtube.com/watch?time_continue=440&v=uLbKbtPtJqw&feature=emb_logo
		// 15:00
	}

}
