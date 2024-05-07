package interface_package;

import java.sql.SQLException;

public interface IPersonDAO {
	
	public void create() throws SQLException;
	public void read() throws SQLException;
	public void update() throws SQLException;
	public void delete() throws SQLException;

}
