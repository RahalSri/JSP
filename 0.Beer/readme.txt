Learning points.
1. Web.xml
   a. Note how to map incoming URL pattern to correct servlet
   b. How to configure welcome page
   
2. BeerSelect.java
   a. This is the servlet listen to /SelectBeer.do URL
   b. Subclass of HttpServlet
   c. Note how to set object to request (req.setAttribute("styles", results);)
   d. Dispatch request to jsp further process.
   
4. life cycle of servlet
   1. Container create an instance of servelet by calling its constructor when loading(tomcat starting) or first use
   2. Call init() method. At this moment servelt has servletCongfig and servletContext objects. call only once
   3. call service() method on seperate threads per each request.
   4. call destroy() after done. call only once
   
5. Idempotent Concept (Get = Idempotent, Post = non-Idempotent) [Idempotent means not change anything on server]

6. Redirection VS Dispatch
   Redirection = Asking client to call other url. url change
   Dispatch    = client(brower) do not anything. all work done by server. url doesnt change
   
7.Three types of <url-pattern> in web.xml
  1.EXACT match (ie: <url-pattern>/Beer/SelectBeer.do</url-pattern>)
    :- Must begin with slash (/) and can have extenstion(.do) but not required

  2.DIRECTORY match (ie: <url-pattern>/Beer/*</url-pattern>)
    :- Must begin with slash(/) and always ends with slash+asterisk (/*)
	
  3.EXTENSION match (ie: <url-pattern>*.do</url-pattern>)
    :-Must begin with asterisk(*) never with slash. After asterisk it MUST have dot extenstion (.do)
	
8.Rules about servlet mappings
  1.Container looks for matches in following order
    I)EXACT match
	II)DIRECTORY match
	III)EXTENSION match

  2.If request matches more than one DIRECTORY match then container choose most specific match