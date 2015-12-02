<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

<a href="index.jsp">
<img src="logo/logo.JPG" style="width:100px;height:100px;">
</a>



<form action="LoginController.do" method="post">
        <fieldset>
        
            <div>
                <label for="firstName">Email</label> <input type="email"
                    name="email" value="<c:out value="${user.email}" />"
                     />
            </div>
            <div>
                <label for="password">Password</label> <input type="password"
                    name="password" value="<c:out value="${user.password}" />"
                     />
            </div>
            <div>
                <input type="submit" value="Submit" />
            </div>
        </fieldset>
    </form>


</body>
</html>