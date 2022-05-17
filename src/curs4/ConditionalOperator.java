package curs4;

import java.util.Scanner;

public class ConditionalOperator {

	/**
	 * Citeste 2 numere de la tastatura
	 * Verifica daca ambele numere sunt pozitive
	 * Verifica daca fiecare numar este pozitiv
	 * Verifica care dintre cele 2 este mai mic
	 * 
	 */
	
	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Please insert first number: "); num1 = scan.nextInt();
		  
		  System.out.println("Please insert second number: "); num2 = scan.nextInt();
		  scan.close();
		  
		  
			/*
			 * //verificam ca primul nr este pozitiv if(num1 > 0) {
			 * System.out.println("Num 1 is positive"); }else {
			 * System.out.println("Num 1 is negative"); }
			 * 
			 * //verificam ca al 2-lea numar este pozitiv if(num2 > 0) {
			 * System.out.println("Num 2 is positive"); }else {
			 * System.out.println("Num 2 is negative"); }
			 * 
			 * //verificam ca ambele nr sunt pozitive if(num1 > 0 && num2 > 0) {
			 * System.out.println("Both numbers are positive"); }else {
			 * System.out.println("One numbers is negative"); }
			 * 
			 * //verifica, care este nr mai mic dintre cele 2 if(num1 < num2 ) {
			 * System.out.println("Num 1 is the smallest"); }else if(num1 == num2) {
			 * System.out.println("Numbers are equale"); }else {
			 * System.out.println("Num 2 is th3 smallest"); }
			 */
		 
		
		
		// Ce e mai sus se poate scrie asa:
		
		//variabila = expresie ? expresie2:expresie3
		//result = num1>0? "Num 1 is positive" : "Num 1 is negative"
		//System.out.println(result);
		
		String result;
		
		result = num1>0 ? "Num 1 is positive" : "Num 1 is negative";
		System.out.println(result);
		
		result = num2>0? "Num 2 is positive" : "Num 2 is negative";
		System.out.println(result);
		
		result = num1>0 && num2>0 ? "Both nr are positive": "One number is negative";
		System.out.println(result);
		
		result = num1 == num2 ? "Numbers are equal": num1<num2 ? "NUmber1 is the smallest": "Number 2 is the smallest";
		System.out.println(result);
	}
	
	
}
