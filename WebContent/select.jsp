<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Student By IC</title>
</head>
<body>
	<form action="Select" method="post">
		<table>
			<tr>
				<td>Identification Number</td>
				<td><input type="hidden" name="action" value="null"><input type="number" maxlength="12" name="icno"></td>
			</tr>
			<tr>
			
				<td><input type="submit" value="search"></td>
			</tr>
		</table>

	</form>


	<a href="index.jsp">Back</a>

</body>
</body>
</html>