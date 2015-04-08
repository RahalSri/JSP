<%@page session="false" %>

	
	<% if (request.getSession(false) == null) { %>
		<a href=<%=response.encodeURL("login.jsp") %>>Login</a> |  	 
	<% } else {%>
		<a href=<%=response.encodeURL("LogoutServlet") %>>Logout</a> |
	<% } %>
	<a href=<%=response.encodeURL("ProfileServlet") %>>Profile</a>  
	
<hr>  


