package cn.hjycjc.spring.spring_basis.hello_world.bean_cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImpl implements  BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessBeforeInitialization:"+bean.toString()+","+beanName);
		//未使用Spring的Bean
		Car car =new Car();
		car.setBrand("BMW");
		
		return car;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessAfterInitialization:"+bean.toString()+","+beanName);
		return bean;
	}
	
}
