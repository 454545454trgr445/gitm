package com.example.demo.entity;

public class User {
	
	private int id;
	private String name;
	private int department_id;
	private int sex;
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

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}
	
	
	public static String[] sexs= {"未指定","男性","女性"};
	public String getSexname() {
		return sexs[sex];
	}
	
	private String department_name;
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	
	

}
