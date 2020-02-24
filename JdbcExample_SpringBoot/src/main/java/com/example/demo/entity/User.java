package com.example.demo.entity;

import java.util.Date;


public class User {
	private int id;
	private String name;
	private String password;
	private String dob;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String pwd, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.password = pwd;
		this.dob = dob;
	}
	
}
