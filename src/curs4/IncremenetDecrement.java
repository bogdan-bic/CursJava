package curs4;

public class IncremenetDecrement {

	public static void main(String[] args) {

		// num++  --> Post increment
		// num = num + 1
		// ++num -> Pre increment
		// num = num + 1
		System.out.println("-----------POST----------------");
		int num = 10;
		System.out.println("Valoarea lui num inainte de increment: " + num);
		System.out.println("Valoarea lui num in post increment: " + num++);
		System.out.println("Valoarea lui num Dupa post increment: " + num);
		
		
		System.out.println("-----------PRE----------------");
		int num2 = 10;
		System.out.println("Valoarea lui num2 inainte de increment: " + num2);
		System.out.println("Valoarea lui num2 in pre increment: " + ++num2);
		System.out.println("Valoarea lui num2 Dupa post increment: " + num2);

		
		// pre increment 
		// ++num
		// post increment
		// num++
		// pre decrement
		// --num
		// post decrement
		// num--
		
	}

}
