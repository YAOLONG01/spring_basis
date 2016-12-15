package cn.hjycjc.spring.spring_basis.hello_world.bean_factory;

import java.util.HashMap;
import java.util.Map;
/*
 * 静态工厂，有静态方法。直接调用每一个类的静态方法,就可以返回Bean的实例。之前配置Bean,是Bean对应
 * 一个类，现在是Bean对应静态工厂返回的类实例。
 */
public class StaticCarFactory {
	private static Map<String, Car> cars=new HashMap<String,Car>();
	//放在这代表是静态的属性，直接赋值
/*	static{
		cars.put("AUDI",new Car("Audi",3000000));
		cars.put("BMW", new Car("BWM",4000000));
	}*/
	
	public static Car getCar(String branchName){
		//放在这，是用构造函数后赋值
		cars.put("AUDI",new Car("Audi",3000000));
		cars.put("BMW", new Car("BWM",4000000));

		System.out.println(cars.get("AUDI"));
		return cars.get("AUDI");
	}

} 
