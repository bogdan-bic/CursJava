package curs4;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		/*
		 * && -> short circuit
		 * & - > and
		 * 
		 * (x!=0) & (1/x>5) --> evalueaza (x!=0) si dupa (1/x>5) apoi aplica conditia
		 * (x!=0) && (1/x>5)  --> evalueaza (x!=0) doar daca prima conditie e true evalueaza si (1/x>5)
		 * 
		 * a | b --> evalueaza A si apoi B dupa care face | OR
		 * a || b --> evalueaza A si doar daca A etse false atunci evalueaza si B
		 * 
		 */


	int x = 0;
	
	if((x!=0) && (1/x>5)) {
		
		System.out.println("True");
		
	}else {
		
		System.out.println("False");
	}
		
	}

}
