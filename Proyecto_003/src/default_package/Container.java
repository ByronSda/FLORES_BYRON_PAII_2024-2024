package default_package;

import java.sql.SQLException;

public class Container {

	Student student = new Student();
	Teacher teacher = new Teacher();
	Subject subject = new Subject();
	Schedule schedule = new Schedule();

	public Container() {

	}

	public void createStudent(int id_student, String name_student, String lastname_student, int age_student)
			throws SQLException {
		student.create();
	}

	public void createTeacher(int id_teacher, String name_teacher, String lastname_teacher, int age_teacher)
			throws SQLException {
		teacher.create();
	}

	public void createSubject(int id_subject, String name_subject, String description, int level) throws SQLException {
		subject.create();
	}

	public void createSchedule(int id_subject, int id_student, int id_teacher, String start_time, String end_time,
			String day) throws SQLException {
		schedule.create();
	}

	public void readStudent(int id_student) throws SQLException {
		student.read();
	}

	public void readTeacher(int id_teacher) throws SQLException {
		teacher.read();
	}

	public void readsubject(int id_subject) throws SQLException {
		subject.read();
	}

	public void readSchedule(int id_schedule) throws SQLException {
		schedule.read();
	}

	public void updateStudent(int id_student, String name_student) throws SQLException {
		student.update();
	}

	public void updateTeacher(int id_teacher, String name_teacher) throws SQLException {
		teacher.update();
	}

	public void updateMateria(int id_subject, String name_subject) throws SQLException {
		subject.update();
	}

	public void updateSchedule(int id_schedule, String name_schedule) throws SQLException {
		schedule.update();
	}

	public void deleteStudent(int id_student) throws SQLException {
		student.delete();
	}

	public void deleteTeacher(int id_teacher) throws SQLException {
		teacher.delete();
	}

	public void deleteSubject(int id_subject) throws SQLException {
		subject.delete();
	}

	public void deleteSchedule(int id_schedule) throws SQLException {
		schedule.delete();
	}
}
