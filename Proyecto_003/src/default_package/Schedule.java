package default_package;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import interface_package.IScheduleDAO;

public class Schedule implements IScheduleDAO {
	private int id_student;
	private int id_teacher;
	private int id_subject;
	private String start_time;
	private String end_time;
	private String day;

	Schedule() {

	}

	public Schedule(int id_student, int id_teacher, int id_subject, String start_time, String end_time, String day) {
		this.id_student = id_student;
		this.id_teacher = id_teacher;
		this.id_subject = id_subject;
		this.start_time = start_time;
		this.end_time = end_time;
		this.day = day;

	}

	public void create() throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = Connection_JDBC.getInstance().getConnection();
			String sql = "INSERT INTO schedule (id_student, id_teacher, id_subject, start_time, end_time, day) VALUES (?, ?, ?, ?, ?, ?)";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id_student);
			statement.setInt(2, id_teacher);
			statement.setInt(3, id_subject);
			statement.setString(4, start_time);
			statement.setString(5, end_time);
			statement.setString(6, day);
			statement.executeUpdate();
		} finally {
			if (statement != null)
				statement.close();
			if (connection != null)
				connection.close();
		}
	}

	public void read() throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		Schedule schedule = null;
		try {
			connection = Connection_JDBC.getInstance().getConnection();
			String sql = "SELECT * FROM schedule WHERE id = ?";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id_subject);
			resultSet = statement.executeQuery();
			if (resultSet.next()) {
				schedule = new Schedule();
				schedule.setId_student(resultSet.getInt("id_student"));
				schedule.setId_teacher(resultSet.getInt("id_teacher"));
				schedule.setId_subject(resultSet.getInt("id_subject"));
				schedule.setStart_time(resultSet.getString("start_time"));
				schedule.setEnd_time(resultSet.getString("end_time"));
				schedule.setDay(resultSet.getString("day"));
			}
		} finally {
			if (resultSet != null)
				resultSet.close();
			if (statement != null)
				statement.close();
			if (connection != null)
				connection.close();
		}
	
	}

	public void update() throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = Connection_JDBC.getInstance().getConnection();
			String sql = "UPDATE schedule SET id_student = ?, id_teacher = ?, id_subject = ?, start_time = ?, end_time = ?, day = ? WHERE id = ?";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id_student);
			statement.setInt(2, id_teacher);
			statement.setInt(3, id_subject);
			statement.setString(4, start_time);
			statement.setString(5, end_time);
			statement.setString(6, day);
			statement.setInt(7, id_subject);
			statement.executeUpdate();
		} finally {
			if (statement != null)
				statement.close();
			if (connection != null)
				connection.close();
		}
	}

	public void delete() throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = Connection_JDBC.getInstance().getConnection();
			String sql = "DELETE FROM schedule WHERE id = ?";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id_subject);
			statement.executeUpdate();
		} finally {
			if (statement != null)
				statement.close();
			if (connection != null)
				connection.close();
		}
	}

	public int getId_student() {
		return id_student;
	}

	public void setId_student(int id_student) {
		this.id_student = id_student;
	}

	public int getId_teacher() {
		return id_teacher;
	}

	public void setId_teacher(int id_teacher) {
		this.id_teacher = id_teacher;
	}

	public int getId_subject() {
		return id_subject;
	}

	public void setId_subject(int id_subject) {
		this.id_subject = id_subject;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

}
