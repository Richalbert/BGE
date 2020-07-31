/**
 * le but du programme : implementer l'algo du code insee, 
 * cad trouver la cle de 2 chiffres des 13 chiffres du code insee
 * 
 * src : http://serge.mehl.free.fr/exos/cle_INSEE.html
 * 
 * nir designe les 13 premiers chiffre du code insee
 * cle est calculee par C = 97 - ( nir modulo 97)
 * 
 * @author richard
 *
 */

public class CodeInsee {

	public static void main(String[] args) {
		
		Insee nathalie = new Insee(2690549588157L);
		System.out.println("num secu = " + nathalie.getCode13());	
		System.out.println("cle = " + nathalie.getCle());
		System.out.println("code15 = " + nathalie.getCode15());
		
		Insee richard = new Insee(1601175110153L);
		System.out.println("num secu = " + richard.getCode13());
		System.out.println("cle = " + richard.getCle());
		System.out.println("code15 = " + richard.getCode15());

	}

}
