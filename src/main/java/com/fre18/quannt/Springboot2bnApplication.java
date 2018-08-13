package com.fre18.quannt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fre18.quannt.entity.Student;
import com.fre18.quannt.service.StudentService;

@SpringBootApplication
public class Springboot2bnApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2bnApplication.class, args);
	}

	@Autowired
	private StudentService studentService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// save a student
		Student student1 = new Student("Linh", "9B");
		 studentService.save(student1);

		// get one student by id
		Student st = studentService.findById(1);
		System.out.println("Da tim " + st.getClass_st());

		// get all student
		List<Student> list = studentService.findAll();
		for (Student item : list) {
			System.out.println("Danh sach " + item.getName_st());
		}

	}
}
