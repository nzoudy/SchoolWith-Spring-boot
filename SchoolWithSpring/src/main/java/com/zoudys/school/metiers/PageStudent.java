package com.zoudys.school.metiers;

import java.io.Serializable;
import java.util.List;

import com.zoudys.school.entities.Student;

public class PageStudent implements Serializable{

	private List<Student> students;
	private int page;
	private int nombreStudents;
	private int totalStudents;
	private int totalPages;
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getNombreStudents() {
		return nombreStudents;
	}
	public void setNombreStudents(int nombreStudents) {
		this.nombreStudents = nombreStudents;
	}
	public int getTotalStudents() {
		return totalStudents;
	}
	public void setTotalStudents(int totalStudents) {
		this.totalStudents = totalStudents;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	
	
	
}
