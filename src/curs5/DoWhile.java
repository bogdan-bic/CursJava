package curs5;

public class DoWhile {

	public static void main(String[] args) {

		String[] array = {"zero", "one", "two", "three", "four"};
		int i = 0;
		
		do {
			
			System.out.println(array[i]);
			i++;
			
		}while(i<array.length);
		
		
	}

}
