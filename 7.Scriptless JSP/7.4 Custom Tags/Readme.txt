This example demonstrate how we can create our own tags.

1. Note in index.jsp we have used <mine:advise user="Rahal"/> which is custom tag and observe <%@ taglib uri="randomThings" prefix="mine" %> statement.
2. Definition of advise tag is in mytags.tld file. Note same uri is used in index.jsp and mytags.tld.
3. Actual implementation of the tag is in AdvisorTag.java.

a)Observe how "selectTag" is implemented and how values are passed to tag in index.jsp
2)Observe that even though "selectTag" does not have attribute "size" defined in tld it works fine.
  This is because we use "DynamicAttributes" concept here.