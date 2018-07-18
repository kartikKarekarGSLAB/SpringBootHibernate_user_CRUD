package com.gslab.usercrud.USERCRUD.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gslab.usercrud.USERCRUD.dao.impl.TeacherDAOImpl;
import com.gslab.usercrud.USERCRUD.model.Teacher;
import com.gslab.usercrud.USERCRUD.service.TeacherService;

public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherDAOImpl teacherDAOImpl;
	
	@Override
	public Integer createTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		int newTeacherId = teacherDAOImpl.createTeacher(teacher);
		return newTeacherId;
	}

	@Override
	public List<Teacher> findAll() {
		// TODO Auto-generated method stub
		return teacherDAOImpl.findAll();
	}

	@Override
	public List<Teacher> findByName(String teacherName) {
		// TODO Auto-generated method stub
		return teacherDAOImpl.findByName(teacherName);
	}

}
