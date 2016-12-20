package cn.hjycjc.spring.spring_basis.aop_xml;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

public class ValidationAspect {
	
	public void beforeMethodVlidation(JoinPoint joinPoint){
		
		String methodName=joinPoint.getSignature().getName();
		System.out.println("Validation: "+methodName+" "+Arrays.asList(joinPoint.getArgs()));
		
	} 
	
	public void afterMethod(){
		System.out.println("...");
	}
	

}
