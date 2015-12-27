<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
    <title>Requests</title>
    
    
    
    <link rel='stylesheet prefetch' href='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css'>

        <link rel="stylesheet" href="bootstrap/css/style.css">

    
    
    
  </head>

<body>
<div class="login-card">

<h2>Requests</h2>

<table border=1>
        <thead>
            <tr>
              
                <th colspan="2">Adlist Id</th>
                <th colspan="2">User Buying </th>
                <th colspan="2">User Selling </th>
                <th colspan="2">Action</th>

                
                
                
                
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${reqs}" var="req">
                <tr>
                   <td> <c:out value="${req.adlistid }"/></td>
                  <td><a href="AdminController?action=only&adlistid=<c:out value="${req.adlistid}" />">View Ad</a></td>
                    <td> <c:out value="${req.user_buying }"/></td>
                  <td>
                    <a
                        href="MessageController?action=user&userid=<c:out value="${req.user_buying }"/>">View User Info</a></td>
                    <td> <c:out value="${req.user_selling }"/></td>
                  
                    <td><a
                        href="MessageController?action=user&userid=<c:out value="${req.user_selling }"/>">View User Info</a></td>
                    
                  <td> <a href="AdminController?action=accept">Accept</a></td>
                   
                   <td> <a href="AdminController?action=decline">Decline</a> </td>
                   
                </tr>
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