<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <head>
    <meta charset="UTF-8">
    <title>Log-in</title>
    
    
    
    <link rel='stylesheet prefetch' href='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css'>

        <link rel="stylesheet" href="bootstrap/css/style.css">

    
    
    
  </head>
<title>Adlist</title>
</head>
<body>
	<div class="login-card">
    <h1>Adlist</h1><br>
		

		
		
		<form method="post" action="AdListServlet" enctype="multipart/form-data">
			<table border="0">
				
				<tr>
					<td>Description: </td>
					<td><input type="text" name="descr"  size="50"/></td>
				</tr>
				<tr>
					<td>Location: </td>
					<td><input type="text" name="location" required size="50"/></td>
				</tr>
				
				<tr>
				<td>From: </td> 
				<td>  <input type="text"  name="av_from" required> </td>
				</tr>
				
				<tr>
				<td>To: </td> 
				<td> <input type="text"  name="av_to" required> </td> 
				</tr>
				
				<tr>
					<td>Price: </td>
					<td><input type="text" name="price" required size="50"/></td>
				</tr>
				
				<tr>
					<td>Rooms: </td>
					<td><input type="text" name="rooms" required size="50"/></td>
				</tr>

				<tr>
					<td colspan="2">
						<input type="submit" value="Save">
					</td>
				</tr>
			</table>
		</form>
</div>

<!-- <div id="error"><img src="https://dl.dropboxusercontent.com/u/23299152/Delete-icon.png" /> Your caps-lock is on.</div> -->
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js'></script>

    

</body>
</html>