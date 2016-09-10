package com.zoudys.school.metiers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoudys.school.entities.Professor;
import com.zoudys.school.repositories.ProfessorRepository;

@Service
public class ProfessorMetierImpl implements ProfessorMetier {
	@Autowired
	private ProfessorRepository professorRepository;
	@Override
	public Professor saveProfessor(Professor professor) {
		professor.setBirthday(new Date());
		return professorRepository.save(professor);
	}

	@Override
	public List<Professor> getAllProfessor() {
		return professorRepository.findAll();
	}

}
