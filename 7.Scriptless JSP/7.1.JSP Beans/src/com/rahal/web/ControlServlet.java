package com.rahal.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rahal.model.Person;

public class ControlServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		Person person = new Person("Rahal");
		req.setAttribute("person", person);
		RequestDispatcher view = req.getRequestDispatcher("index.jsp");
		view.forward(req, res);
		return;		
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res){
		return;
	}

}
