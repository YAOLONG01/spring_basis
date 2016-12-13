package cn.hjycjc.spring.spring_basis.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext3.xml");		
		
		Address address = (Address) ctx.getBean("address");
		System.out.println(address);
		
		address = (Address) ctx.getBean("address2");
		System.out.println(address);
		
		Car car =(Car) ctx.getBean("car1");
		System.out.println(car.toString());
		
		car =(Car) ctx.getBean("car2");
		System.out.println(car.toString());
		
		Person person = (Person) ctx.getBean("person");
		System.out.println(person.toString());
	}
}
