package cn.hjycjc.spring.spring_basis;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.hjycjc.spring.spring_basis.transaction_xml.dao.BookShopDao;
import cn.hjycjc.spring.spring_basis.transaction_xml.service.BookShopService;
import cn.hjycjc.spring.spring_basis.transaction_xml.service.Cashier;

public class TestTransaction_xmlApp {
	private ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext_jdbcTemplate_transaction_dbProperties_xml.xml");
	
	private BookShopDao bookShopDao =ctx.getBean(BookShopDao.class);
	
	private BookShopService bookShopService=(BookShopService) ctx.getBean("bookShopService");
	
	private Cashier cashier =ctx.getBean(Cashier.class);
	
	//@Test
	public void testFindBookPriceByIsbn(){
		System.out.println(bookShopDao.findBookPriceByIsbn("1001"));
	}
	
	//@Test
	public void testUpdateBookStock(){
		String isbn="1001";
		bookShopDao.updateBookStock(isbn);
	}
	//@Test
	public void testUpdateUserAccount(){
		String userName ="AA";
		int price = bookShopDao.findBookPriceByIsbn("1001");
		
		bookShopDao.updateUserAccount(userName, price);
		
	}
	
	//@Test
	public void testPurchase(){
		String userName ="AA";
		String isbn ="1001";
		bookShopService.purchase(userName, isbn);
	}
	
	@Test
	public void testCheckout(){
		String userName="AA";
		List<String> listIsbn =Arrays.asList("1001","1002");
		cashier.checkout(userName, listIsbn);
	}

}
