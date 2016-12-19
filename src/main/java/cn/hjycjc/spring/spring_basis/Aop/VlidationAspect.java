package cn.hjycjc.spring.spring_basis.Aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(4)
@Aspect
@Component
public class VlidationAspect {
	
	@Before("execution(* cn.hjycjc.spring.spring_basis.Aop.ArithmeticCalculator.*(..))")
	public void beforeMethodVlidation(JoinPoint joinPoint){
		
		String methodName=joinPoint.getSignature().getName();
		System.out.println("Vlidation: "+methodName+" "+Arrays.asList(joinPoint.getArgs()));
		
	} 
	//使用声明函数
	@After("cn.hjycjc.spring.spring_basis.Aop.LoggingAspect.declareJoinPointExpression()")
	public void afterMethod(){
		System.out.println("...");
	}
	

}
