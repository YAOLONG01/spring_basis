package cn.hjycjc.spring.spring_basis.hello_world.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext_bean_spel.xml");
		
		Person person=ctx.getBean(Person.class);
		System.out.println(person.toString());
	}

}
