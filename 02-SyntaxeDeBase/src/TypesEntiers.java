
public class TypesEntiers {

	public static void main(String[] args) {
		
		int counter = 10;
		counter ++;
		System.out.println( counter );
		counter --;
		System.out.println( counter );
		
		// regles sur les noms de variables
		int var2 = 100;
		int nom_complexe = 200;			// Deconseille - c pour les constantes
		int nom$complexe = 300;			// Deconseille - $ c pour les noms de classes anonymes
		int nomélémentaire = 400;		// Deconseille - les accents pas beau
		// int 2var = 500;				NE PEUT PAS COMMENCER PAR UN CHIFFRE
		int nomComplexe = 600;
		System.out.println(var2 + " " + nom_complexe + " " + nom$complexe + " " + nomélémentaire + " " + nomComplexe);
		
		
		
		// Les 4 types entiers
		byte monOctet = 127;				// 	1 octet : -128 a 127
		System.out.println( monOctet );
		short monShort = 32767;				//	2 octets: -32768 a 32767
		System.out.println( monShort );
		int monInt = 1_000_000_000;			// 4 octets
		System.out.println( monInt );
		long monLong = 10_000_000_000L;		// 8 octets - il faut typer la constante avec le suffixe L pour long
		System.out.println( monLong );
		
		
		// Les 4 bases numeriques
		int decimalValue = 10; 				// 10 digits de 0 .. 9
		int binaryValue = 0b1100_1010	;			// 2 digits 0 et 1
		System.out.println(binaryValue);
		int octalValue = 010;				// 8 digit de 0 .. 7
		System.out.println(octalValue);
		int hexadecimalValue = 0xFF_FF;		// 16 digits de 0 .. 9 A .. F
		System.out.println(hexadecimalValue);
		
		
		// Les operateurs sur valeurs entieres: 	++ -- 		+ - * / %		+= -= *= /= %=
		int a = 5;
		int b = 3;
		int result = a % b ;
		System.out.println(result);
		
		
		byte b1 = 100;
		byte b2 = 100;
		int sum = b1 + b2;
		
		
		int currentValue = 1;
		currentValue *= 5;
		currentValue *= 5;
		System.out.println(currentValue);
		
		
//		int value2 = 3;
//		int test value2 / 0;
//		System.out.println(test);
//		
		
		
		
	}

}
