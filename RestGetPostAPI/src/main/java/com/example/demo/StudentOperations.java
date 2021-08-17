package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentOperations {
	private List<Student> students= new ArrayList<>( Arrays.asList(  
			new Student("Roushan Raj","199","8","2019"),
			new Student("Vishal Raja","199","8","2019"),
			new Student("Aditya Raj","199","8","2019"),
			new Student("Pragati tiwari","199","8","2019")
			));
	
	public List<Student> getStudents(){
		return students;
	}

	public void addStudent(Student student) {
		students.add(student);
		
	}
}
