package video13;

public class Principale {

	public static void main(String[] args) {
		
		for (int i = 0; i<10; i++) {
			Chat c = new Chat();
			System.out.println(c.toString());
		}
		
		// appel de la methode de la classe Chat ( ou methode static)
		System.out.println( (Chat.getDernierTatouageAttribue()) );
		
		// les classes fonctionnent comme les classes
		// on met en static les classes utilitaires
		
		//Exemple
		float f = 3.5f;
		String sf = String.valueOf(f); 	// on fabrique une String a partir d un float
		System.out.println(sf);
		
	}

}
