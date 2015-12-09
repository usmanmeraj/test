package poc.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import poc.util.UserUtil;

/**
 * Servlet implementation class SearchController
 */
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SearchController() {
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Connection conn;
        conn = UserUtil.getConnection();
		
	try {
		Statement stmt = conn.createStatement();
		
		System.out.println(request.getParameter("location"));
		
		String location = request.getParameter("location");
		String rooms = request.getParameter("rooms");
		String price = request.getParameter("price");
		
		
		
		String searchQuery="SELECT * FROM gm_adlist WHERE location LIKE '%'"+location+"'%' "
				+ "AND rooms LIKE '%"+rooms+"%' AND price LIKE '%'"+price+"'%' ";
		ResultSet rs=stmt.executeQuery(searchQuery);
		
		
		RequestDispatcher dispatch;
		dispatch = request.getRequestDispatcher("");
		dispatch.forward(request, response);
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}


}
