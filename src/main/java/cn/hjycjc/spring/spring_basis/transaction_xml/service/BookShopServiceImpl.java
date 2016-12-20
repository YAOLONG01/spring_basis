package cn.hjycjc.spring.spring_basis.transaction_xml.service;

import cn.hjycjc.spring.spring_basis.transaction_xml.dao.BookShopDao;

public class BookShopServiceImpl implements BookShopService{

	private BookShopDao bookShopDao;
	
	public BookShopDao getBookShopDao() {
		return bookShopDao;
	}

	public void setBookShopDao(BookShopDao bookShopDao) {
		this.bookShopDao = bookShopDao;
	}

	public void purchase(String userName, String isbn) {
		//系列操作,有一定顺序的操作
		int price =bookShopDao.findBookPriceByIsbn(isbn);
		
		bookShopDao.updateBookStock(isbn);
		
		bookShopDao.updateUserAccount(userName, price);
		
	}
}
