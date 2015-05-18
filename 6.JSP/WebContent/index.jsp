<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>  
	<head>  
		<meta charset="ISO-8859-1">  
		<title>Count request Example</title>  
	</head>  
	<body>  
	<%! int count = 0; %>
	  <form method="POST" action="count">
		<h1>Request count (using out Object):</h1>  <% out.println(count); %>
		<h1>Request count (using Expression):</h1>  <%= count++ %>
		<br>
		<br>
		<input type="submit" value="Count" >
	  </form>
	</body>  
</html>  