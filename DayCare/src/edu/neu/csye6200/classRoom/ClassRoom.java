package edu.neu.csye6200.classRoom;

public class ClassRoom {

	private int id;
	private String name;
	private Course course;
	
	
	protected ClassRoom(String data) {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	
}
