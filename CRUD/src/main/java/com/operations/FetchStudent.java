package com.operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.config.HibernateConfig;
import com.entity.Student;

public class FetchStudent {

	public static void main(String[] args) {


        SessionFactory sf = HibernateConfig.getSessionFactory();
        
        Session session = sf.openSession();
        
        Student student = session.get(Student.class, 2);
        
        System.out.println(student);
        
        session.close();
	}

}
