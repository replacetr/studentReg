<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<jsp:include page="menu.jsp" /> 



  <% 

/*   to check system message  */
  System.out.println(request.getAttribute("deletedrows"));
  System.out.println(request.getAttribute("result"));
  
  
  
  /* to from data register */
  if (request.getAttribute("result") == null) { %>
     
     <p><h2>  Welcome</h2></p> 
     
       
      <% } 
  
  else { %>
<%--        <p>result: <%  out.println(request.getAttribute("data")); %></p> --%>

		<p> ${result} data(s) created. </p>

		

      <% } 
      
  if (request.getAttribute("deletedrows") != null)
  {
	  %><p> <% out.println(request.getAttribute("deletedrows")); %>record deleted.</p><%
  }
  
      
      %>
</body>
</body>
</html>