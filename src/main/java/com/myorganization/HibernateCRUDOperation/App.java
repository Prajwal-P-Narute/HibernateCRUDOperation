package com.myorganization.HibernateCRUDOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.my.entities.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	User user1 = new User();
//    	
//    	user1.setName("Onkar");
//    	user1.setEmail("onkar123@gmail.com");
//    	user1.setCity("Pune");
    	
    	
//    	User user2 = new User();
//    	
//    	user2.setName("Mahesh");
//    	user2.setEmail("mahesh123@gmail.com");
//    	user2.setCity("Solapur");
    	
//    	User user3  = new User();
//    	user3.setName("Rajesh");
//    	user3.setEmail("rajesh123@gmail.com");
//    	user3.setCity("Mumbai");
    	
    	
    	
        Configuration configuration = new Configuration();
        configuration.configure("/com/my/config/hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        
        
        // Insert Operation
        
        
//        try {
//        	session.save(user3);
//        	tx.commit();
//        	System.out.println("inserted successfully");
//		} catch (Exception e) {
//			System.out.println("insertion failed");
//			tx.rollback();
//		}
        
     
        
        
         // Select Operation
//        User user= session.get(User.class, 2);
//        System.out.println("id:"+user.getId());
//        System.out.println("name:"+user.getName());
//        System.out.println("email:"+user.getEmail());
//        System.out.println("city:"+user.getCity());
        
        
        //Update Operation
//        User user = session.get(User.class, 2);
//        user.setCity("Noida");
//        
//        
//        try {
//        	session.saveOrUpdate(user);
//        	System.out.println("updation successful");
//        	tx.commit();
//		} catch (Exception e) {
//			System.out.println("updation failed");
//			tx.rollback();
//		}
        
     
        // Delete Operation
        
        User user = session.get(User.class, 4);
        try {
        	 session.delete(user);
        	 tx.commit();
        	 System.out.println("deleted successfully");
		} catch (Exception e) {
			System.out.println("deletion failed");
			tx.rollback();
		}
       
        
    }
}
