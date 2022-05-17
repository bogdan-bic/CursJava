package curs5;

import java.util.Scanner;

public class WhileLoopExample {

	/*
	 * Program care calculeaza salariul pe o saptamana
	 * Intrebam utilizatorul cate ore a lucrat
	 * calculam daca a lucrat maxim 40 ore pe sapt si minim o ora pe sapt
	 * daca introduce un numar valid, il intrebam din nou
	 * rate per hour este 15
	 */
	
	public static void main(String[] args) {

		//ce stim 
		int maxNumberHoursWorked = 40;
		int ratePerHour = 15;
		
		//ce nu stim 
		System.out.println("Cate ore ai lucrat saptamana asta ? ");
		Scanner scan = new Scanner(System.in);
		int hoursWorked = scan.nextInt();
		
		//validarea
		while(hoursWorked < 1 || hoursWorked > maxNumberHoursWorked) {
			System.out.println("Numar invalid!");
			System.out.println("Te rog introdu un numar intre 1 si 40: ");
			hoursWorked = scan.nextInt();
		}

		System.out.println("Salariul este:" + hoursWorked * ratePerHour);
	}

}
