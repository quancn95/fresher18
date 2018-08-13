package com.fre18.quannt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	@Column(name="idstudent")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_st;
	@Column(name="name")
	private String name_st;
	@Column(name="class")
	private String class_st;
	public int getId_st() {
		return id_st;
	}
	public void setId_st(int id_st) {
		this.id_st = id_st;
	}
	public String getName_st() {
		return name_st;
	}
	public void setName_st(String name_st) {
		this.name_st = name_st;
	}
	public String getClass_st() {
		return class_st;
	}
	public void setClass_st(String class_st) {
		this.class_st = class_st;
	}
	public Student(String name_st, String class_st) {
		super(); 
		this.name_st = name_st;
		this.class_st = class_st;
	}
	public Student() {
		super();
	}
	
	
}
