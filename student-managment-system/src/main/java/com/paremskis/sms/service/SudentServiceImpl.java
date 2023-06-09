package com.paremskis.sms.service;

import java.util.List;

import com.paremskis.sms.model.Student;
import com.paremskis.sms.persistence.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class SudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	public SudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

}
