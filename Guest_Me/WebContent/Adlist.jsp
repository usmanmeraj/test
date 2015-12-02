<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adlist</title>
</head>
<body>

<form action="AdlistController.do" method="post">
        <fieldset>
     
        
        <div>
                <label for="pic">Picture</label> <input type="file" 
                    name="pic" accept="image/*" value="<c:out value="${adlist.pic}" />"
                     />
            </div>
            <div>
                <label for="descr">Description</label> <input type="text"
                    name="descr" value="<c:out value="${adlist.descr}" />"
                     />
            </div>
        
            <div>
                <label for="location">Location</label> <input type="text"
                    name="location" value="<c:out value="${adlist.location}" />"
                     />
            </div>
            
            <div>
                <label for="price">Price</label> <input type="text"
                    name="price" value="<c:out value="${adlist.price}" />"
                     />
            </div>
            
            
           
            <div>
                <input type="submit" value="Submit" />
            </div>
        </fieldset>
    </form>



</body>
</html>