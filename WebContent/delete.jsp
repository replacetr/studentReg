<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Select" method="post">
		<table>
			<tr>
				<td>Identification Number</td>
				<td><input type="number" maxlength="12" name="icno">
				
				<input type="hidden" name="action" value="delete">
				</td>
				
				
			</tr>
			<tr>
				<td><input type="submit" value="Delete Record"></td>
			</tr>
		</table>

	</form>


	<a href="index.jsp">Back</a>

</body>
</html>