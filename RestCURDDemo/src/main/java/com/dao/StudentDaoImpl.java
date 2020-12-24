  package com.dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public Student createStudent(Student student) {
		
		Session session=sessionFactory.getCurrentSession();
		session.save(student);
		return student;
	}
	public Student getStudent(int studentId)
	{
		Session session=sessionFactory.getCurrentSession();
		Student student= session.get(Student.class,studentId);
		return student;
		
	}
	public Student updateStudent(Student student) {

		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(student);
		return student;
	}
	public int deleteStudent(int studentId) {

		String hql="DELETE FROM Student WHERE student_id=:studentId";
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery(hql);
		query.setParameter("studentId",studentId);
		return query.executeUpdate();
		
	}


}
