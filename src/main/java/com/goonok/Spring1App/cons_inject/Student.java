package com.goonok.Spring1App.cons_inject;

public class Student {

	private int id;
	private String name;
	private String address;

	public Student(int id, String name, String address) {

		System.out.println("int, st, st - called");
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Student(int id, String name) {
		System.out.println("int, st - called");
		this.id = id;
		this.name = name;
	}

	public Student(String name, String address) {
		System.out.println("st, st - called");
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}




}
