package com.llf.spring.day5_17.SH_integrate.dao.impl;


import com.llf.spring.day5_17.SH_integrate.dao.BookShopDao;
import com.llf.spring.day5_17.SH_integrate.exception.BookStockException;
import com.llf.spring.day5_17.SH_integrate.exception.UserAccountException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookShopDaoImpl implements BookShopDao {
    /**
     * //不推荐使用 HibernateTemplate 和 HibernateDaoSupport
     * //因为这样会导致 Dao 和 Spring 的 API 进行耦合
     * //可以移植性变差
     * //	private HibernateTemplate hibernateTemplate;
     */
    @Autowired
    private SessionFactory sessionFactory;

    //获取和当前线程绑定的 Session.  !!!!!!
    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    //通过图书编号查询价格
    @Override
    public int findBookPriceByIsbn(String isbn) {
        String hql = "select b.price FROM Book b WHERE b.isbn = ?";
        Query query = getSession().createQuery(hql).setString(0, isbn);
        return (Integer) query.uniqueResult();
    }

    //通过编号查询图书库存，并更新库存
    @Override
    public void updateBookStock(String isbn) {
        String hql1 = "SELECT b.stock FROM Book b WHERE b.isbn = ?";
        Number number = (Number) getSession().createQuery(hql1).setString(0, isbn).uniqueResult();
        int stock = number.intValue();
        if (stock == 0) {
            throw new BookStockException("库存不足!");
        }
        String hql2 = "UPDATE Book b SET b.stock = b.stock -1 WHERE b.isbn = ?";
        int result = getSession().createQuery(hql2).setString(0, isbn).executeUpdate();
    }

    //用户资金更新
    @Override
    public void updateUserAccount(String username, int price) {
        String hql1 = "SELECT a.balance FROM Account a WHERE a.userName = ?";
        Number number = (Number) getSession().createQuery(hql1).setString(0, username).uniqueResult();
        int balance=number.intValue();
        if (balance < price) {
            throw new UserAccountException("资金不足!");
        }

        String hql2 = "UPDATE Account a SET a.balance = a.balance - ? WHERE a.userName = ?";
        getSession().createQuery(hql2).setInteger(0,price).setString(1,username).executeUpdate();

    }

}
