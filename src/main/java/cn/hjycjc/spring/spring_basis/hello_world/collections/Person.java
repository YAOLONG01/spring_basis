package cn.hjycjc.spring.spring_basis.hello_world.collections;

import java.util.List;
import cn.hjycjc.spring.spring_basis.hello_world.Car;

public class Person {
	private String name;
	private int age;
	private List<Car> cars;

	public Person() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, List<Car> cars) {
		super();
		this.name = name;
		this.age = age;
		this.cars = cars;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}
	
}
