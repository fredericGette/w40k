package com.w40k2.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.w40k2.dao.entity.Role;

public class RoleDaoImpl implements RoleDao {

	@Override
	public void create(Role role) {
		SessionFactory sf = MyHibernate.INSTANCE.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.persist(role);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Role read(String roleId) {
		SessionFactory sf = MyHibernate.INSTANCE.getSessionFactory();
		Session session = sf.openSession();
		return session.get(Role.class, roleId);
	}

	@Override
	public void update(Role role) {
		SessionFactory sf = MyHibernate.INSTANCE.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(role);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void delete(Role role) {
		SessionFactory sf = MyHibernate.INSTANCE.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.delete(role);
		session.getTransaction().commit();
		session.close();
	}

}
