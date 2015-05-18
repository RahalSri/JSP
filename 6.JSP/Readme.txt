First have a look at the generated java servlet for JSP. Normally this file can be found in below folder path
\apache-tomcat-7.0.57\work\Catalina\localhost\JSP\org\apache\jsp

1. Look at the "public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {}"
   method in generated servlet.
2. Note <%! int count = 0; %> create a instance variable (If use <% int count = 0; %> create local variable)
   Same way you can define methods outside of "_jspService" method.
3. <% out.println(count); %> is equal to <%= count++ %> . Note no semicolon in <%= count++ %>;
4. Note that new scope is introduced "pageContext". All other scopes (request,context,session) are get from pageContext