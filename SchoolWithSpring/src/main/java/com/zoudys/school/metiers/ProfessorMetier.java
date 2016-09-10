package com.zoudys.school.metiers;

import java.util.List;

import com.zoudys.school.entities.Professor;

public interface ProfessorMetier {

	public Professor saveProfessor(Professor professor);
	public List<Professor> getAllProfessor();
	
	
}
