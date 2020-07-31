package fr.bge;

public class Exo1 {

	public static void main(String[] args) {
		int v = 0;
		v++;
		int amount = v++;
		System.out.println(++v + " " + amount);		// 3 1
		System.out.println(v);						// 3
		
		boolean canITakeHisMoney;
		int hisBalance = 5;
		long myBalance = 4;
		hisBalance += 8;
		canITakeHisMoney = hisBalance > myBalance;
		canITakeHisMoney = canITakeHisMoney&& (hisBalance >= 3);
		System.out.println(canITakeHisMoney);		// Vrai
	}
}
