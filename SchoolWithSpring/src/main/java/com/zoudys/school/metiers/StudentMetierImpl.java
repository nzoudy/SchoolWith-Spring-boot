package com.zoudys.school.metiers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.zoudys.school.entities.Student;
import com.zoudys.school.repositories.StudentRepository;

@Service
public class StudentMetierImpl implements StudentMetier{
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		student.setBirthday(new Date());
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	
	@Override
	public PageStudent findStudentByProfessor(Long id, int page, int size) {
		PageStudent ps = new PageStudent();
		Page<Student> pageStudent = studentRepository.findStudentByProfessorId(id, new PageRequest(page, size));
		ps.setStudents(pageStudent.getContent());
		ps.setNombreStudents(pageStudent.getNumberOfElements());
		ps.setPage(pageStudent.getNumber());
		ps.setTotalPages(pageStudent.getTotalPages());
		return ps;
	}

	@Override
	public Student findStudentById(Long id) {
		return studentRepository.findOne(id);
	}

	

}
