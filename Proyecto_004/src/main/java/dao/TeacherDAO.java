package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import models.Teacher;

public class TeacherDAO {

    private final SessionFactory sessionFactory;

    public TeacherDAO() {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Teacher.class);
        sessionFactory = configuration.buildSessionFactory();
    }

    public void create(Teacher teacher) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(teacher);
        transaction.commit();
        session.close();
    }

    public Teacher read(int id) {
        Session session = sessionFactory.openSession();
        Teacher teacher = session.get(Teacher.class, id);
        session.close();
        return teacher;
    }

    public void update(Teacher teacher) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(teacher);
        transaction.commit();
        session.close();
    }

    public void delete(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Teacher teacher = session.get(Teacher.class, id);
        if (teacher != null) {
            session.delete(teacher);
        }
        transaction.commit();
        session.close();
    }
}
