package curs5;

import java.util.Scanner;

public class DiceGame {

	/**
	 * Joc de zaruri
	 * 
	 * Reguli:
	 * - daca userul da  in total: 2, 6, 12  --> Pierde jocul
	 * - daca userul da in total: 7, 11 --> Castiga jocul
	 * - daca userul da in total: 3, 10 --> Repeta aruncare
	 * - daca da oricare alta varianta decat cele de mai sus, il intrebam daca mai vrea sa dea inca odata
	 *   - raspunsul trebuie sa fie boolean: true / false
	 *  
	 */
		
	public static void main(String[] args) {


		boolean condition = true;

		while(condition) {
			
			int dice1 = (int) (Math.random()*6+1);
			int dice2 = (int) (Math.random()*6+1);
			int total = dice1 + dice2;
			
			System.out.println("Ai dat: " + total);
			
			// case pierde
			if(total == 2 || total == 6 || total == 12) {
				System.out.println("Ai dat: " + total + " Ai pierdut !");
				break;
			}
			// case castiga
			else if(total == 7 || total == 11) {
				System.out.println("Ai dat: " + total + " Ai castigat !");
				break;
			}
			// case repeta automat
			else if(total == 3 || total == 10) {
				System.out.println("Ai dat: " + total + " Automat mai dai o tura !");
				continue;
			}
			
			//case mai da o tura
			System.out.println("Mai dai o data? ");
			Scanner scan = new Scanner(System.in);
			condition = scan.nextBoolean();		
			
		}
		
		System.out.println("Game over!");

	}

}
