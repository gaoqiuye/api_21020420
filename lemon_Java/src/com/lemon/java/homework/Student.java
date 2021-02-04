package com.lemon.java.homework;

public class Student {
	private String name;
	private int age;
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Student(String name, int age, String gender) {

		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Student() {

	}

	@Override
	public String toString() {
		return "姓名:" + this.name + "；年龄:" + this.age + "；性别:" + this.gender;
	}

}
