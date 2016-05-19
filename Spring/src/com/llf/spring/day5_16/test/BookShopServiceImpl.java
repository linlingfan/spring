package com.llf.spring.day5_16.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookShopServiceImpl implements BookShopService {
	@Autowired
	private BookShopDao bookShopDao;
	@Autowired
	public void setBookShopDao(BookShopDao bookShopDao) {
		this.bookShopDao = bookShopDao;
	}

	/**
	 * 1.使用propagetion 指定事务的传播行为，即当前的事务被另一个事务调用时，要如何使用事务
	 * requeired是默认的，使用另一个的事务。
	 * REQUIRES_NEW 是指使用当前的事务，当前事务成功就提交，虽然另一个调用这个事务出现异常
	 * 2.使用isolation指定事务的隔离级别，常用读以提交，（Isolation.READ_COMMITTED）
	 * 3.默认情况下spring的声明式事务对所有的运行时异常进行回滚，也可以通过对应的属性进行设置！通常默认即可
	 * 如：noRollbackFor = {UserAccountException.class}对这个异常不回滚
	 * 4.使用readOnly指定事务是否为只读，表示这个事务只读数据库但不更新数据，这样可以帮助数据库引擎优化事务；
	 * 若为只读设为readOnly=true
	 * 5.使用timeout指定强制回滚之前事务可以占用的时间。如果这个事务占用的时间超过timeout指定的值，会强制回滚
	 *
	 * @param username
	 * @param isbn
	 */
	@Override
//	@Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED
//			noRollbackFor= {UserAccountException.class})
	@Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED
	,readOnly = true)

	public void purchase(String username, String isbn) {
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {}

		int price = bookShopDao.findBookPriceByIsbn(isbn);
		bookShopDao.updateBookStock(isbn);
		bookShopDao.updateUserAccount(username, price);
	}

}
