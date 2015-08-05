package com.rahal.web;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class AppContextAttributeListener implements ServletContextAttributeListener {


	@Override
	public void attributeAdded(ServletContextAttributeEvent arg0) {
		System.out.println("ServletContext attribute added::{"+arg0.getName()+","+arg0.getValue()+"}");
		
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		System.out.println("ServletContext attribute removed::{"+arg0.getName()+","+arg0.getValue()+"}");
		
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		System.out.println("ServletContext attribute replaced::{"+arg0.getName()+","+arg0.getValue()+"}");
		
	}

}
