<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>All Users</title>
</head>
<body>


<br>

    <table border=1>
        <thead>
            <tr>
                <th>UserId</th>
                <th>First Name</th>
                <th>Last Name </th>
                <th>Dob </th>
                <th>Email</th>
                
                
                 <th colspan="1">Action</th>
                
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td><c:out value="${user.userid}" /></td>
                    <td><c:out value="${user.firstname}" /></td>
                    <td><c:out value="${user.lastname}" /></td>
                    <td><c:out value="${user.dob}" /></td>
                    
                    <td><c:out value="${user.email}" /></td>
                   <td><a
                        href="AdminController?action=delete&userid=<c:out value="${user.userid }"/>">Delete</a></td>
                   
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

</body>

</html>