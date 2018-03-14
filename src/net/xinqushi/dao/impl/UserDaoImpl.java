package net.xinqushi.dao.impl;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import net.xinqushi.common.HibernateUtils;
import net.xinqushi.dao.UserDAO;
import net.xinqushi.model.User;
@Repository
public class UserDaoImpl implements UserDAO {

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.openSession();
		session.beginTransaction();
		session.merge(user);
		session.getTransaction().commit();
		session.close();
	}

}
