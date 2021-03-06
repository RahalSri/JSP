package com.rahal.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import com.rahal.model.Dog;

public class MyServletContextListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent e) {
		ServletContext sc = e.getServletContext();
		String breed = sc.getInitParameter("breed");
		Dog dog = new Dog(breed);
		sc.setAttribute("dog", dog);// attribute added Dog.attributeAdded() will be called.
		sc.removeAttribute("dog");// Dog.attributeRemoved() will be called
		sc.setAttribute("dog", dog);
	}

}
