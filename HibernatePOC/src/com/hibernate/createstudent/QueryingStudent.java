package com.hibernate.createstudent;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.development.Student;

public class QueryingStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration()
									.addAnnotatedClass(Student.class)
									.configure("hibernate.cfg.xml")
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		Query query=session.createQuery("from Student");
		List<Student> list = query.getResultList();
		displayStudent(list);
	}

	private static void displayStudent(List<Student> list) {
		for(Student s : list){
			System.out.println(s);
		}
	}

}
