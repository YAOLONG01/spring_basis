package cn.hjycjc.spring.spring_basis.transaction.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.hjycjc.spring.spring_basis.transaction.dao.BookShopDao;
import sun.tools.jar.resources.jar;

//基于JdbcTemplate实现
@Repository("bookShopDao")
public class BookShopDaoImpl implements BookShopDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int findBookPriceByIsbn(String isbn) {
		String sql ="SELECT price FROM book WHERE isbn=?";
		
		int result=jdbcTemplate.queryForObject(sql, Integer.class,isbn);
		return result;
	}

	@Override
	public void updateBookStock(String isbn) {
		String sql ="UPDATE book_stock SET stock=stock - 1 WHERE isbn=?";
		jdbcTemplate.update(sql,isbn);
		
	}

	@Override
	public void updateUserAccount(String userName, int price) {
		String sql = "UPDATE account SET balance= balance-? WHERE username=?";
		jdbcTemplate.update(sql,price,userName);
		
	}
	
	
}
