<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href=Home.jsp">
<img src="logo/logo.JPG" style="width:100px;height:100px;">
</a>

<form>
  Search GuestMe:
  <a href="Searchpage.jsp"> Search</a>
</form>

<br>
<h>Home</h> 
<br>
<br>
<h2>Welcome <font color="red"> <%= session.getAttribute("user") %>
</font> </h1> 
<br>


<a href="displayAd.jsp"> View All Ads</a>



<br>

<br>

<a href="Adlist.jsp">Adlist</a>

<br>
<br>



<form method="link" action="logout.jsp">
    
    
    
        <button onclick="window.location.href='logout.jsp'">Logout</button>
        
        </form>

</body>
</html>