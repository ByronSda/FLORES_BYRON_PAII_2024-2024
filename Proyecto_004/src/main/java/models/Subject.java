package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subject")
public class Subject {
	
	@Id
	private int id;
	
	@Column(name="name_subject")
	private String nameSubject;

	@Column(name="description")
	private String description;

	@Column(name="level")
	private String level;
	
	public Subject() {
		
	}

	public Subject(int id, String nameSubject, String description, String level) {
		super();
		this.id = id;
		this.nameSubject = nameSubject;
		this.description = description;
		this.level = level;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameSubject() {
		return nameSubject;
	}

	public void setNameSubject(String nameSubject) {
		this.nameSubject = nameSubject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
}

