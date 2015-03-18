package com.rahal.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestInitParams extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.println("Testing init parameters <br>");
		
		Enumeration e = getServletConfig().getInitParameterNames();
		while(e.hasMoreElements()){
			out.println("<br>Parameter name ="+e.nextElement()+"<br>");
		}
		out.println("<br>");
		out.println("Admin email is ="+getServletConfig().getInitParameter("adminEmail"));
	}
}
