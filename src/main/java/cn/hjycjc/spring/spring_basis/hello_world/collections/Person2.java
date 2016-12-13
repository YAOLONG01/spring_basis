package cn.hjycjc.spring.spring_basis.hello_world.collections;

import java.util.Map;

import cn.hjycjc.spring.spring_basis.hello_world.Car;

public class Person2 {
	private String name;
	private int age;
	private Map<String, Car> cars;

	public Person2() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public Person2(String name, int age, Map<String, Car> cars) {
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

	public Map<String, Car> getCars() {
		return cars;
	}

	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "Person2 [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}
	
}
