package com.zoudys.school.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zoudys.school.entities.Student;
import com.zoudys.school.metiers.PageStudent;
import com.zoudys.school.metiers.StudentMetier;

@RestController
public class StudentRestService {

	@Autowired
	private StudentMetier studentMetier;

	@RequestMapping(value="/students", method=RequestMethod.POST)
	public Student saveStudent(@RequestBody Student student) {
		return studentMetier.saveStudent(student);
	}

	@RequestMapping(value="/students", method=RequestMethod.GET)
	public List<Student> getAllStudent() {
		return studentMetier.getAllStudent();
	}
	
	@RequestMapping(value="/students/{id}", method=RequestMethod.GET)
	public Student getStudent(@PathVariable Long id){
		return studentMetier.findStudentById(id);
	}
	
	@RequestMapping(value="/studentsByProf", method=RequestMethod.GET)
	public PageStudent findStudentByProfessor(
												@RequestParam Long id, 
												@RequestParam int page, 
												@RequestParam int size) {
		return studentMetier.findStudentByProfessor(id, page, size);
	}

}
