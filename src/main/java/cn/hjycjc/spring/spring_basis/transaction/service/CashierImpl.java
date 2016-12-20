package cn.hjycjc.spring.spring_basis.transaction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CashierImpl implements Cashier {
	
	@Autowired
	private BookShopService bookShopService;
	
	@Transactional
	@Override
	public void checkout(String userName, List<String> listIsbn) {
		for(String isbn:listIsbn){
			bookShopService.purchase(userName, isbn);
		}
	}

}
