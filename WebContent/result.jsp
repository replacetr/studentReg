<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="shaiful.Student"%> 
<%@page import="java.util.ArrayList"%>    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Displaying Student List</h1>
	<table border="1" width="500" align="center">
		<tr bgcolor="00FF7F">
			<th><b>Student Name</b></th>
			<th><b>IC</b></th>
			<th><b>Birthday</b></th>
			<th><b>Phone</b></th>
			<th><b>Parent Name</b></th>
			<th><b>Address</b></th>
<th><b></b></th>
		</tr>

		<%
		ArrayList<Student> std = (ArrayList<Student>) request.getAttribute("data"); 
	/* 	ArrayList<Student> std = new ArrayList<Student>();
	
		std = (ArrayList<Student>);
		*/
		
		System.out.println(std);
		 
		for (Student s : std) {
		%>
		<tr>
		<td><%=s.getSname()%></td>
			<td><fmt:formatNumber type = "number" groupingUsed = "false" value = "<%=s.getIcno()%>" /></td>
			<td><%=s.getBirthday()%></td>
			<td><%=s.getPhone()%></td>
			<td><%=s.getPname()%></td>
			<td><%=s.getAddress()%></td>
			<td>
<form action="Select" method="post">
		
			
			
				<input type="hidden" name="icno" value=<%=s.getIcno()%>>			
			<input type="hidden" name="action" value="null">	
				<input type="submit" value="Edit">
			
		

	</form>


</td>
		</tr>
		<%
		}
		%>
	</table>
	<hr />
	
	<a href="menu.jsp" >Back</a>
</body>
</html>