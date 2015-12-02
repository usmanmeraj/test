<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="RegisterController.do" method="post">
        <fieldset>
     
        
        <div>
                <label for="firstname">First Name</label> <input type="text"
                    name="firstname" value="<c:out value="${user.firstname}" />"
                     />
            </div>
            <div>
                <label for="lastname">Last Name</label> <input type="text"
                    name="lastname" value="<c:out value="${user.lastname}" />"
                     />
            </div>
        
            <div>
                <label for="email">Email</label> <input type="email"
                    name="email" value="<c:out value="${user.email}" />"
                     />
            </div>
            
            <div>
                <label for="dob">DOB</label> <input type="dob"
                    name="dob" value="<c:out value="${user.dob}" />"
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