<%@page import="poc.util.UserUtil"%>
<%@page import= "java.sql.Connection"  %>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="poc.dao.UserDAOImplementation"%>
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


<%  Connection conn;
conn= UserUtil.getConnection();

Statement stmt= conn.createStatement();
 ResultSet rs = 
                stmt.executeQuery("SELECT * from gm_adlist") ;
            
%>

<table border='2' style="width:50%">
 <tr> 
 <td><b> Pic </b></td>
 <td> <b>Descr </b></td>
 <td><b> Location </b></td>
 <td> <b>Price </b></td>
 
 
 </tr>
 

 <% while(rs.next()){ %>
            <TR>
                <TD> <%= rs.getString("pic") %></TD>
                <TD> <%= rs.getString("descr") %></TD>
                 <TD> <%= rs.getString("location") %></TD>
                <TD> <%= rs.getString("price") %></TD>
               
                
                

            </TR>
            <% } %>
 
 
 
 </table>







</body>
</html>