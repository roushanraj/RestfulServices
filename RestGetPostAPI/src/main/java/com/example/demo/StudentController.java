package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {
	
	@Autowired		//to inject the given class
	private StudentOperations studentoperation;
	
	@RequestMapping("/students")
	public List<Student> getStudents(){
		return studentoperation.getStudents();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/students")
	public void addStudent(@RequestBody Student student) {
		studentoperation.addStudent(student);
	}

}
