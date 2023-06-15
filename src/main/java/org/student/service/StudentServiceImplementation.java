package org.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.student.entity.Student;
import org.student.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService {

	@Autowired
	private StudentRepository repository;
	
	
	@Override
	public Student saveStudent(Student student) {
		
		return this.repository.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return this.repository.findAll();
	}
	
	@Override
	public void deleteStudentById(long id) {
		
		this.repository.deleteById(id);
		
	}
	@Override
	public Optional<Student> getStudentById(long id) {
		
		return this.repository.findById(id);
	}
	@Override
	public Student updateStudent(Student student) {
		
		return this.repository.save(student);
	}
}
