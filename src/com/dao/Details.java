package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.DetailsBean;


public class Details {

	public static void main(String[] args) {

		// DetailsBean DB1 = new DetailsBean();
		// DB1.setId(103);
		// DB1.setName("Rajiv");
		// DB1.setSalary(135650);
		// DB1.setAddress("Puri");
		//
		// DetailsBean DB2 = new DetailsBean();
		// DB2.setId(104);
		// DB2.setName("Pankaj");
		// DB2.setSalary(1375007);
		// DB2.setAddress("Patna");
		//
		// DetailsBean DB3 = new DetailsBean();
		// DB3.setId(105);
		// DB3.setName("Pratik");
		// DB3.setSalary(150);
		// DB3.setAddress("Arah");

		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();

		System.out.println("Getting the record details");
		DetailsBean getDetails = new DetailsBean();
		System.out.println(getDetails.toString());
		session.load(getDetails, "Pratik");
		System.out.println(getDetails.toString());
		if (getDetails != null) {
			
			System.out.println("Salary :" + getDetails.getSalary());
			System.out.println("Address :" + getDetails.getAddress());

			session.beginTransaction();

			session.getTransaction().commit();

		}

	}
}
