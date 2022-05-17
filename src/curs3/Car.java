package curs3;

public class Car {

	public static String brand;
	public static String type;
	public static String engine;
	
	public Car(String brand, String engine){
		Car.brand = brand;
		Car.engine = engine;
		type = "SUV";
	}
	
	public static void carDetails() {
		System.out.println("All " + brand + " cars are " + engine + " and are of type " + type);
	}
}
