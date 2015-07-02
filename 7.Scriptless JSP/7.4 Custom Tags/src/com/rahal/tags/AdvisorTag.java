package com.rahal.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.TagSupport;

public class AdvisorTag extends SimpleTagSupport {

	private String user;
	
	public void setUser(String user) {
		this.user = user;
	}

	public void doTag() throws JspException,IOException {  
	    JspWriter out = getJspContext().getOut();//returns the instance of JspWriter  
	      
	    out.write("<h1> Hello "+ user +"</h1>");
	    out.write("<br> I am not giving you advise...");
	    getJspContext().setAttribute("hello", "Hello There.");
	    getJspBody().invoke(null);//This says "process the body of the tag and print it to the response".null argument says output should goes to response.
	}  
}
