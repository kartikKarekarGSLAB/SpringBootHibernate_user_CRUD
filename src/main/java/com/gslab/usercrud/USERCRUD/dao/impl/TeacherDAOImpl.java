package com.gslab.usercrud.USERCRUD.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.gslab.usercrud.USERCRUD.dao.TeacherDAO;
import com.gslab.usercrud.USERCRUD.model.Teacher;

public class TeacherDAOImpl implements TeacherDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Integer createTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		int newTeacherId = (int) session.save(teacher);
		tr.commit();
		session.close();
		return newTeacherId;
	}

	@Override
	public List<Teacher> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Query query = session.createQuery("from Teacher");
		List<Teacher> teacherData = query.list();
		tr.commit();
		session.close();
		return teacherData;
	}

	@Override
	public List<Teacher> findByName(String teacherName) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Query query = session.createQuery("from Teacher where name like '%"+teacherName+"%'");
		List<Teacher> teacherData = query.list();
		tr.commit();
		session.close();
		return teacherData;		
	}

}
