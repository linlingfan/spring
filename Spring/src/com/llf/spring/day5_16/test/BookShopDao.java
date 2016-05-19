package com.llf.spring.day5_16.test;

public interface BookShopDao {

	public int findBookPriceByIsbn(String isbn);

	public void updateBookStock(String isbn);

	public void updateUserAccount(String username, int price);
}
