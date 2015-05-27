========================================== JSTL =============================================
JSP Standard Tag Library (JSTL) is the standard tag library that provides tags to control the JSP page behavior, 
iteration and control statements, internationalization tags, and SQL tags.

1. Core Tags: Core tags provide support for iteration, conditional logic, catch exception, url, forward or redirect response etc. To use JSTL core tags, we should include it in the JSP page like below.

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	In this article, we will look into important JSTL core tags.

2. Formatting and Localization Tags: These tags are provided for formatting of Numbers, Dates and i18n support through locales and resource bundles. We can include these tags in JSP with below syntax:

	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
	
3. SQL Tags: JSTL SQL Tags provide support for interaction with relational databases such as Oracle, MySql etc. Using SQL tags we can run database queries, we include it in JSP with below syntax:

	<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

4. XML Tags: XML tags are used to work with XML documents such as parsing XML, transforming XML data and XPath expressions evaluation. Syntax to include XML tags in JSP page is:

	<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
	
5. JSTL Functions Tags: JSTL tags provide a number of functions that we can use to perform common operation, most of them are for String manipulation such as String Concatenation, Split String etc. Syntax to include JSTL functions in JSP page is:

	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
	
	
Note: how we can handle exception by uncommenting <% //int x = 10/0; %> in index.jsp. Also look at the web.xml