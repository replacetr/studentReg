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

		<p> ${result} record created. </p>

		

      <% } 
      
  if (request.getAttribute("deletedrows") != null)
  {
	  %><p> <% out.println(request.getAttribute("deletedrows")); %>record deleted.</p><%
  }
  
  if (request.getAttribute("update") != null)
  {
	  %><p> <% out.println(request.getAttribute("update")); %>record updated.</p><%
  }
      
      %>
</body>
</body>
</html>