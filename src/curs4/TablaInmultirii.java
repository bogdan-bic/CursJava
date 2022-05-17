package curs4;

import java.util.Scanner;

public class TablaInmultirii {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu un numar: ");
		int n = scan.nextInt();
		scan.close();
		System.out.println("-------------------------");
		System.out.println("Tabla inmultirii de la 1 la 10 pentru " + n + " este: \n");

		for(int i = 1; i <= 10; i++) {

			System.out.println(n + " * " + i + " = " + n*i);
			
		}
		
	}

}
