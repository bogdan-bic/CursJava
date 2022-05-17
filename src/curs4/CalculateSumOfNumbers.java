package curs4;

import java.util.Scanner;

public class CalculateSumOfNumbers {

	public static void main(String[] args) {

	
		Scanner scan = new Scanner(System.in);
		System.out.println("Haw many numbers you want to gather ?");
		int n = scan.nextInt();
		
		int sum = 0;
		
		Scanner scan2 = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			
     		System.out.println("Please enter number " + i +":");
			sum += scan2.nextInt();

		}
		scan.close();
		scan2.close();
		
		System.out.println("------------------------");
		System.out.println("The sum of numbers is: " + sum);

	}

}
