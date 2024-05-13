package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import models.Schedule;

public class ScheduleDAO {

	private final SessionFactory sessionFactory;

	public ScheduleDAO() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Schedule.class);
		sessionFactory = configuration.buildSessionFactory();
	}

	public void create(Schedule schedule) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(schedule);
		transaction.commit();
		session.close();
	}

	public Schedule read(int id) {
		Session session = sessionFactory.openSession();
		Schedule schedule = session.get(Schedule.class, id);
		session.close();
		return schedule;
	}

	public void update(Schedule schedule) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(schedule);
		transaction.commit();
		session.close();
	}

	public void delete(int id) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Schedule schedule = session.get(Schedule.class, id);
		if (schedule != null) {
			session.delete(schedule);
		}
		transaction.commit();
		session.close();
	}
}