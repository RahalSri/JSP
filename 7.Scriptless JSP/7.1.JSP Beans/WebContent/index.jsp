<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>  
	<head>  
		<meta charset="ISO-8859-1">  
		<title>Scriptless JSP Example</title>  
	</head>  
	<body>  
	<jsp:include page="Header.jsp">
		<jsp:param value="Greetings !!!" name="greetings"/>
	</jsp:include>
	  <form method="POST" action="count">
	  	<jsp:useBean id="person" class="com.rahal.model.Person" scope="request"> 
	  		<jsp:setProperty property="name" name="person" value="Default"/> <!-- If person object is not set in request this will execute. See the generated servlet -->
	  	</jsp:useBean>
		<h1>Person Name is:<jsp:getProperty property="name" name="person"/></h1>   
		<br>
		<br>
		<input type="submit" value="Show Person" >
	  </form>
	</body>  
</html>  