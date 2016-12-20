package cn.hjycjc.spring.spring_basis.Aop;

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

@Order(5)
@Aspect
@Component
public class LoggingAspect {
	
	//用于声明切入点表达式的方法,其中不写代码
	@Pointcut("execution(* cn.hjycjc.spring.spring_basis.Aop.ArithmeticCalculator.*(..))")
	public void declareJoinPointExpression(){}
	
	@Before("declareJoinPointExpression()")
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
	@AfterReturning(value="execution(* cn.hjycjc.spring.spring_basis.Aop.ArithmeticCalculator.*(..))",
			returning="result")
	public void afterReturningMethod(JoinPoint joinPoint,Object result){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The Method "+ methodName+ " ends with "+result);
	}
	@AfterThrowing(value="execution(* cn.hjycjc.spring.spring_basis.Aop.ArithmeticCalculator.*(..))",
			throwing="e")
	public void afterThrowingMethod(JoinPoint joinPoint,Exception e){
		System.out.println("The Methods "+joinPoint.getSignature().getName()+" occures with "+e);
	}
/*	@Around("execution(* cn.hjycjc.spring.spring_basis.Aop.ArithmeticCalculator.*(..))")
	public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint){
		Object result =null;
		try{
			
		result =proceedingJoinPoint.proceed();
		
		}catch (Throwable e){
			
		}
		
		return result;
	}*/

}
