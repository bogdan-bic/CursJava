package curs3;

import java.util.Scanner;

public class AskAge {

	int age;
	
	public void askUserForAge() {
		System.out.println("Please insert your age: " );
		Scanner scan = new Scanner(System.in);
		age = scan.nextInt();
		scan.close();
		checkAge();
	}
	
	public void checkAge() {
		if(age < 0) {
			System.out.println("Numar incorect!");			
		}else if(age < 18) {
			System.out.println("Esti minor!");
		}else if(age <= 65) {
			System.out.println("Esti adult!");
		}else {
			System.out.println("Esti batran!");
		}
	}
}
