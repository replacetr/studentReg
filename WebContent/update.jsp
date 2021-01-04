<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="shaiful.Student"%> 
<%@page import="java.util.ArrayList"%>    
<%@page import="static java.util.Objects.isNull"%>   
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<%
			
		/* ArrayList<Student> std = (ArrayList<Student>) request.getAttribute("data"); */
		
		ArrayList<Student> std = new ArrayList<Student>();
		std = (ArrayList<Student>)request.getAttribute("data");
		
		
		if (std.isEmpty() == true){
			
			out.println("<p>No IC number match<p>");
		}

		else{
		
		for (Student s : std) {
		%>
		
		<form action="SingleUpdateData" method="post">

		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="sname" value=<%=s.getSname()%>></td>
			</tr>
			<tr>
				<td>Identification Number</td>
				<td><input type="hidden" name="icno" value=<%=s.getIcno()%>><fmt:formatNumber type = "number" groupingUsed = "false" value = "<%=s.getIcno()%>" /></td>
			</tr>
			<tr>
				<td>Birthday</td>
				<td><input type="date" name="birthday" value=<%=s.getBirthday()%>></td>
			</tr>
			<tr>
			
			<tr>
				<td>Parents Name</td>
				<td><input type="text" name="pname" value=<%=s.getPname()%>></td>
			</tr>
			
			<tr>
				<td>Contact Number</td>
				<td><input type="text" name="phone" value=<%=s.getPhone()%>></td>
			</tr>
			
			<tr>
				<td>Address</td>
				<td><textarea name="address" form="form1" rows="4" cols="50"><%=s.getAddress()%></textarea></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Update"></td>
			</tr>
		</table>
</form>
<%
		}	}
		%>

	
	
	
<a href="index.jsp" >Back</a>
</body>
</html>