package cn.hjycjc.spring.spring_basis.hello_world.bean_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext_beanFactory.xml");
		Car car = (Car) ctx.getBean("car_f");
		
		System.out.println(car.toString());
		
		Car car2 =(Car) ctx.getBean("car");
		System.out.println(car2);
		
		Car car3 =(Car) ctx.getBean("car1");
		System.out.println(car3);
		
	}

}
