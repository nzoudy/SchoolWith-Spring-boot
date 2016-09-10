package com.zoudys.school.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zoudys.school.entities.Professor;
import com.zoudys.school.metiers.ProfessorMetier;

@RestController
public class ProfessorRestService {

	@Autowired
	private ProfessorMetier professorMetier;

	@RequestMapping(value="/professors", method=RequestMethod.POST)
	public Professor saveProfessor(@RequestBody Professor professor) {
		return professorMetier.saveProfessor(professor);
	}

	@RequestMapping(value="/professors", method=RequestMethod.GET)
	public List<Professor> getAllProfessor() {
		return professorMetier.getAllProfessor();
	}
}
