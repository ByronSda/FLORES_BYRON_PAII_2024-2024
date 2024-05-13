package controller;

import dao.ScheduleDAO;
import dao.StudentDAO;
import dao.SubjectDAO;
import dao.TeacherDAO;
import models.Schedule;
import models.Student;
import models.Subject;
import models.Teacher;

public class Container {

	private final StudentDAO studentDAO;
	private final TeacherDAO teacherDAO;
	private final SubjectDAO subjectDAO;
	private final ScheduleDAO scheduleDAO;

	public Container() {
		studentDAO = new StudentDAO();
		teacherDAO = new TeacherDAO();
		subjectDAO = new SubjectDAO();
		scheduleDAO = new ScheduleDAO();
	}

	// Métodos CRUD para Student
	public void createStudent(Student student) {
		studentDAO.create(student);
	}

	public Student readStudent(int id) {
		return studentDAO.read(id);
	}

	public void updateStudent(Student student) {
		studentDAO.update(student);
	}

	public void deleteStudent(int id) {
		studentDAO.delete(id);
	}

	// Métodos CRUD para Teacher
	public void createTeacher(Teacher teacher) {
		teacherDAO.create(teacher);
	}

	public Teacher readTeacher(int id) {
		return teacherDAO.read(id);
	}

	public void updateTeacher(Teacher teacher) {
		teacherDAO.update(teacher);
	}

	public void deleteTeacher(int id) {
		teacherDAO.delete(id);
	}

	// Métodos CRUD para Subject
	public void createSubject(Subject subject) {
		subjectDAO.create(subject);
	}

	public Subject readSubject(int id) {
		return subjectDAO.read(id);
	}

	public void updateSubject(Subject subject) {
		subjectDAO.update(subject);
	}

	public void deleteSubject(int id) {
		subjectDAO.delete(id);
	}

	// Métodos CRUD para Schedule
	public void createSchedule(Schedule schedule) {
		scheduleDAO.create(schedule);
	}

	public Schedule readSchedule(int id) {
		return scheduleDAO.read(id);
	}

	public void updateSchedule(Schedule schedule) {
		scheduleDAO.update(schedule);
	}

	public void deleteSchedule(int id) {
		scheduleDAO.delete(id);
	}
}
