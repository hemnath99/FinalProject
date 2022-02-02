package com.spring.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.entity.StudentEntity;
import com.spring.repository.StudentRepository;
import com.spring.service.StudentService;

public class StudentServiceImplementation implements StudentService
{
	@Autowired
	StudentRepository repo; 
	@Override
	public void addStudent(StudentEntity obj) {
		// TODO Auto-generated method stub
		repo.save(obj);
	}

	
}
 