package cn.hjycjc.spring.spring_basis.hello_world.spel;

public class Car {
	private String brand;
	private int price;
	private double Perimeter;
	
	public Car() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public Car(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getPerimeter() {
		return Perimeter;
	}

	public void setPerimeter(double perimeter) {
		Perimeter = perimeter;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", Perimeter=" + Perimeter + "]";
	}
	
}
