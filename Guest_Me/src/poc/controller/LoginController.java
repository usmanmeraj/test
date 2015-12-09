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
import javax.servlet.http.HttpSession;






import poc.dao.UserDAO;
import poc.dao.UserDAOImplementation;
import poc.model.UserModel;
import poc.util.UserUtil;

public class LoginController extends HttpServlet {
	
	RequestDispatcher dispatch;
	private UserDAO dao;
	 public static final String Home = "/Home.jsp";
	 public static final String Error = "/Error.jsp";
		
    public LoginController() {
    	dao = new UserDAOImplementation();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		UserModel user = new UserModel();
		
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		
	

		
		dao.login(user);
	
		if(user.isValid()) {
				
			Connection conn = UserUtil.getConnection();
			Statement stmt;
			
			try {
				stmt = conn.createStatement();
			
				ResultSet rs = stmt.executeQuery("Select * from gm_users where email = '"+request.getParameter("email")+"'");
				
				if(rs.next()){
					rs.getString("firstname");
				}
			
				
			
			 HttpSession session = request.getSession();
			 HttpSession context = request.getSession();
			
			 context =request.getSession(true);
			context.setAttribute("id", rs.getString("userid"));
			
			System.out.println(rs.getString("userid"));
			
			
			 session.setAttribute("user", rs.getString("firstname"));
			System.out.println("Session id: " + session.getId());
		 dispatch = request.getRequestDispatcher(Home);
			}
		 
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else {
			dispatch = request.getRequestDispatcher(Error);
			
		}
		
		dispatch.forward(request, response);	
		}

}
