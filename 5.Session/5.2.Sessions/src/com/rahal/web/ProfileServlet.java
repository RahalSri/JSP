package com.rahal.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProfileServlet extends HttpServlet {  
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {  
        response.setContentType("text/html");  
        String info = null;
          
        /*Cookie ck[]=request.getCookies();  
        if(ck!=null){  
         String name=ck[0].getValue();  
        if(!name.equals("")||name!=null){  
            out.print("<b>Welcome to Profile</b>");  
            out.print("<br>Welcome, "+name);  
        }  
        }else{  
            out.print("Please login first");  
            request.getRequestDispatcher("login.html").include(request, response);  
        }  */
        HttpSession session = request.getSession(false);
        if(session != null){
            info = "Welcome to Profile \n Welcome "+session.getAttribute("user");
        } else {
            request.getRequestDispatcher("login.jsp").include(request, response);  
            return;
        }
        request.setAttribute("info", info);
        request.getRequestDispatcher("Info.jsp").forward(request, response); 
    }  
    
} 