<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<form action="Register" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="sname"></td>
			</tr>
			<tr>
				<td>Identification Number</td>
				<td><input type="number" maxlength="12" name="icno"></td>
			</tr>
			<tr>
				<td>Birthday</td>
				<td><input type="date" name="birthday"></td>
			</tr>
			<tr>
			
			<tr>
				<td>Parents Name</td>
				<td><input type="text" name="pname"></td>
			</tr>
			
			<tr>
				<td>Contact Number</td>
				<td><input type="text" name="phone"></td>
			</tr>
			
			<tr>
				<td>Address</td>
				<td><textarea name="address" form="form1" rows="4" cols="50"></textarea></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="register"></td>
			</tr>
		</table>


	</form>
	
	
<a href="index.jsp" >Back</a>

</body>
</body>
</html>