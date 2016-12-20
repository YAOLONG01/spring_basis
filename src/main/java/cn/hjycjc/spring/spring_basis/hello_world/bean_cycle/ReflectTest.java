package cn.hjycjc.spring.spring_basis.hello_world.bean_cycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest {
	//构造器
	public static Dog initByDefaultConst() throws Throwable{ 
		//通过类加载器获取Dog类对象 
		ClassLoader loader =Thread.currentThread().getContextClassLoader();
		Class clazz= loader.loadClass("cn.hjycjc.spring.spring_basis.hello_world.bean_cycle.Dog");
		//获取类的默认构造器对象并通过它实例化Dog 
		Constructor cons = clazz.getDeclaredConstructor((Class[]) null);
		Dog dog = (Dog)cons.newInstance();
		//通过反射方法设置属性
		Method setNames=clazz.getMethod("setName", String.class);
		setNames.invoke(dog, "旺财");
		Method setAge=clazz.getMethod("setAge", Integer.class);
		setAge.invoke(dog, 6);
		
		System.out.println(dog.toString());
		return dog;
		
	}
	 public static void main(String[] args) throws Throwable{ 
	     Dog dog = initByDefaultConst(); 
	     dog.toString(); 
	 } 
}
