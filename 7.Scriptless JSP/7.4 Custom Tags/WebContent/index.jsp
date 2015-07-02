<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ taglib uri="randomThings" prefix="mine" %>

<html>  
	<head>  
		<meta charset="ISO-8859-1">  
		<title>Scriptless JSP Example</title>  
	</head>  
	<% List<String> optionList = new ArrayList();
	  optionList.add(0, "Red");
	  optionList.add(1,"Blue");
	  optionList.add(2,"Green");
	  request.setAttribute("colorList", optionList);
	%>
	<body>  
	  <form method="POST" action="show">
		<mine:advise user="Rahal">Body of the custom tag : ${hello} </mine:advise>
		<br>
		<br>
		<mine:select name="color" size="1" optionList='${requestScope.colorList}'/>
	  </form>
	</body>  
</html>  