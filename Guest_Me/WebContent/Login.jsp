<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
    <title>Log-in</title>
    
    
    
    <link rel='stylesheet prefetch' href='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css'>

        <link rel="stylesheet" href="bootstrap/css/style.css">

    
    
    
  </head>

  <body>

    <div class="login-card">
    <h1>Log-in</h1><br>
  <form action="LoginController.do" method="post">
     <input type="email"
                    name="email" placeholder ="Email" value="<c:out value="${user.email}" />"
                    />
    <input type="password"
                    name="password" placeholder = "Password" value="<c:out value="${user.password}" />"
                     />
    <input type="submit" name="login" class="login login-submit" value="login">
  </form>
    
  <div class="login-help">
    <a href="Register.jsp">Register</a>
  </div>
<div class="about">
   
    <p class="about-author">
      &copy; 2015 -
      GuestMe License<br>
    </p>
  </div>

</div>

<!-- <div id="error"><img src="https://dl.dropboxusercontent.com/u/23299152/Delete-icon.png" /> Your caps-lock is on.</div> -->
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js'></script>

    
    
    
    
  </body>
</html>
