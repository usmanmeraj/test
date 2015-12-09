<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adlist</title>
</head>
<body>
	<center>
		<h1>AdList</h1>
		<form method="post" action="AdListServlet" enctype="multipart/form-data">
			<table border="0">
				
				<tr>
					<td>Description: </td>
					<td><input type="text" name="descr" size="50"/></td>
				</tr>
				<tr>
					<td>Location: </td>
					<td><input type="text" name="location" size="50"/></td>
				</tr>
				
				<tr>
					<td>Price: </td>
					<td><input type="text" name="price" size="50"/></td>
				</tr>
				
				<tr>
					<td>Rooms: </td>
					<td><input type="text" name="rooms" size="50"/></td>
				</tr>
				<tr>
					<td>Photo: </td>
					<td><input type="file" name="pic" size="50"/></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Save">
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>