package curs1;

public class CalculatorSalariu {

	int oreLucrate  = 40;
	
	public static void main(String[] args) {
		
		// definim Tester1
		Tester tester1 = new Tester();
		
		tester1.setNume("Oana");
		tester1.setRatePerHour(25);
		tester1.setAge(28);
		
		System.out.println(tester1.getNume() + " castiga " + tester1.getRatePerHour() + " lei/ora si are " + tester1.getAge() + " ani!");
		//System.out.println(tester1.getRatePerHour());
		//System.out.println(tester1.getNume() + " are:" + tester1.getAge() + " ani!");
		
		// definim Tester2
		Tester tester2 = new Tester();
		
		tester2.setNume("Ionel");
		tester2.setRatePerHour(30);
		tester2.setAge(32);
		
		System.out.println(tester2.getNume() + " castiga " + tester2.getRatePerHour() + " lei/ora si are " + tester2.getAge() + " ani!");
		//System.out.println(tester2.getRatePerHour());
		//System.out.println(tester2.getNume() + " are:" + tester2.getAge() + " ani!");

		
		CalculatorSalariu calc = new CalculatorSalariu();
		//System.out.println(calc.calculeazaSalariu(tester1.getRatePerHour()));
		System.out.println("\n---------------------------------------");
		System.out.println("Salariul lui " + tester1.getNume()  + " este de " + calc.calculeazaSalariu(tester1.getRatePerHour()) + " lei");
		System.out.println("Salariul lui " + tester2.getNume()  + " este de " + calc.calculeazaSalariu(tester2.getRatePerHour()) + " lei");
	}

	public int calculeazaSalariu(int rateHour) {
		
		int salariu = oreLucrate * rateHour;		
		return salariu;
	}
	
}
