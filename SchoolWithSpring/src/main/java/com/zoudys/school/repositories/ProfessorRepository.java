package com.zoudys.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoudys.school.entities.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{

}
