package cn.hjycjc.spring.spring_basis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.hjycjc.spring.spring_basis.transaction.dao.BookShopDao;

public class TestTransactionApp {
	private ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext_jdbcTemplate_transaction_dbProperties.xml");
	
	private BookShopDao bookShopDao =ctx.getBean(BookShopDao.class);
	
	@Test
	public void testFindBookPriceByIsbn(){
		System.out.println(bookShopDao.findBookPriceByIsbn("1001"));
	}
	

}
