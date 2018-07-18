package com.gslab.usercrud.USERCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gslab.usercrud.USERCRUD.model.Teacher;
import com.gslab.usercrud.USERCRUD.service.impl.TeacherServiceImpl;

@RestController
@RequestMapping(value="/teacher")
public class TeacherController {
	
	@Autowired
	private TeacherServiceImpl teacherServiceImpl;
	
	@RequestMapping(value="/display")
	public List<Teacher> findAll() {
		return teacherServiceImpl.findAll();
	}	
	@RequestMapping(value="/find/{name}",method=RequestMethod.GET)
	public List<Teacher> finaByName(@PathVariable(name="name") String teacherName) {
		return teacherServiceImpl.findByName(teacherName);
	}	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public String createTeacher(@RequestBody Teacher teacher) {
		int newTeacherID = teacherServiceImpl.createTeacher(teacher);
		return "Teacher Created with Id : " +newTeacherID;
	}
}
