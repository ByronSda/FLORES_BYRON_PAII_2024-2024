package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "schedule")
public class Schedule {

	@Id
	private int id;

	@Column(name = "id_student")
	private int idStudent;

	@Column(name = "id_teacher")
	private int idTeacher;

	@Column(name = "id_subject")
	private int idSubject;

	@Column(name = "start_time")
	private String startTime;

	@Column(name = "end_time")
	private String endTime;

	@Column(name = "day")
	private String day;

	public Schedule() {

	}

	public Schedule(int id, int idStudent, int idTeacher, int idSubject, String startTime, String endTime, String day) {
		super();
		this.id = id;
		this.idStudent = idStudent;
		this.idTeacher = idTeacher;
		this.idSubject = idSubject;
		this.startTime = startTime;
		this.endTime = endTime;
		this.day = day;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public int getIdTeacher() {
		return idTeacher;
	}

	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
	}

	public int getIdSubject() {
		return idSubject;
	}

	public void setIdSubject(int idSubject) {
		this.idSubject = idSubject;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
}