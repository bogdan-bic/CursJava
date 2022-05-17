package curs4;

public class TernaryOperator {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 10;
		
		int x = (num1>num2)?num2:num1;
		
		/*
		 * Este num1>num2 : true? - daca da, atunci num2 va fi atribuit lui x
		 * Este num1>num2 : false? - atunci nu1 va fi atribuit lui x
		 * 
		 */
		
		System.out.println("Valoare lui x cu operator conditional: " + x);
		
		if(num1>num2) {
			
			System.out.println("Valoare lui x in IF/ELSE: " + x);
		}else {
			System.out.println("Valoare lui x in IF/ELSE: " + x);

		}
		
		
		/*
		 * Nu se recmanda pentru mai multe operatii caci devine greu de citit. Ex:
		 * 
		 * int num3 = 2
		 * 
		 * int x = (num1>num2)?:(num2<num3?num2:num3);
		 * 	  
		 */
				
		
	}

}
