package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import models.Student;

public class StudentDAO {

	private final SessionFactory sessionFactory;

	public StudentDAO() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Student.class);
		sessionFactory = configuration.buildSessionFactory();
	}

	public void create(Student student) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();
		session.close();
	}

	public Student read(int id) {
		Session session = sessionFactory.openSession();
		Student student = session.get(Student.class, id);
		session.close();
		return student;
	}

	public void update(Student student) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(student);
		transaction.commit();
		session.close();
	}

	public void delete(int id) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Student student = session.get(Student.class, id);
		if (student != null) {
			session.delete(student);
		}
		transaction.commit();
		session.close();
	}
}
