
public class Binary {

	public static void main(String[] args) {
		
		for ( int i=0; i<16; i++ )  {
			String str = Integer.toBinaryString( i );
			while ( str.length() < 4 )  str = "0" + str;
			System.out.println(str);
		}
		
		
		int value1 = 0b1010_1010;
		int value2 = 0b0000_1111;
		
		System.out.println("NOT - " + Integer.toBinaryString( ~value1 ));
		System.out.println("AND - " + Integer.toBinaryString( value1 & value2 ));
		System.out.println("OR  - " + Integer.toBinaryString( value1 | value2 ));
		System.out.println("XOR - " + Integer.toBinaryString( value1 ^ value2 ));
		
		
		// << left shift 	- 	un decalage vers la gaucje revient a multiplier par 2
		// >> right shift	- 	un decalage de bit vers la droite divise par 2
		System.out.println("<<  - " + Integer.toBinaryString( value2 << 2 ) + 
				value2 + " [" + value2 + " -> " + (value2 << 2) + "]");
		System.out.println(">>  - " + Integer.toBinaryString( value2 >> 2 ) + 
				value2 + " [" + value2 + " -> " + (value2 >> 2) + "]");
		
		
		// &=	|= 	⁼	<<= 	>>=
		value1 <<= 2;	// value1 = value1 << 2;
		System.out.println("<<  - " + Integer.toBinaryString( value1 ));
		
		// prochainement les nombres flottant
		//https://koor.fr/Java/TutorialVideos/TypesAndOperators.wp
		 
	}
}
