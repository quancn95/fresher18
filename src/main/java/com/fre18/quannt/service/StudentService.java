package com.fre18.quannt.service;

import java.util.List;

import com.fre18.quannt.entity.Student;

public interface StudentService {
	public void save(final Student student);
	public void update(final Student student);
	public Student findById(final int id);
	public void  delete(final Student student);
	public List<Student> findAll();
}
