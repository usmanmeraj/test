<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
    <title> Information</title>
    
    
    
    <link rel='stylesheet prefetch' href='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css'>

        <link rel="stylesheet" href="bootstrap/css/style.css">

    
    
    
  </head>

  <body>

    <div class="login-card">
    <h1>Enter Details</h1><br>
 <form action="FinalServlet?action=buyer" method="post">
        <fieldset>
     
        
        <div>
               Mobile Number: <input type="text"
                    name="mobile" required >
                     
            </div>
            <div>
                CNIC Number: <input type="text"
                    name="cnic" required >
            </div>
        
            
            <div>
                <input type="submit" value="Submit" />
            </div>
        </fieldset>
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
