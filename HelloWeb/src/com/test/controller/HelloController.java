package com.test.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.exception.SpringException;
import com.test.model.Student;

@Controller
public class HelloController {
	
	//ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	
	 @RequestMapping(method = RequestMethod.GET,value="/hello")
	 public String printHello(ModelMap model) {
	      model.addAttribute("message", "Hello Spring MVC Framework!");
	      return "hello";
	   }
	 
	 @RequestMapping(value = "/student", method = RequestMethod.GET)
	   public ModelAndView student() {
	      return new ModelAndView("student", "command", new Student());
	   }
	 
	 @RequestMapping(method = RequestMethod.POST, value="/addStudent")
	 @ExceptionHandler({SpringException.class})
	 public String addStudent(@ModelAttribute("SpringWeb")Student student, ModelMap model) {
		 
		 if(student.getName().length() < 5 ){
	         throw new SpringException("Given name is too short");
	      } else {
	         model.addAttribute("name", student.getName());
	      }
	      if( student.getAge() < 10 ){
	         throw new SpringException("Given age is too low");
	      } else {
	         model.addAttribute("age", student.getAge());
	      }
	      model.addAttribute("id", student.getId());
		 return "result";
	 }

}
