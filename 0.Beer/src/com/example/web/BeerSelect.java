package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.BeerExpert;

public class BeerSelect extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		String c = req.getParameter("color");
		BeerExpert be = new BeerExpert();
		List results = be.getBrands(c);
		// Set the result to request
		req.setAttribute("styles", results);
		//forward request and response to further. (To result.jsp)
		RequestDispatcher view = req.getRequestDispatcher("result.jsp");
		view.forward(req, res);
		//Redirection is done as follows
		//res.sendRedirect("https://github.com/RahalSri/JSP/tree/master/Beer");
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res){
		return;
	}

	@Override
	public void init() throws ServletException {

		System.out.print("Initttt");
	}
	
	
}
