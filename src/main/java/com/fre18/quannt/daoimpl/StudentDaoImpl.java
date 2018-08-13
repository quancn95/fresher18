package com.fre18.quannt.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fre18.quannt.dao.StudentDao;
import com.fre18.quannt.entity.Student;

@Repository
@Transactional(rollbackFor=Exception.class)
public class StudentDaoImpl implements StudentDao{

	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(final Student student){ 
		Session session = this.sessionFactory.getCurrentSession();
		session.save(student);
	}
	
	public void update(final Student student) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(student);
	}
	
	public Student findById(final int id){
		
		Session session =  this.sessionFactory.getCurrentSession();
		return session.get(Student.class, id);
		 
	}
	
	public void  delete(final Student student){
		
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(student);
	}
	
	public List<Student> findAll(){
		
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("FROM Student", Student.class).getResultList();
	}
}

