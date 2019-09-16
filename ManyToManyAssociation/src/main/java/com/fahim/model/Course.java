package com.fahim.model;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
@Id
private String courseId;
@Override
public String toString() {
	return "Course [courseId=" + courseId + ", courseName=" + courseName + ", students=" + students + "]";
}
private String courseName;
@ManyToMany(mappedBy = "courses",fetch = FetchType.EAGER)
private Collection<Student> students = new ArrayList<Student>();
public String getCourseId() {
	return courseId;
}
public void setCourseId(String courseId) {
	this.courseId = courseId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public Collection<Student> getStudents() {
	return students;
}
public void setStudents(Collection<Student> students) {
	this.students = students;
}


}
