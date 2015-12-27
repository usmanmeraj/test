<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


 <meta charset="UTF-8">
   
<title>Buyer Info</title> 
    
    <link rel='stylesheet prefetch' href='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css'>

        <link rel="stylesheet" href="bootstrap/css/style.css">

    
    
</head>
<body>
<c:forEach items="${info}" var="m">


This <a href="MessageController?action=user&userid=<c:out value="${m.user_selling }"/>">User</a> has accepted your booking. 
Please submit your <a href="buyerInfo.jsp">details</a>.
</c:forEach>

</body>
</html>