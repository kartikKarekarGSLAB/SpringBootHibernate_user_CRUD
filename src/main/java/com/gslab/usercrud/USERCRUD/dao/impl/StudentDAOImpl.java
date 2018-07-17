package com.gslab.usercrud.USERCRUD.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.gslab.usercrud.USERCRUD.dao.StudentDAO;


public class StudentDAOImpl{	
	@Autowired
	private StudentDAO studentDAO;

	public StudentDAO getStudentDAO() {
		return studentDAO;
	}	
}
