package video11;

public class CompteDemo {

	public static void main(String[] args) {
		
		Compte c = new Compte();
		
		int s = c.retirer(50);
		System.out.println("J ai retire " + s);
		s = c.retirer(50);
		System.out.println("J ai retire " + s);
	}

}
