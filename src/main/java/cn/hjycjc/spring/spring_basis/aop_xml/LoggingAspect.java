package cn.hjycjc.spring.spring_basis.aop_xml;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.weaver.patterns.Declare;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

public class LoggingAspect {
	
	public void beforeMethed(JoinPoint joinPoint){
		String methodName=joinPoint.getSignature().getName();
		List<Object> agrs = Arrays.asList(joinPoint.getArgs());
		System.out.println("AOP -> The Method "+methodName+" begins with "+agrs);
	}
	
	public void afterMethod(JoinPoint joinPoint){
		String methodName=joinPoint.getSignature().getName();
		
		System.out.println("AOP -> The Method "+methodName+" ends");
	}
	
	public void afterReturningMethod(JoinPoint joinPoint,Object result){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The Method "+ methodName+ " ends with "+result);
	}
	
	public void afterThrowingMethod(JoinPoint joinPoint,Exception e){
		System.out.println("The Methods "+joinPoint.getSignature().getName()+" occures with "+e);
	}

	public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint){
		Object result =null;
		try{
			//前置通知
			System.out.println("***");
		result =proceedingJoinPoint.proceed();
		
		}catch (Throwable e){
			
		}
		
		return result;
	}

}
