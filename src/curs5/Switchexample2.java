package curs5;

import java.util.Scanner;

public class Switchexample2 {

	static int number1;
	static int number2;
	static char operator;
	static int result;
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert the first number: ");
		number1 = scan.nextInt();
		System.out.println("Please eneter the operation");
		operator = scan.next().charAt(0);
		System.out.println("Please insert the second number: ");
		number2 = scan.nextInt();
		scan.close();
		result = 0;
		
		switch(operator) {
		
		case '+':
			result = number1 + number2;
			printResult();
			break;
		case '-':
			result = number1 - number2;
			printResult();
			break;
		case '*':
			result = number1 * number2;
			printResult();
			break;
		case 'x':
			result = number1 * number2;
			printResult();
			break;
		case '/':
			result = number1 / number2;
			printResult();
			break;
		default:
			System.out.println("Invalid operator!");		
		}
	}
	
	public static void printResult() {
	System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
	}
}
