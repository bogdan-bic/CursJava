package curs3;

import java.util.Scanner;

public class GreatestOfThreeNumbers {
	
	int number1;
	int number2;
	int number3;

	public void askTheUserForThreeNUmbers() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Pleas einsert the first number: ");
		number1 = scan.nextInt();
		
		System.out.println("Pleas einsert the second number: ");
		number2 = scan.nextInt();
		
		System.out.println("Pleas einsert the third number: ");
		number3 = scan.nextInt();
		scan.close();
	}
	
	
	public void compareTheNumbers() {
		
		if(number1 > number2 && number1 > number3) {
			
			System.out.println("Number 1 is the greatest!");

	}else if(number2 > number3 && number2 > number1) {

		System.out.println("Number 2 is the greatest!");
		
	}else if(number3 > number1 && number3 > number2){
	
		System.out.println("Number 3 is the greatest!");
		
	}else {
		System.out.println("Some of the numbers are equal");

	}
}
}

