package default_package;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import interface_package.IPersonDAO;

public class Subject implements IPersonDAO {

	int id_subject;
	String name_subject;
	String description;
	int level;

	Subject() {

	}

	public Subject(int id_subject, String name_subject, String description, int level) {
		this.id_subject = id_subject;
		this.name_subject = name_subject;
		this.description = description;
		this.level = level;

	}

	public void create() throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = Connection_JDBC.getInstance().getConnection();
			String sql = "INSERT INTO subject (name, description, level) VALUES (?, ?, ?)";
			statement = connection.prepareStatement(sql);
			statement.setString(1, name_subject);
			statement.setString(2, description);
			statement.setInt(3, level);
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
		Subject subject = null;
		try {
			connection = Connection_JDBC.getInstance().getConnection();
			String sql = "SELECT * FROM subject WHERE id = ?";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id_subject);
			resultSet = statement.executeQuery();
			if (resultSet.next()) {
				subject = new Subject();
				subject.setId_subject(resultSet.getInt("id"));
				subject.setName_subject(resultSet.getString("name"));
				subject.setDescription(resultSet.getString("description"));
				subject.setLevel(resultSet.getInt("level"));
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
			String sql = "UPDATE subject SET name = ?, description = ?, level = ? WHERE id = ?";
			statement = connection.prepareStatement(sql);
			statement.setString(1, name_subject);
			statement.setString(2, description);
			statement.setInt(3, level);
			statement.setInt(4, id_subject);
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
			String sql = "DELETE FROM subject WHERE id = ?";
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

	public int getId_subject() {
		return id_subject;
	}

	public void setId_subject(int id_subject) {
		this.id_subject = id_subject;
	}

	public String getName_subject() {
		return name_subject;
	}

	public void setName_subject(String name_subject) {
		this.name_subject = name_subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
