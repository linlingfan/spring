package com.llf.spring.day5_16.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CashierImpl implements Cashier {
@Autowired
	private BookShopService bookShopService;

	@Autowired
	public void setBookShopService(BookShopService bookShopService) {
		this.bookShopService = bookShopService;
	}

	@Transactional
	@Override
	public void checkout(String username, List<String> isbns) {
		for(String isbn: isbns){
			bookShopService.purchase(username, isbn);
		}
	}

}
