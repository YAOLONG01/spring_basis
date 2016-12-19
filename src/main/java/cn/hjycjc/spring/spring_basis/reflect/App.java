package cn.hjycjc.spring.spring_basis.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class App {
	public static void main(String[] args) {
		//使用代理之前，应该有真实角色
		RealSubject realSubject =new RealSubject();
/*		//使用静态代理
		Subject subject =new ProxySubject(realSubject);
		subject.request();*/
		//使用动态代理
		//真实角色的类构造器，能够实现其所用方法和属性
		ClassLoader loader = RealSubject.class.getClassLoader();
		//真实角色的类信息
		Class[] interfaces =RealSubject.class.getInterfaces();
		//h参数难理解，InvocationHandler
		InvocationHandler h =new DynamicProxySubject(realSubject);
		
		//使用动态代理，动态代理实例不是new出来的
		//要有3个参数
		Subject subject =(Subject) Proxy.newProxyInstance(loader, interfaces, h);
		subject.request();
	}

}
