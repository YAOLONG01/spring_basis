package cn.hjycjc.spring.spring_basis.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.hjycjc.spring.spring_basis.transaction.UserAccountException;
import cn.hjycjc.spring.spring_basis.transaction.dao.BookShopDao;



@Service

public class BookShopServiceImpl implements BookShopService{
	@Autowired
	private BookShopDao bookShopDao;
	
//	@Transactional(propagation=Propagation.REQUIRES_NEW,isolation=Isolation.READ_COMMITTED,
//			noRollbackFor={UserAccountException.class},timeout=3,readOnly=false)
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void purchase(String userName, String isbn) {
		//系列操作,有一定顺序的操作
		int price =bookShopDao.findBookPriceByIsbn(isbn);
		
		bookShopDao.updateBookStock(isbn);
		
		bookShopDao.updateUserAccount(userName, price);
		
	}
}
