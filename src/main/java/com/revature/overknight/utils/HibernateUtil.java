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
		String props[] = System.getenv("DBARGS").split(";");
		System.err.println("props: " + Arrays.toString(props));
	    return new Configuration()
	    		.setProperty("hibernate.connection.driver_class", props[0])
	    		.setProperty("hibernate.dialect", props[1])
	    		.setProperty("hibernate.connection.url",props[2])
	    		.setProperty("hibernate.connection.username", props[3])
	    		.setProperty("hibernate.connection.password", props[4])
	    		.configure().buildSessionFactory();
//	    System.err.println("configuration: " + configuration);
//	    StandardServiceRegistryBuilder ssrb = 
//	    		new StandardServiceRegistryBuilder();
//	    System.err.println("builder: " + ssrb);
//	    Properties p = configuration.getProperties();
//	    System.err.println("properties: " + p);
//	    ServiceRegistry serviceRegistry = ssrb.applySettings(p).build();
//	    System.err.println("registry: " + serviceRegistry);
////	    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
//	    SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);
//	    System.err.println("factory: " + factory);
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
