package default_package;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import interface_package.IPersonDAO;

public class Student implements IPersonDAO {

	// Atributos de la clase
	private int id_student;
	private String name_student;
	private String lastname_student;
	private int age_student;

	// Constructor
	
	Student(){
		
	}
	public Student(int id_student, String name_student, String lastname_student, int age_student) {
		this.id_student = id_student;
		this.name_student = name_student;
		this.lastname_student = lastname_student;
		this.age_student = age_student;
	}

	// Implementación de los métodos de la interfaz IPersonDAO
	@Override
	public void create() throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = Connection_JDBC.getInstance().getConnection();
			String sql = "INSERT INTO student (name, lastname, age) VALUES (?, ?, ?)";
			statement = connection.prepareStatement(sql);
			statement.setString(1, name_student);
			statement.setString(2, lastname_student);
			statement.setInt(3, age_student);
			statement.executeUpdate();
		} finally {
			if (statement != null)
				statement.close();
			if (connection != null)
				connection.close();
		}
	}

	@Override
	public void read() throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			connection = Connection_JDBC.getInstance().getConnection();
			String sql = "SELECT * FROM student WHERE id = ?";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id_student);
			resultSet = statement.executeQuery();
			if (resultSet.next()) {
				setId_student(resultSet.getInt("id"));
				setName_student(resultSet.getString("name"));
				setLastname_student(resultSet.getString("lastname"));
				setAge_student(resultSet.getInt("age"));
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

	@Override
	public void update() throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = Connection_JDBC.getInstance().getConnection();
			String sql = "UPDATE student SET name = ?, lastname = ?, age = ? WHERE id = ?";
			statement = connection.prepareStatement(sql);
			statement.setString(1, name_student);
			statement.setString(2, lastname_student);
			statement.setInt(3, age_student);
			statement.setInt(4, id_student);
			statement.executeUpdate();
		} finally {
			if (statement != null)
				statement.close();
			if (connection != null)
				connection.close();
		}
	}

	@Override
	public void delete() throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = Connection_JDBC.getInstance().getConnection();
			String sql = "DELETE FROM student WHERE id = ?";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id_student);
			statement.executeUpdate();
		} finally {
			if (statement != null)
				statement.close();
			if (connection != null)
				connection.close();
		}
	}

	// Getters y Setters
	public int getId_student() {
		return id_student;
	}

	public void setId_student(int id_student) {
		this.id_student = id_student;
	}

	public String getName_student() {
		return name_student;
	}

	public void setName_student(String name_student) {
		this.name_student = name_student;
	}

	public String getLastname_student() {
		return lastname_student;
	}

	public void setLastname_student(String lastname_student) {
		this.lastname_student = lastname_student;
	}

	public int getAge_student() {
		return age_student;
	}

	public void setAge_student(int age_student) {
		this.age_student = age_student;
	}
}