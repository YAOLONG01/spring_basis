package cn.hjycjc.spring.spring_basis.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext2.xml");		
		
		Person person =(Person) ctx.getBean("person");
		System.out.println(person.toString());
	}
}
