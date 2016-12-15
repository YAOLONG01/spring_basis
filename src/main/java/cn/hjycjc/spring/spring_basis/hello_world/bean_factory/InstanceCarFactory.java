package cn.hjycjc.spring.spring_basis.hello_world.bean_factory;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {
	private Map<String, Car> cars=new HashMap<String,Car>();
	//新建一个无参的构造方法
	public InstanceCarFactory() {
		cars.put("AUDI", new Car("Audi",3000000));
		cars.put("BMW", new Car("BWM",4000000));
	}
	//实例工厂的(非静态)方法
	public Car getCar(String key){
		return cars.get(key);
	}
	
	

}
