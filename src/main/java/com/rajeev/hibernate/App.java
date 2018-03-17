package com.rajeev.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rajeev.hibernate.entities.UserDetails;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Hibernate world!" );
        
        UserDetails userDetails=new UserDetails();
        userDetails.setUserId(3);
        userDetails.setUserName("user 3");
        userDetails.setAddress("address");
        userDetails.setDescription("desc");
        userDetails.setJoinedDate(new Date());
        Session session=null;
        SessionFactory sessionFactory=null;
        try {
         sessionFactory =new Configuration().configure().buildSessionFactory();
         session=sessionFactory.openSession();
        
        session.beginTransaction();
        session.save(userDetails);
        session.getTransaction().commit();
        }catch(Exception e){
        	System.out.println(e);
        	
        }finally{ 
        	System.out.println("closing the session");
        	session.clear();
        	session.close();
        	sessionFactory.close();
        
        }
    }
}
