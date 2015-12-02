<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ads</title>
</head>
<body>

<table border=1>
        <thead>
            <tr>
                <th>Picture</th>
                <th>Description</th>
                <th>Location</th>
                <th>Price</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${adlist}" var="adlist">
                <tr>
                    <td><c:out value="${adlist.pic}" /></td>
                    <td><c:out value="${adlist.descr}" /></td>
                    <td><c:out value="${adlist.location}" /></td>
                    <td><c:out value="${adlist.price}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>



</body>
</html>