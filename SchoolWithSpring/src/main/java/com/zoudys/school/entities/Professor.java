package com.zoudys.school.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
public class Professor implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProfessor;
	private String name;
	@Temporal(TemporalType.TIMESTAMP)
	private Date birthday;
	@OneToMany(mappedBy="professor")
	private Collection<Student> students;
	public Professor() {
		super();
	}
	public Long getIdProfessor() {
		return idProfessor;
	}
	public void setIdProfessor(Long idProfessor) {
		this.idProfessor = idProfessor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@JsonIgnore
	public Collection<Student> getStudents() {
		return students;
	}
	@JsonSetter
	public void setStudents(Collection<Student> students) {
		this.students = students;
	}
	
}
