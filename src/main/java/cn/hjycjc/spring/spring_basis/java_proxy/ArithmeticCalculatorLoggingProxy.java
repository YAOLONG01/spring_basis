package cn.hjycjc.spring.spring_basis.java_proxy;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

import org.aopalliance.intercept.Invocation;

public class ArithmeticCalculatorLoggingProxy {
	//抽象角色，真实对象和代理对象的公共的接口(interface类)，代理对象中有公共接口
	private ArithmeticCalculator targe;
	//代理对象有对真实对象的引用，
	public ArithmeticCalculatorLoggingProxy(ArithmeticCalculator targe) {
		//super();
		this.targe = targe;
	}
	
	public ArithmeticCalculator getLoggingProxy(){
		
		ArithmeticCalculator loggingProxy=null;
		
		/*
		 * 目标类，先获取目标类再获取其加载器；
		 */
		ClassLoader loader = targe.getClass().getClassLoader();
		/*
		 * interfaces：.class的所有信息，ArithmeticCalculator.class的所有信息
		 */
		Class[] interfaces = new Class[]{ArithmeticCalculator.class};
		/*
		 * 由于InvocationHandler是接口，要实现
		 */
		InvocationHandler h =new InvocationHandler() {
			/*
			 * @param
			 * proxy:正在返回的那个代理对象，一般情况下，在invoke方法中都不使用该对象。
			 * method:正在被调用的方法
			 * args:参数
			 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
			 */
			@Override
			//反射机制
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("Dynamic -> The method "+ method.getName()+" begins with"+Arrays.asList(args));
				Object result =null;
				try{
					//可以放前置通知
					result=method.invoke(targe, args);
					//返回通知
					
				}catch (Exception e){
					System.out.println(e);
					//异常通知
				}
				//后置通知，获取不到返回值。
				//
				System.out.println("Dynamic ->The method "+ method.getName()+" end with "+result);
				return result;
			}
		};
		/*
		 * 使用java.lang.reflect.Proxy，创建一个代理类
		 * @param loader:类加载器；interfaces:.class的所有信息；h：即是InvocationHandler调用处理程序
		 * @return 一个代理类
		 */
		loggingProxy=(ArithmeticCalculator) Proxy.newProxyInstance(loader, interfaces, h);
		return loggingProxy;
	}
	

}
