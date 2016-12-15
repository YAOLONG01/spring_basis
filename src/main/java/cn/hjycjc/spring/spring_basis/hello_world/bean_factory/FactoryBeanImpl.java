package cn.hjycjc.spring.spring_basis.hello_world.bean_factory;

import org.springframework.beans.factory.FactoryBean;

public class FactoryBeanImpl implements FactoryBean<Car>{
	
	//返回Bean实例
	@Override
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car("DaZhong",2000000);
	}
	
	/*
	 * @return Bean的类型
	 * @see org.springframework.beans.factory.FactoryBean#getObjectType()
	 */
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}


}
