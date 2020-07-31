import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

	public static void methode1() throws FileNotFoundException {
		System.out.println("je suis dans methode 1");
		methode2();
	}
	
	public static void methode2() throws FileNotFoundException {
		System.out.println("je suis dans methode 2");
		
		File file = new File("toto.txt");	
		//if (!file.exists()) throw (new Exception("Pas trouve"));	
		FileReader fR = new FileReader(file);
	}
	
	/**
	 * main appelle methode1 qui appelle methode2 qui leve une exception
	 * et que l'on propage jusqu'en dans le main ou elle est levee
	 * @param args
	 */
	public static void main(String[] args)  {
		
		System.out.println("je suis dans le main");
		try {
			methode1();
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.err.println("--> File Not Found : " + e.getMessage());
		}
		
		
		
		
		
		
		try {
			double solde = 5;
			double reste = retirer10(solde);
			System.out.println("Solde : " + reste);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}


	
	
 public static double retirer10 (double montant) throws Exception {
		
	 if (montant < 10 ) throw new Exception("solde inferieur a 10"); 
		return montant - 10;
	}
 
 
 public static void lireFichier (String nomFichier)  {
		try {
			FileReader fichier = new FileReader(nomFichier);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void lireFichier2 (String nomFichier) throws FileNotFoundException {
		FileReader fichier = new FileReader(nomFichier);
	
	}
}
