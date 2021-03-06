package com.w40k2.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.w40k2.dao.entity.Figurine;

public class FigurineDaoImpl implements FigurineDao {

	public void create(Figurine figurine) {
		SessionFactory sf = MyHibernate.INSTANCE.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.persist(figurine);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Figurine read(long figurineId) {
		SessionFactory sf = MyHibernate.INSTANCE.getSessionFactory();
		Session session = sf.openSession();
		return session.get(Figurine.class, figurineId);
	}

	@Override
	public void update(Figurine figurine) {
		SessionFactory sf = MyHibernate.INSTANCE.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(figurine);
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public void delete(Figurine figurine) {
		SessionFactory sf = MyHibernate.INSTANCE.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.delete(figurine);
		session.getTransaction().commit();
		session.close();
	}
}
