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
		//Simple bean
		Person person = new Person("Rahal");
		req.setAttribute("person", person);
		//Array
		String[] favouriteMusics = {"Rock","POP","JAZZ"};
		req.setAttribute("favouriteMusics", favouriteMusics);
		// Map
		Map<String,String> musicMap = new HashMap<String,String>();
		musicMap.put("one", "Rock");
		req.setAttribute("musicMap", musicMap);
		//set attribute to work no quotes EL
		getServletContext().setAttribute("oneRef", "one");
		RequestDispatcher view = req.getRequestDispatcher("index.jsp");
		view.forward(req, res);
		return;		
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res){
		return;
	}

}
