package com.fre18.quannt.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fre18.quannt.entity.Student;

 
public interface StudentDao {

	public void save(final Student student);
	public void update(final Student student);
	public Student findById(final int id);
	public void  delete(final Student student);
	public List<Student> findAll();
	 
}
