package com.llf.spring.day5_16.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

public class SpringTransactionTest {

	private ApplicationContext ctx = null;
	private BookShopService bookShopService = null;
	private Cashier cashier = null;
	
	{
		ctx = new ClassPathXmlApplicationContext(
				"com/llf/spring/day5_16/test/applicationContext-tx-xml.xml");
		bookShopService = ctx.getBean(BookShopService.class);
		cashier = ctx.getBean(Cashier.class);
	}

	//测试事务的传播行为 默认是required，几个事务一起，但始终只算一个事务，一个不成功回滚到初始状态！
	@Test
	public void testTransactionlPropagation(){
		cashier.checkout("hh", Arrays.asList("0001", "0002"));
	}

	@Test
	public void testBookShopService(){
		bookShopService.purchase("hh", "0001");
	}
	
}
