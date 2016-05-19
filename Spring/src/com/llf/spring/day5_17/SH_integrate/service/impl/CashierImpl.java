package com.llf.spring.day5_17.SH_integrate.service.impl;



import com.llf.spring.day5_17.SH_integrate.service.BookShopService;
import com.llf.spring.day5_17.SH_integrate.service.Cashier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CashierImpl implements Cashier {
@Autowired
	private BookShopService bookShopService;
	@Override
	public void checkout(String username, List<String> isbns) {
		for(String isbn: isbns){
			bookShopService.purchase(username, isbn);
		}
	}

}
