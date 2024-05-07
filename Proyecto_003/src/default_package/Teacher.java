package default_package;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import interface_package.IPersonDAO;

public class Teacher implements IPersonDAO {

	int id_teacher;
	String name_teacher;
	String lastname_teacher;
	int age_teacher;

	Teacher() {

	}

	public Teacher(int id_teacher, String name_teacher, String lastname_teacher, int age_teacher) {
		super();
		this.id_teacher = id_teacher;
		this.name_teacher = name_teacher;
		this.lastname_teacher = lastname_teacher;
		this.age_teacher = age_teacher;

	}

	public void create() throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = Connection_JDBC.getInstance().getConnection();
			String sql = "INSERT INTO teacher (name, lastname, age) VALUES (?, ?, ?)";
			statement = connection.prepareStatement(sql);
			statement.setString(1, name_teacher);
			statement.setString(2, lastname_teacher);
			statement.setInt(3, age_teacher);
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
		Teacher teacher = null;
		try {
			connection = Connection_JDBC.getInstance().getConnection();
			String sql = "SELECT * FROM teacher WHERE id = ?";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id_teacher);
			resultSet = statement.executeQuery();
			if (resultSet.next()) {
				teacher = new Teacher();
				teacher.setId_teacher(resultSet.getInt("id"));
				teacher.setName_teacher(resultSet.getString("name"));
				teacher.setLastname_teacher(resultSet.getString("lastname"));
				teacher.setAge_teacher(resultSet.getInt("age"));
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
			String sql = "UPDATE teacher SET name = ?, lastname = ?, age = ? WHERE id = ?";
			statement = connection.prepareStatement(sql);
			statement.setString(1, name_teacher);
			statement.setString(2, lastname_teacher);
			statement.setInt(3, age_teacher);
			statement.setInt(4, id_teacher);
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
			String sql = "DELETE FROM teacher WHERE id = ?";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id_teacher);
			statement.executeUpdate();
		} finally {
			if (statement != null)
				statement.close();
			if (connection != null)
				connection.close();
		}
	}

	public int getId_teacher() {
		return id_teacher;
	}

	public void setId_teacher(int id_teacher) {
		this.id_teacher = id_teacher;
	}

	public String getName_teacher() {
		return name_teacher;
	}

	public void setName_teacher(String name_teacher) {
		this.name_teacher = name_teacher;
	}

	public String getLastname_teacher() {
		return lastname_teacher;
	}

	public void setLastname_teacher(String lastname_teacher) {
		this.lastname_teacher = lastname_teacher;
	}

	public int getAge_teacher() {
		return age_teacher;
	}

	public void setAge_teacher(int age_teacher) {
		this.age_teacher = age_teacher;
	}

}
