<%@page session="false" %>

	
	<% if (request.getSession(false) == null) { %>
		<a href="login.jsp">Login</a> |  		 
	<% } else {%>
		<a href="LogoutServlet">Logout</a> |
	<% } %>
	<a href="ProfileServlet">Profile</a>  
	
<hr>  