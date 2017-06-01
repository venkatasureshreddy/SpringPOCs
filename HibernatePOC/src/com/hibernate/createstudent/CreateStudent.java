package com.hibernate.createstudent;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.development.Student;

public class CreateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create Session Factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		//Create Session
		Session session = factory.getCurrentSession();

		try{
			//Student Object
			Student student = new Student("suresh", "reddy", "suresheddy4b1@gmail.com");
			
			
			// create transaction
			session.beginTransaction();
			
			//save student object
			session.save(student);
			
			//commit transaction
			session.getTransaction().commit();
			
		}
		
		finally {
			factory.close();
		}
	}

}
