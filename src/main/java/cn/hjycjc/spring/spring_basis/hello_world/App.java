package cn.hjycjc.spring.spring_basis.hello_world;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import cn.hjycjc.spring.spring_basis.hello_world.collections.Person;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//1.新建HelloWord的实例
		HelloWorld helloWorld=new HelloWorld();
		//2.使用set方法给属性赋值
		helloWorld.setName("spring_basis");
		*/
		//上面的1，2可以由Spring完成
		//1_1 创建Spring的IOC容器
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");		
		//2_2获取bean
		HelloWorld helloWorld= (HelloWorld) ctx.getBean("helloWorld");
	
		//3.使用方法
		helloWorld.hello();
		
		Car car=(Car) ctx.getBean("car");
		System.out.println(car.toString());
		
		HelloWorld helloWorld2 =(HelloWorld) ctx.getBean("helloWorld2");
		helloWorld2.hello();
		
	}

}
