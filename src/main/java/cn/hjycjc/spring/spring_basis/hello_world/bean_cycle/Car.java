package cn.hjycjc.spring.spring_basis.hello_world.bean_cycle;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.springframework.context.annotation.Bean;

import com.sun.org.apache.xml.internal.security.Init;

public class Car {
	private String brand;
	private int price;
	
	public Car() {
		//super();
		// TODO Auto-generated constructor stub
		System.out.println("Car constructor ...");
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
		System.out.println("Car set Brand ...");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void forInit(){
		System.out.println("Car Bean init ...");
		
	}
	public void forDestory(){
		System.out.println("Car Bean destory ...");
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}

}
