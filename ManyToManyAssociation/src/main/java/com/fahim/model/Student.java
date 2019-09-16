package com.fahim.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {

	@Id
private int studentId;
private String studentName;
@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
@JoinTable(joinColumns = @JoinColumn(name = "student_id"),
inverseJoinColumns = @JoinColumn(name="course_id"))
private Collection<Course> courses = new ArrayList<Course>();
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public Collection<Course> getCourses() {
	return courses;
}
public void setCourses(Collection<Course> courses) {
	this.courses = courses;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", courses=" + courses + "]";
}
}
