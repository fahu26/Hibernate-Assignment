package com.fahim.Main;

import com.fahim.dao.StudentDao;
import com.fahim.model.Student;

public class StudentMain {
public static void main(String args[]) {
	StudentDao dao = new StudentDao();
	Student student = new Student(1, "dvdvd", "152154613", "Male", 25);
	dao.saveStudent(student);
System.out.println("Student added!!!");	

System.out.println(dao.getStudentList());

}
}
