1.request.getSession() work as follows.(It always return a session)

IF(the request include as session ID cookie)
   find the session matching that ID
ELSE IF (there is no session ID cookie OR there is no current session matching the session ID)
   create new session
   
2. request.getSession(false)
   This method returns a pre-existing session, OR null if there was no session associate with this client
   
3. Found a problem when work with JSP "request.getSession(false)" method always return NON NULL value.
   This happens basically if the application is using a JSP, 
   the container (in my case Tomcat) by default ends up creating a session.In my case, the user’s landing page
   itself was a JSP as a result the session gets created at that time itself. To avoid this used following line
   in JSP.
   
   < % @page session="false" % >
   
4. Three ways of session can die
   1. Application goes down
   2. call invalidate() method
   3. by setting time out
      1. To set timeout(15 min) for every session use following configuration in web.xml
         <session-config>
		  	<session-timeout>15</session-timeout>
		 </session-config>
	  2. To set time out for specific session
	     session.setMaxInactiveInterval(15*60)
      
   