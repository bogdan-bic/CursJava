package curs5;

import java.util.Scanner;

public class DoWhileExample {

	/**
	 * intrebam utilizatorul un numar
	 * inmultim numarul cu 10
	 * printam rezultatul operatiei
	 * intrebam alt numar pana cand utilizatorul introduce numarul 0 si atunci iesim din program
	 */
	
	public static void main(String[] args) {

	int number;
	
	do {

		System.out.println("Introdu te rog un numar: ");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		System.out.println(number * 10);
		//scan.close();

	}while(number !=0 );
	System.out.println("Ai ieist din program!");
  }
}