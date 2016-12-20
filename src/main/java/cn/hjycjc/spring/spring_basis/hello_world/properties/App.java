package cn.hjycjc.spring.spring_basis.hello_world.properties;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	/*
	 * 测试c3p0和bean使用外部属性文件
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext_ bean_db_properties.xml");
		
		//之所以可以强制转换，是因为ComboPooledDataSource实现javax.sql.DataSource接口
		DataSource dataSource =(DataSource) ctx.getBean("dataSource");
		
		System.out.println(dataSource.getConnection());
	}

}
