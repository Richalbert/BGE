import java.util.Scanner;

public class EntreeSortieClavier {

	public static void main(String[] args) {

		
//		System.out.println("Entrer votre nom : ");
//		Scanner sc1 = new Scanner(System.in);
//		String firstName = sc1.nextLine();
//		sc1.close();	
//	
//		System.out.println("Entrer votre age : ");
//		Scanner sc2 = new Scanner(System.in);
//		String age = sc2.nextLine();
//		sc2.close();	
//			
//		String str = "Bonjour " + firstName + " tu as " + age + " ans";
//		System.out.println(str);	
//
//	sortie :
//		
//		Entrer votre nom : 
//			richard
//			Entrer votre age : 
//			Exception in thread "main" java.util.NoSuchElementException: No line found
//				at java.base/java.util.Scanner.nextLine(Scanner.java:1651)
//				at EntreeSortieClavier.main(EntreeSortieClavier.java:15)	
		

		
	    Scanner sc = new Scanner(System.in);  
	    
        System.out.print("Entrer votre nom : ");    
        String firstName = sc.next();       
        
        System.out.print("Entrer votre age: ");  
        int age = sc.nextInt();  

        sc.close();
        
        String str = "Bonjour " + firstName + " tu as " + age + " ans";
        System.out.println(str);  
	}

}
