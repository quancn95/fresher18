package com.fre18.quannt.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fre18.quannt.dao.StudentDao;
import com.fre18.quannt.entity.Student;
import com.fre18.quannt.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired 
	private StudentDao studentDao;
	
	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		studentDao.save(student);
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		studentDao.update(student);
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return studentDao.findById(id);
	}

	@Override
	public void delete(Student student) {
		// TODO Auto-generated method stub
		studentDao.delete(student);
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}

}
