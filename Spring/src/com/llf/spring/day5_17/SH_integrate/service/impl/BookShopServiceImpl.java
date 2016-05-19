package com.llf.spring.day5_17.SH_integrate.service.impl;

import com.llf.spring.day5_17.SH_integrate.dao.BookShopDao;
import com.llf.spring.day5_17.SH_integrate.service.BookShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookShopServiceImpl implements BookShopService {

	@Autowired
	private BookShopDao bookShopDao;


	@Override
	public void purchase(String username, String isbn) {
		int price = bookShopDao.findBookPriceByIsbn(isbn);
		bookShopDao.updateBookStock(isbn);
		bookShopDao.updateUserAccount(username, price);

	}

}
