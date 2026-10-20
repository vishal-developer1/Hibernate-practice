package com.vp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		Student student = new Student(1, "vishal", 22);
		
		Configuration cfg =new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session =sf.openSession();
		
		session.save(student);
		session.beginTransaction().commit();
		
		System.out.println("saved");
	}

}
