<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
    <title>Messages</title>
    
    
    
    <link rel='stylesheet prefetch' href='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css'>

        <link rel="stylesheet" href="bootstrap/css/style.css">

    
    
    
  </head>

<body>

 <div class="login-card">
<h1>Messages</h1>

Go Back To?
<a href="Home.jsp">Home</a>
<table border=1>
        <thead>
            <tr>
                <th>Message</th>
                <th>Message From</th>
                <th colspan="2">Action</th>
                
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${mess}" var="m">
                <tr>
                    <td><c:out value="${m.message}" /></td>
                    <td> <c:out value="${m.message_from_user}" /></td>
                   <td><a
                        href="MessageController?action=user&userid=<c:out value="${m.message_from_user }"/>">View User Info</a></td>
                       
            <td> <a href="FinalServlet?action=sell&userselling=<c:out value="${m.message_to_user }"/>&userbuying=<c:out value="${m.message_from_user }"/>&adlistid=<c:out value="${m.adlistid }"/>">Sell</a>
            </c:forEach>
        </tbody>
    </table>
    
    
   
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