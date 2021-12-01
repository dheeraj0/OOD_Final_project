package edu.neu.csye6200;

public class Person {

	protected String name;
	protected String parentName;
	protected long phoneNumber;
	protected String address;
	protected int age;
	public Person() {};
	public Person(String name, String parentName, long phoneNumber, String address, int age) {
		this.name = name;
		this.parentName = parentName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.age=age;
	}
	
	public Person(String csvString) {
		String[] vals = csvString.split(",");
		this.name = "";
		this.parentName = "";
		this.phoneNumber = -1;
		this.address = "";
		this.age=-1;
		
		this.name = vals[0];
		
		this.parentName = vals[1];
		try {
			this.phoneNumber = Long.parseLong(vals[2]);
		}
		catch(Exception e) {
			System.err.println("Error while parsing phone number"+vals[2]);	
		}
		this.address = vals[3];
		
		try {
			this.age = Integer.parseInt(vals[4]);
		}
		catch(Exception e) {
			System.err.println("Error while parsing age"+vals[4]);	
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParentname() {
		return parentName;
	}
	public void setParentname(String parentName) {
		this.parentName = parentName;
	}
	public long getPhonenumber() {
		return phoneNumber;
	}
	public void setPhonenumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
	