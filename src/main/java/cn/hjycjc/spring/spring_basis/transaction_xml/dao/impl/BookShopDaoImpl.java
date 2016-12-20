package cn.hjycjc.spring.spring_basis.transaction_xml.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import cn.hjycjc.spring.spring_basis.transaction.BookStockException;
import cn.hjycjc.spring.spring_basis.transaction_xml.UserAccountException;
import cn.hjycjc.spring.spring_basis.transaction_xml.dao.BookShopDao;



public class BookShopDaoImpl implements BookShopDao{
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int findBookPriceByIsbn(String isbn) {
		
		String sql ="SELECT price FROM book WHERE isbn=?";
		
		int result=jdbcTemplate.queryForObject(sql, Integer.class,isbn);
		return result;
	}
	
	/*
	 * 检查书的库存是否不够，不够抛出异常
	 */
	@Override
	public void updateBookStock(String isbn) {
		//检查
		String sql1="SELECT stock FROM book_stock WHERE isbn=?";
		
		int stock=jdbcTemplate.queryForObject(sql1, Integer.class,isbn);
		if (stock ==0){
			//抛异常
			throw  new BookStockException("库存不足");
		}
		
		String sql ="UPDATE book_stock SET stock=stock - 1 WHERE isbn=?";
		jdbcTemplate.update(sql,isbn);
		
	}
	/*
	 * 检查余额是否不足，不足抛异常
	 */
	@Override
	public void updateUserAccount(String userName, int price) {
		String sql1="SELECT balance FROM account WHERE username=? ";
		int balance=jdbcTemplate.queryForObject(sql1, Integer.class,userName);
		
		if(balance<=price){
			throw new UserAccountException("余额不足");
		}
		
		String sql = "UPDATE account SET balance= balance-? WHERE username=?";
		jdbcTemplate.update(sql,price,userName);
		
	}
}