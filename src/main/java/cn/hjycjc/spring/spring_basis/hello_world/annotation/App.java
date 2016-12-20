package cn.hjycjc.spring.spring_basis.hello_world.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.hjycjc.spring.spring_basis.hello_world.annotation.controller.UserController;
import cn.hjycjc.spring.spring_basis.hello_world.annotation.repository.UserRepository;
import cn.hjycjc.spring.spring_basis.hello_world.annotation.service.UserService;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext_bean_annotation.xml");
		
		TestObject to =(TestObject) ctx.getBean("testObject");
		to.pri();
		
		UserController userController =(UserController) ctx.getBean("userController");
		userController.execute();
		
		UserRepository userRepository =(UserRepository) ctx.getBean("userRepositoryImpl");
		userRepository.save();
		
		UserService userService =(UserService) ctx.getBean("userService");
		userService.add();
	}
}
