package com.test.demohiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.id.Configurable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setName("ravi");
        a1.setColor("Green");
        
        Configuration con = new Configuration();
        
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        
        session.save(a1);
    }
}
