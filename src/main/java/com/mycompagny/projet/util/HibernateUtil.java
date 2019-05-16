
package com.mycompagny.projet.util;


import java.io.File;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Bolly Tachi
 */

public class HibernateUtil {
    
    
    private static SessionFactory sessionFactory = null;
    
    private static Configuration conf;
    
    private static SessionFactory buildSessionFactory(){
        
        try {
            
            conf = new Configuration();
            
            conf.configure("hibernate.cfg.xml");
            
            System.err.println("Configuration load Successfully.....");
            
            sessionFactory = conf.buildSessionFactory();
            
            System.err.println("SessionFactory load Successfully.....");
            
            return sessionFactory;
            
        } catch (Throwable ex) {
            ex.printStackTrace();
            throw new ExceptionInInitializerError(ex);
        }
        
    }
    
    public static SessionFactory getSessionFactory(){
        
        if (sessionFactory == null) {
            
            sessionFactory = buildSessionFactory();
            
        }
        
        return sessionFactory;
        
    }
      
    /*private static SessionFactory buildSessionFactory()
    {
        try
        {
            // Create the SessionFactory from hibernate.cfg.xml
            return new AnnotationConfiguration().configure(new File("hibernate.cgf.xml")).buildSessionFactory();
        }
        catch (HibernateException ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }*/
  
    /*public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }*/
  
    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }
    
}