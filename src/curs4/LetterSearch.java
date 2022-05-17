package curs4;

import java.util.Scanner;

public class LetterSearch {

	/*
	 * Citim de la tastatura un text
	 * Cautam litera a in text
	 * daca o gasim printam am gasit litera si de cate ori am gasit-o
	 * daca nu o gasim, printam nu am gasit litera
	 */
	
	
	public static void main(String[] args) {
					
	
		System.out.println("Please enter text: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		scan.close();
		char letter = 'A';
		int counter = 0;
		
		for(int i = 0; i<text.length(); i++) {
			
			char currentLetter = text.charAt(i); 
			//System.out.println(currentLetter);
			if(currentLetter == letter || currentLetter == 'a') {
				counter++;
			}

		}
		
		String result = counter > 0 ? "Letter " + letter + " appeared " + counter + " times": "The letter " + letter + " was not found.";
		System.out.println(result);
		
		
	}

}
