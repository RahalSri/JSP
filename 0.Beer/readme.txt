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