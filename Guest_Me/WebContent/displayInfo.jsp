<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Information</title>
</head>
<body>

Here is the sellers info ... Please pay the required amount.

<c:forEach items="${info}" var="m">

Cnic: <c:out value="${m.cnic }"/>
Mobile: <c:out value="${m.mobile }"/>


</c:forEach>



</body>
</html>