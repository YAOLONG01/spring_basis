package cn.hjycjc.spring.spring_basis.transaction_xml.service;

import java.util.List;


public class CashierImpl implements Cashier {
	

	private BookShopService bookShopService;
	
	

	public BookShopService getBookShopService() {
		return bookShopService;
	}



	public void setBookShopService(BookShopService bookShopService) {
		this.bookShopService = bookShopService;
	}



	public void checkout(String userName, List<String> listIsbn) {
		for(String isbn:listIsbn){
			bookShopService.purchase(userName, isbn);
		}
	}

}
