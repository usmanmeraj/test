<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <head>
    <meta charset="UTF-8">
    <title>Message</title>
    
    
    
    <link rel='stylesheet prefetch' href='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css'>

        <link rel="stylesheet" href="bootstrap/css/style.css">

    
    
</head>
<body>

 <div class="login-card">
 
 <h1>Message</h1>
<form action="MessageController" method ="post" >
  
<br>
<textarea rows="4" cols="31" name="message" >
</textarea>
<input type="submit" value="Send">
</form>
</div>

<div class="about">
   
    <p class="about-author">
      &copy; 2015 -
      GuestMe License<br>
</p>
</div>


<!-- <div id="error"><img src="https://dl.dropboxusercontent.com/u/23299152/Delete-icon.png" /> Your caps-lock is on.</div> -->
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js'></script>

    
</body>
</html>