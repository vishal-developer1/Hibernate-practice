package com.operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.config.HibernateConfig;
import com.entity.Student;

public class UpdateStudent {

	public static void main(String[] args) {

		SessionFactory sf = HibernateConfig.getSessionFactory();
		
		Session session =sf.openSession();
		
		Student s = session.get(Student.class, 2);
        s.setName("vp");
        s.setAge(21);
        
        session.update(s);
        session.beginTransaction().commit();
        
        System.out.println("Student updated successfully!");
        session.close();
        
        
		
	}

}
