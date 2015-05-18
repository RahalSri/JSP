<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>  
	<head>  
		<meta charset="ISO-8859-1">  
		<title>Scriptless JSP Example</title>  
	</head>  
	<body>  
	  <form method="POST" action="show">
	  
		<h1> <c:out value='${requestScope.boldText }'/> </h1>
		<br>
		
		<!-- c:set comes with two favors "var" and "targer".-->
		<!--     1."var" :for setting attribute variables  --> 
		<!--     2."target" :for setting bean properties or Map values  --> 
		
		<c:set var="variableName" scope="session" value="howdy"/>
		<h1>${sessionScope.variableName}</h1>
		

		<table>
			<c:forEach var="movie" items="${movieList}" varStatus="counter">
				<tr>
					<td>${pageScope.counter.count}.${pageScope.movie}</td>
				</tr>
			</c:forEach>
		</table>
		<br>
		
		<c:if test="${user eq null}">
			<h1> User is null </h1>
		</c:if>
		<input type="submit" value="Show Result" >
		
	  </form>
	</body>  
</html>  