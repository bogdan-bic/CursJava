package curs2;

public class Shape {
	
	private int lenght;
	private int width;
	private double raza;
	
	// ++++++++++++++++  Constructori ++++++++++++++++
	
	public Shape(int lenght) {
		this.lenght = lenght;
		calculateSquareArea();
	}
	
	public Shape(int lenght, int width) {
		this.lenght = lenght;
		this.width = width;
		calculateRectangleArea();
	}
	
	public Shape(double raza) {
		this.raza = raza;
		System.out.println("The area of the cicle is: " + raza * raza * Math.PI);
	}
	
	
	// ++++++++++++++++ Metode ++++++++++++++++
	
	public void calculateSquareArea() {
		System.out.println("The area of the square is: " + lenght * lenght);
	}
	
	public void calculateRectangleArea() {
		System.out.println("The area of the rectangle is: " + lenght * width);
	}
		
}
