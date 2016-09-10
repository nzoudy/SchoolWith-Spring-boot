package com.zoudys.school.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zoudys.school.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	@Query("select s from Student s where s.professor.idProfessor=:x")
	public Page<Student> findStudentByProfessorId(@Param("x") Long id, Pageable pageable);
}
