package com.hibernate.createstudent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.development.Student;

public class CreateAnotherStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try{
		
		Student student = new Student("nag","pasuplati","nag@gmail");
		
		session.beginTransaction();
		
		session.save(student);
		
		session.getTransaction().commit();
		}
		
		finally{
			session.close();
		}

	}

}
