package cn.hjycjc.spring.spring_basis.Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * 用于学习 Spring AOP;
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext_SpringAOP.xml");
		ArithmeticCalculator arithmeticCalculator =ctx.getBean(ArithmeticCalculator.class);
		
		int result =arithmeticCalculator.add(1, 3);
		System.out.println(result);
		result =arithmeticCalculator.mul(3, 2);
		System.out.println(result);
		result =arithmeticCalculator.sub(3, 2);
		System.out.println(result);
		result =arithmeticCalculator.div(8, 2);
		
	}

}
