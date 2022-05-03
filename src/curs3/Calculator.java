package curs3;

import java.util.Scanner;

public class Calculator {
	
	/**
	 * Calculator pentru operatiile de baza: +. -, *, / cu 2 numere
	 * 
	 * Intrebam userul primul numar
	 * Intrebam operatia matematica pe care vrea sa o execute
	 * Intrebam al 2-lea numar
	 * Printam numerele, operatia si rezultatul
	 * Ex: 2 + 3 = 5
	 */

	int number1;
	int number2;
	char operator;
	int result;
	
	public void askTheUser() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert the first number: ");
		number1 = scan.nextInt();
		System.out.println("Please eneter the operation");
		operator = scan.next().charAt(0);
		System.out.println("Please insert the second number: ");
		number2 = scan.nextInt();
		scan.close();
	}
	
	public void calculateValuses() {
		if(operator == '+') {	
			result = number1 + number2;
			printResult();

		}else if(operator == '-') {
			result = number1 - number2;
			printResult();
		
		}else if(operator == '/') {
			result = number1 / number2;
			printResult();
		}else if(operator == '*' || operator == 'x' ) {
			result = number1 * number2;
			printResult();
		}else {
			System.out.println("Please insert a valid operator between: +, -, *, x, /");
		}
	}
	
	
	public void printResult() {
		System.out.println(number1 + " " + operator + " " + number2 + " = " + result);

	}
}
