package com.hibernate.createstudent;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.development.Student;

public class UpdateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		Session session = factory.getCurrentSession();

		int id= 1;
		
		session.beginTransaction();
		Student s = session.get(Student.class, id);
		s.setFirstName("nothing");
		
		
		Query query = session.createQuery("delete from Student where id=2");
		query.executeUpdate();
		session.getTransaction().commit();
	}

}
