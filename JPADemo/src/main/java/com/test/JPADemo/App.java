package com.test.JPADemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alien a1 = new Alien();
    	a1.setId(4);
    	a1.setName("siva");
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
    	EntityManager em = emf.createEntityManager();
    	
    	//Alien a1 = em.find(Alien.class, 0);
    	
    	//em.getTransaction().begin();
    	//em.persist(a1);
    	//em.getTransaction().commit();
    	
    	
    	System.out.println(em.find(Alien.class, 4));
    }
}
