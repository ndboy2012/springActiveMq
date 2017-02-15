package org.lpye.springActiveMq.entity;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = -879245664201029311L;

	private String name;

	private int age;

	private String sex;

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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
