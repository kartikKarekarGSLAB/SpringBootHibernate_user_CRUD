package com.gslab.usercrud.USERCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gslab.usercrud.USERCRUD.dao.StudentDAO;
import com.gslab.usercrud.USERCRUD.model.Student;

@RestController
@RequestMapping(value="/studentInformation")
public class StudentController {
	
	@Autowired
	private StudentDAO studentDAO;
	
	@RequestMapping(value="/greet/{studentname}")
	public String sayHello(@PathVariable(name="studentname") String studentName) {
		String message = "Hello "+ studentName;
		return message;
	}
	
	@RequestMapping(value="/{studentname}")
	public Student findByName(@PathVariable(name="studentname") String studentName) {		
		return studentDAO.findByName(studentName);
	}
	@RequestMapping(value="/ageGroup/{agelimit}")
	public List<Student> groupByAge(@PathVariable(name="agelimit") Integer ageLimit) {		
		List<Student> resultSet = (List<Student>) studentDAO.findByAge(ageLimit);
/*		String result = "Student Details : ";
		for (Student student : resultSet) {
			result += "<br> ID : " + student.getId() + " Name : "+student.getName() + " Age: "+student.getAge() + "<br>";
		}
*/		return resultSet;		
	}	
	@RequestMapping(value="/displayAll")
	public String diplayAll(Integer ageLimit) {		
		List<Student> resultSet = (List<Student>) studentDAO.findAll();
		String result = "Student Details : ";
		for (Student student : resultSet) {
			result += "\n ID : " + student.getId() + " Name : "+student.getName() + " Age: "+student.getAge() + "\n";
		}
		return result;
	}	
}
