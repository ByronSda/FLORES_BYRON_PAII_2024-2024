package default_package;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		Container example = new Container();
		example.createSchedule(2, 4, 6, "15:30", "20:30", "Lunes");
		example.createStudent(15, "Jose", "Cervantes", 18);
		example.createTeacher(16, "Mario", "Perez", 45);
		example.createStudent(14, "Maria", "Alcivar", 25);
		example.deleteStudent(1);
		
		

	}

}
