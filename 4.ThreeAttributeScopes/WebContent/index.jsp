<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Beer Selection</title>
</head>
<body>
<h1 align="center">Scopes Page</h1>
<form method="POST" action="select.scope">
	<center>
		<input type="submit" value="requestScope" name="action:request">
		<br>
		<input type="submit" value="contextScope" name="action:context">
		<br>
		<input type="submit" value="sessionScope" name="action:session">
	</center>
	<br>
	<br>
	<%
	  if (request.getAttribute("requestAttribute") != null){
	  	 	out.print("<br>"+request.getAttribute("requestAttribute"));	
	  }else if (application.getAttribute("contextAttribute") != null){
	  	 	out.print("<br>"+application.getAttribute("contextAttribute"));	
	  }else if (session.getAttribute("sessionAttribute") != null){
	  	 	out.print("<br>"+session.getAttribute("sessionAttribute"));	
	  }
	%>
</form>
</body>
</html>