package curs3;

public class TestCar {

	public static void main(String[] args) {

		Car car = new Car("toyota", "T");
    	car.carDetails();
		
		Car car2 = new Car("honda", "H");
		
		Car.type = "sedan";
		
		car.carDetails();
		car2.carDetails();
	}

}
