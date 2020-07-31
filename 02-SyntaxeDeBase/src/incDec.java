
public class incDec {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(++a);	// l increment est fait avant utilisation
		
		a = 10;
		System.out.println(a++);	// increment est fait apres utilisation
		
		
	int part1 = 10;
	int part2 = 20;
	//int result = part1++ + part2++;
	int result = ++part1 + ++part2;
	System.out.println(result);
	}
}
