package com.gslab.usercrud.USERCRUD.dao;

import java.util.List;

import com.gslab.usercrud.USERCRUD.model.Teacher;

public interface TeacherDAO {
	public Integer createTeacher(Teacher teacher);
	public List<Teacher> findAll();
	public List<Teacher> findByName(String teacherName);
}
