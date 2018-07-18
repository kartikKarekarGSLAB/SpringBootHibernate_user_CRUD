package com.gslab.usercrud.USERCRUD.service;

import java.util.List;

import com.gslab.usercrud.USERCRUD.model.Teacher;

public interface TeacherService {
	public Integer createTeacher(Teacher teacher);
	public List<Teacher> findAll();
	public List<Teacher> findByName(String teacherName);
}
