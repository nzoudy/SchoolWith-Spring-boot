package com.zoudys.school.metiers;

import java.util.List;

import com.zoudys.school.entities.Student;

public interface StudentMetier {

	public Student saveStudent(Student student);
	public List<Student> getAllStudent();
	public Student findStudentById(Long id);
	public PageStudent findStudentByProfessor(Long id, int page, int size);
	
}
