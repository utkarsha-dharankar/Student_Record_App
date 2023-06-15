package org.student.service;

import java.util.List;
import java.util.Optional;

import org.student.entity.Student;

public interface StudentService {

	public Student saveStudent(Student student);
	public List<Student> getAllStudent();
	
	
	public Optional<Student> getStudentById(long id);
	
	public void deleteStudentById(long id);
	public Student updateStudent(Student product);
	
}