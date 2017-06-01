package com.hibernate.createstudent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.development.Student;

public class CreateThirdStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SessionFactory
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		Student stu = new Student("ramesh","paspulati","ramesh@gmail.com");
		
		session.beginTransaction();
		session.save(stu);
		session.getTransaction().commit();
		
		
		

	}

}
