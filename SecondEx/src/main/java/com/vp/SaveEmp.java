package com.vp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SaveEmp {

	public static void main(String[] args) {

		SessionFactory sf = HibernateConfig.getSessionFactory();
		
		Session session = sf.openSession();
		
		Employee employee=new Employee(1, "vishal", 25000, "IT");
		
		session.save(employee);
		session.beginTransaction().commit();
		
		
		
		
		
	}

}
