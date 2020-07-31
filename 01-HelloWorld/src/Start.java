import java.util.Arrays;
import java.util.Scanner;

public class Start {
	
	public static void main(String[] args) {

		System.out.println("Hello");
		System.out.println(Arrays.toString(args));
		System.out.println("Hello " + args[0]);

		System.out.println("Entrer un nombre : ");
		Scanner sc = new Scanner(System.in);
		int nb = sc.nextInt();

		sc.close();
		System.out.println("Le nombre saisie est " + nb);
	}
}

/*
 

$ java Start Richard
Hello
[Richard]
Hello Richard
Entrer un nombre : 
25
Le nombre saisie est 25


*/
