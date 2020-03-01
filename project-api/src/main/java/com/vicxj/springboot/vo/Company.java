package com.vicxj.springboot.vo;

public class Company {

	private String name;
	private int regNo;
	private String location;

	public Company() {

	}

	public Company(String name, int regNo, String location) {
		super();
		this.name = name;
		this.regNo = regNo;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
