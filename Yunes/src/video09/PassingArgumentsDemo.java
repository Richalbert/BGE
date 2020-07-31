package video09;

import java.util.ArrayList;

// appel par valeur ou appel par copie

public class PassingArgumentsDemo {	

	public static void f(int a) {	// le parametre formel est celui que l on recoit ... sous le nom a 
		System.out.println("f a recu " + a);
		a = a + 1;
		System.out.println("f a modifie la valeur de a qui est " + a );
	}
	

	
	// l et li sontdes references vers des ArrayList
	// Or l et li designent le meme objet
	// car ce sont 2 references differentes qui pointent vers le meme objet
	
	public static void f(ArrayList<Integer> l) {
		System.out.println("f a recu " + l);
		l.add(666);
		System.out.println("f a modifie " + l);
	}
	
	
	public static void main(String[] args) {
		
		int x = 12;
		System.out.println("(avant l 'appel) x vaut " + x);
		f(x);	// le pararametre effectif est celui qu on envoie ... x
		System.out.println("(apres l 'appel) x vaut " + x);
		
		ArrayList<Integer> li = new ArrayList<Integer>();
		System.out.println("(avant l'appel) " + li);
		f(li);
		System.out.println("(avant l'appel) " + li);
	}
}
