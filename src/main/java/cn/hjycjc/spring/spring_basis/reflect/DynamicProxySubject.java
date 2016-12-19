package cn.hjycjc.spring.spring_basis.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxySubject implements InvocationHandler{
	private Object sub;
	
	
	public DynamicProxySubject() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public DynamicProxySubject(Object sub) {
		//super();
		this.sub = sub;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		
	    System.out.println( " before calling "  + method);
	    method.invoke(sub,args);
	    System.out.println( " after calling "  + method);
		return null;
	}
	
}
