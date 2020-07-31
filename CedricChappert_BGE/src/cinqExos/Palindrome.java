package cinqExos;

import java.util.Scanner;




public class Palindrome {

	/*
	 * Q : Ecrire un programme qui détermine si une chaîne est un palindrome
	 */
	
	
	public static boolean checkPalindrome(String mot, char[] tom) {
		
		boolean palindrome = true;
		
		for (int i = 0; i < mot.length(); i++) {
			if ( mot.charAt(i) != tom[i] ) {
				palindrome = false;
				break;
			}
		}
		
		return palindrome;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez le palindrome à tester :");
		String mot = sc.nextLine();
		
		char [] tom = new char[mot.length()];	

		for (int i = 0; i < mot.length(); i++) {
			tom[i] = mot.charAt( mot.length() - (i + 1) );
		}
		
		System.out.println("palindrome : " + checkPalindrome(mot, tom) );
		
		sc.close();
	}
}
