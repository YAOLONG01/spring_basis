package cn.hjycjc.spring.spring_basis.hello_world.bean_generic_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_bean_generic.xml");
		
		UserService userService =(UserService) context.getBean("userService");
		userService.add();
	}

}
