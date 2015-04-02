package com.rahal.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException { 
    	
        response.setContentType("text/html");  
          
        /*Cookie ck=new Cookie("name","");  
        ck.setMaxAge(0);  
        response.addCookie(ck);  */
        request.getSession().invalidate();
        request.setAttribute("info", "you are successfully logged out!");
        request.getRequestDispatcher("link.jsp").forward(request, response);
    }  
}  
