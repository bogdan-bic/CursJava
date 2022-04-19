package curs1;

public class Tester {

	//variabile
	
	public String nume;
	public int ratePerHour;
	
	/**
	 * Constructor
	 */
	public Tester( ) {}
	public Tester(String Prenume) {
		nume = Prenume;
	}


	//metode
	
	public String getNume() {
		return nume;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public int getRatePerHour() {
		return ratePerHour;
	}
	
	public void setRatePerHour(int ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	
	
	
	
}


