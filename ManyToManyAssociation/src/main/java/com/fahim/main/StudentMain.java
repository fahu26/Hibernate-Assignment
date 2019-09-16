package com.fahim.main;

import java.util.ArrayList;
import java.util.Collection;

import com.fahim.dao.StudentDao;
import com.fahim.model.Course;
import com.fahim.model.Student;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDao dao = new StudentDao();
		
		Course course = new Course();
		course.setCourseName("Science");
		course.setCourseId("S11");
		Course course1 = new Course();
		course1.setCourseId("C11");
		course1.setCourseName("Commerce");
		Course course2 = new Course();
		course2.setCourseId("A11");
		course2.setCourseName("Arts");
		
		Student student = new Student();
		student.setStudentName("john");
		student.setStudentId(1);
		Student student1 = new Student();
		student1.setStudentName("jimmy");
		student1.setStudentId(2);
		Student student2 = new Student();
		student2.setStudentName("mike");
		student2.setStudentId(3);
		
		Collection<Student> studentLists = new ArrayList<Student>();
		studentLists.add(student);
		studentLists.add(student1);
		studentLists.add(student2);
		
		Collection<Course> courseLists = new ArrayList<Course>();
		courseLists.add(course);
		courseLists.add(course1);
		courseLists.add(course2);
		student.setCourses(courseLists);
		student1.setCourses(courseLists);
		student2.setCourses(courseLists);
		course.setStudents(studentLists);
		

		dao.saveOrUpdateData(student);
		dao.saveOrUpdateData(course);
		dao.saveOrUpdateData(student1); 
		dao.saveOrUpdateData(student2);
		dao.saveOrUpdateData(course2);
		dao.saveOrUpdateData(course1);
	
		System.out.println(dao.getDetails(student));
		dao.saveOrUpdateData(student2);
		dao.deleteData(student2);

	}

}
