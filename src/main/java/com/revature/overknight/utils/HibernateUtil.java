package com.revature.overknight.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	private static SessionFactory factory = configureSessionFactory();
	
	public static SessionFactory configureSessionFactory() 
	{
	    Configuration configuration = new Configuration();
	    configuration.configure();

	    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
	    SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);
	    return factory;
	}
	
	
	public static Session getSession()
	{
		return factory.openSession();
	}
	
	public static void close()
	{
		factory.close();
	}
	
	
	
	
	
	/*
	// Keeping this here just in case
	private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	*/
}
