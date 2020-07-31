package fr.bge;

public class Cours_typePrimitif {

	public static void main(String[] args) {
		
		// une reference
		String maMachine = new String( "TOTO" );
		maMachine = "TATA";
		System.out.println(maMachine);
		
		int nombre = 0;
		char lettre = 'r';
		boolean booleen = true;
		
		System.out.println( nombre + " - " + lettre + " - " + booleen );
		
		// classe est un type d objet , une categorie
		
		// les types primitifs entiers
		byte  monByte  = 127;
		short monShort = 20;
		int   monInt   = 30;
		long  monLong  = 40L;		// car type int
		
		// les types flottants
		float monFloat = 1.3f;	// car type double
		double monDouble = 1.25;
		
		monDouble = Double.MAX_VALUE;
		monDouble = Double.MIN_VALUE;
		monFloat = (float) monDouble;
		System.out.println(monFloat);
		
		// types entiers
		
		monShort = monByte;
		monShort = (short) monInt;
		monShort = (short) monLong;
		
		monInt =  monByte;
		monInt =  monShort;
		monInt = (int) monLong;
		
		monLong = monByte;
		monLong = monShort;
		monLong = monInt;
		
		// Types flottants
		
		monLong = Long.MAX_VALUE;
		System.out.println(monLong);
		monInt = (int) monLong;
		System.out.println(monInt);
		
		
		monByte = Byte.MAX_VALUE;
		System.out.println(monByte);
		
		monShort = Short.MAX_VALUE;
		System.out.println(monShort);
		monByte = (byte) monShort;
		System.out.println(monByte);
	}
}
