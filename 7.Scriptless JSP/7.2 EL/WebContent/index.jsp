<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>  
	<head>  
		<meta charset="ISO-8859-1">  
		<title>Scriptless JSP Example</title>  
	</head>  
	<body>  
	  <form method="POST" action="count">
		<h1>Person Name is ({person.name})    :${person.name} </h1> <!-- You can specifically say search attribute from requestScope by ${requestScope.person.name}-->
		<br>
		<h1>Person Name is ({person["name"]}) : ${person["name"]}</h1>
		<br>
		<h1>Favourite music                   : ${favouriteMusics["0"]}</h1>
		<br>
		<h1>Favourite music from MAP          : ${musicMap["one"]}</h1>
		<br>
		<h1>Favourite music from MAP 2         : ${musicMap.one}</h1>
		<br>
		<h1>Favourite music from MAP with no quotes   : ${musicMap[oneRef]}</h1> 
		<!-- ${musicMap[one]} means find the attribute named "one".Use the value of that attribute as a key of the map, or return null -->
		<br>
		<input type="submit" value="Show Person" >
	  </form>
	</body>  
</html>  