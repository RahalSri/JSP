package com.rahal.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rahal.model.Dog;

public class TestContextListener extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.println("Testing Context init parameters <br>");
		
		out.println("<br>");
		Dog d = (Dog)getServletContext().getAttribute("dog");
		out.println("Dog breed is =" + d.getBreed());
	}
}
