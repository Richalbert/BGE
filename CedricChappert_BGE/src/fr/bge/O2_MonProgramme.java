
package fr.bge;


public class O2_MonProgramme {

	public static void main(String[] args) {
		String chaine1 = args[0];
		String chaine2 = args[1];

		int a = Integer.parseInt(chaine1);
		int b = Integer.parseInt(chaine2);
		
		int somme = a + b;
		
		System.out.println("Le resultat de " + a + " + " + b + " = " + somme); 
		
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("permutation");
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("simple message");  
		System.err.println("error message"); 	
	}

}
