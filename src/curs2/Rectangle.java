package curs2;

public class Rectangle {

	// Variabile de instanta
	private int lenght;
	private int width;
	private String name;
	
//	public Rectangle() {
//		lenght = 5;
//	}


	public Rectangle(int nr1, int nr2) {
		setLenght(nr1);
		setWidth(nr2);
	}

//	public Rectangle(int nr1, int nr2, String Name() {
//		setLenght(nr1);
//		setWidth(nr2);
//		name = Name;
//	}
	
	public void calculateTotal() {
		int total = lenght + width;
	}
	
	
	public int getLength() {
		return lenght;
	}
	
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
}
