package com.revature.overknight.utils;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	private static SessionFactory factory = configureSessionFactory();
	
	public static SessionFactory configureSessionFactory() 
	{
		try {
			String props[] = System.getenv("DBARGS").split(";");
		    Configuration configuration = new Configuration();
		    configuration.setProperty("hibernate.connection.driver_class",
		    						  props[0]);
	        configuration.setProperty("hibernate.dialect", props[1]);
	        configuration.setProperty("hibernate.connection.url",props[2]);
	        configuration.setProperty("hibernate.connection.username", props[3]);
	        configuration.setProperty("hibernate.connection.password", props[4]);
		    configuration.configure();
		    StandardServiceRegistryBuilder ssrb = 
		    		new StandardServiceRegistryBuilder();
		    Properties p = configuration.getProperties();
		    ServiceRegistry serviceRegistry = ssrb.applySettings(p).build();
	//	    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		    SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);
		}
		
		catch(Throwable t) {
			System.err.println(t);
		}
	    
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
