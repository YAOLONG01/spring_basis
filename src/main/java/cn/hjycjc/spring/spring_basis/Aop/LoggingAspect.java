package cn.hjycjc.spring.spring_basis.Aop;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	@Before("execution(* cn.hjycjc.spring.spring_basis.Aop.ArithmeticCalculator.*(..))")
	public void beforeMethed(JoinPoint joinPoint){
		String methodName=joinPoint.getSignature().getName();
		List<Object> agrs = Arrays.asList(joinPoint.getArgs());
		System.out.println("AOP -> The Method "+methodName+" begins with "+agrs);
	}
	@After("execution(* cn.hjycjc.spring.spring_basis.Aop.ArithmeticCalculator.*(..))")
	public void afterMethod(JoinPoint joinPoint){
		String methodName=joinPoint.getSignature().getName();
		
		System.out.println("AOP -> The Method "+methodName+" ends");
	}

}
