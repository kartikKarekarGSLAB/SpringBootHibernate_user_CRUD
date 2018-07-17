package com.gslab.usercrud.USERCRUD.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gslab.usercrud.USERCRUD.model.Student;

public interface StudentDAO extends CrudRepository<Student, Integer> {
	Student findByName(String name);
	List<Student> findByAge(Integer age);
}
