package com.rahal.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {  
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {  
        response.setContentType("text/html");    
  
        String info = null;
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
          
        if(password.equals("admin123")){  
 
        	info = "You are successfully logged in! \n Welcome, "+name; 
            /*Cookie ck=new Cookie("name",name);  
            response.addCookie(ck);  */
            /* ----------------------------------------------------
             * Here creating a cookie set to response all done by container.
             * ----------------------------------------------------
             */
            HttpSession session = request.getSession();
            if(session.isNew()){
            	session.setAttribute("user", name);
            } else{
            	info ="Welcome user. Your session is still active...";
            }
        }else{  
            request.getRequestDispatcher("login.jsp").include(request, response);  
            return;
        }  
        request.setAttribute("info", info);
        request.getRequestDispatcher("Info.jsp").forward(request, response);
    }  
  
} 