package com.rahal.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rahal.model.Person;

public class ControlServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		// Simple string with HTML tags
		req.setAttribute("boldText", "<b></b> make things bold");
		// Movie list
		String[] movieList = {"Blood Sport","God Father"};
		req.setAttribute("movieList", movieList);
		RequestDispatcher view = req.getRequestDispatcher("index.jsp");
		view.forward(req, res);
		return;		
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res){
		return;
	}

}
