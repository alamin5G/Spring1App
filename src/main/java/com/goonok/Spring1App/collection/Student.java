package com.goonok.Spring1App.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private String name;
	private List<String> address;
	private Map<String, String> course;
	private Set<String> phoneNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	public Set<String> getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Set<String> phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", course=" + course + ", phoneNo=" + phoneNo + "]";
	}
	
	
	
	
}
