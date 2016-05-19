package com.llf.spring.day5_17.SH_integrate.dao;

public interface BookShopDao {

	public int findBookPriceByIsbn(String isbn);

	public void updateBookStock(String isbn);

	public void updateUserAccount(String username, int price);
}
