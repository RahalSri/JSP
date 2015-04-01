package com.rahal.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.PageContext;


public class Controller extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		String request = req.getParameter("action:request");
		String context = req.getParameter("action:context");
		String session = req.getParameter("action:session");
		
		if( request!=null ){
			req.setAttribute("requestAttribute", "Hello I am request Attribute");
		}
		
		if (context != null){
			getServletContext().setAttribute("contextAttribute", "Hello I am context Attribute");
		}
		
		if (session != null){
			req.getSession().setAttribute("sessionAttribute", "Hello I am session Attribute");
		}
		
		RequestDispatcher view = req.getRequestDispatcher("index.jsp");
		view.forward(req, res);
		return;
		
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res){
		return;
	}

}
