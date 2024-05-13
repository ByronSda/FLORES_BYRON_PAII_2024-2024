package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import models.Subject;

public class SubjectDAO {

	private final SessionFactory sessionFactory;

	public SubjectDAO() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Subject.class);
		sessionFactory = configuration.buildSessionFactory();
	}

	public void create(Subject subject) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(subject);
		transaction.commit();
		session.close();
	}

	public Subject read(int id) {
		Session session = sessionFactory.openSession();
		Subject subject = session.get(Subject.class, id);
		session.close();
		return subject;
	}

	public void update(Subject subject) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(subject);
		transaction.commit();
		session.close();
	}

	public void delete(int id) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Subject subject = session.get(Subject.class, id);
		if (subject != null) {
			session.delete(subject);
		}
		transaction.commit();
		session.close();
	}
}