package cn.hjycjc.spring.spring_basis.hello_world.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");		
		
		Person person =(Person) ctx.getBean("oldPerson");
		System.out.println(person.toString());
		
		Person2 person2= (Person2) ctx.getBean("person2");
		System.out.println(person2.toString());
		
		Person person3 =(Person) ctx.getBean("oldPerson2");
		System.out.println(person3.toString());
	}

}
