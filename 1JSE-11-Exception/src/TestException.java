import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class TestException{

	public static void main(String[] args) {
		int i = 0;

		//		System.out.println(2/i);
		//		
		//		sortie :
		//			
		//			Exception in thread "main" java.lang.ArithmeticException: / by zero
		//			at Exception1.main(Exception1.java:7)
		//		


		// ***************
		// Maj + Alt + Z
		// ***************

		int denominateur = 0;
		int numerateur = 25;
		int resultat = 0;
		String tab [] = { "toto","titi"};


		try {
			String str = tab[8];
			resultat = numerateur/denominateur;	
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("hors du tableau");
		} catch (ArithmeticException e) {
			System.out.println("division par zero impossible");
		}


		

		/*********************************************************************************
		 * 4 - erreur non surveillée: par exemple un age doit être compris entre 1 et 110
		 * ********************************************************************************/

		System.out.println("4 - Erreur non surtveillee ...");
		int tab2[] = {2,4};
		int age = 130;
		
		File file = new File("toto.txt");
		try {
			FileReader fR = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			if (age > 110) {
				throw new Exception("age entre 1 et 110 ans");
			}
			System.out.println(tab2[8]);
			//System.out.println(3/0);
		} catch (ArithmeticException e1) {
			System.out.println("Erreur division par zero");
		} catch (ArrayIndexOutOfBoundsException e1 ) {
			System.out.println("Erreur depassement de tableau");
		} catch (Exception e1 ) {
			System.out.println("Autre erreur : "+e1.getMessage());
		}
		System.out.println("tout est ok");
	

	
	}
}
