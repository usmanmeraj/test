<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="UTF-8">
<title>Sign Up</title>
 
    <link rel='stylesheet prefetch' href='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css'>

        <link rel="stylesheet" href="bootstrap/css/style.css">


</head>
<body>

 <div class="login-card">




<h1>Sign Up</h1>

<br>

Already Have An Account? <a href="Login.jsp">Login</a>
<br>
<br>
<form action="RegisterController.do" method="post">
        <fieldset>
     
        
        <div>
               First Name <input type="text"
                    name="firstname" required value="<c:out value="${user.firstname}" />"
                     />
            </div>
            <div>
                <label for="lastname">Last Name</label> <input type="text"
                    name="lastname" required value="<c:out value="${user.lastname}" />"
                     />
            </div>
        
            <div>
                <label for="email">Email</label> <input type="email"
                    name="email" required  value="<c:out value="${user.email}" />"
                     />
            </div>
            
            <div>
                <label for="dob">DOB</label> <input type="text"
                    name="dob" required value="<c:out value="${user.dob}" />"
                     />
            </div>
            
            
            <div>
                <label for="password">Password</label> <input type="password"
                    name="password" required value="<c:out value="${user.password}" />"
                     />
            </div>
            <div>
                <input type="submit" value="Submit" />
            </div>
        </fieldset>
    </form>

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