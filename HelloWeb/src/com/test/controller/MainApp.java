package com.test.controller;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.test.model.HelloWorld;
import com.test.model.JavaCollection;

public class MainApp {

	public static void main(String[] args) {
		
		  //XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("Beans.xml")); 
	      //HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");    
	      //obj.getMessage();
		/*ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      JavaCollection jc=(JavaCollection)context.getBean("javaCollection");

	      jc.getAddressList();
	      jc.getAddressSet();
	      jc.getAddressMap();
	      jc.getAddressProp();*/
	}

}
