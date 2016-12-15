package cn.hjycjc.spring.spring_basis.hello_world.bean_cycle;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext_bean_cycle.xml");
		
		Car car=(Car) ctx.getBean("car");
		System.out.println(car.toString());
		
		//关闭Bean
		ctx.close();
	}

}
