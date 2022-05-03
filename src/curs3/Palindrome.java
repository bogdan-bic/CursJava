package curs3;

public class Palindrome {
	
	// radar
	
	public void checkIfWordIsPalindrom(String cuvant) {
		
		String cuvantIntors = "";
		
		for(int i = cuvant.length()-1; i>=0; i--) {
			
			cuvantIntors = cuvantIntors + cuvant.charAt(i);
		}
			
		System.out.println("Cuvantul original este: " + cuvant);
		System.out.println("Cuvantul intors este: " + cuvantIntors);
		
		
		if(cuvantIntors.equals(cuvant)) {
			System.out.println("Cuvantul este palindrom");
					
		}else {
			System.out.println("Cuvantul NU este palindrom");
		}
		
	}
	

}
