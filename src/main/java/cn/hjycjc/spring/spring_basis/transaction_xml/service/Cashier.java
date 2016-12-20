package cn.hjycjc.spring.spring_basis.transaction_xml.service;

import java.util.List;

public interface Cashier {
	
	public void checkout(String userName,List<String> listIsbn);

}
