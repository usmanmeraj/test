package poc.controller;

import java.io.IOException;
import java.io.PrintWriter;
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

import poc.dao.AdDAO;
import poc.dao.AdDAOImplementation;
import poc.dao.UserDAO;
import poc.dao.UserDAOImplementation;
import poc.model.SellRequests;
import poc.model.UserModel;
import poc.util.UserUtil;

/**
 * Servlet implementation class AdminController
 */
public class AdminController extends HttpServlet {

	RequestDispatcher dispatch;
	private UserDAO dao;
	private AdDAO dto;
	 public static final String Home = "/AdminHome.jsp";
	 public static final String Users = "/displayAllUsers.jsp";
	 
	 public static final String Error = "/Error.jsp";
		
    public AdminController() {
    	dao = new UserDAOImplementation();
    	dto = new AdDAOImplementation();
    }


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward="";  
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("Allusers")){
		
		request.setAttribute("users", dao.getAllUsers());
	        forward = Users;
	}
	        else if(action.equalsIgnoreCase("delete")){
	        	forward = Home;
	            int userId = Integer.parseInt( request.getParameter("userid") );
	            dao.deleteUser(userId);
	            request.setAttribute("users", dao.getAllUsers() );
		
	        }
	        
	        else if (action.equalsIgnoreCase("sell")){
	        	
	        	
	        	forward="/personalInfo.jsp";

	        	
	        	String user_selling= request.getParameter("userselling");
	        	
	        	String user_buying= request.getParameter("userbuying");
	        	
	        	String adlistid= request.getParameter("adlistid");
	        	
	        	HttpSession session = request.getSession();
	        	session.setAttribute("userselling", user_selling);
	        	
	        	SellRequests req = new SellRequests();
	        	
	        	System.out.println(Integer.parseInt(user_buying));
	        	
	        	req.setAdlistid(Integer.parseInt(adlistid));
	        	req.setUser_buying(Integer.parseInt(user_buying));
	        	req.setUser_selling(Integer.parseInt(user_selling));
	        	
	        	
	        	dao.sellRequests(req);
	        	

	        		        	
	        
	        }
	        else if(action.equals("requests")){
	        	request.setAttribute("reqs", dao.getRequests());
	        	forward="/displayRequests.jsp";
	        }
	        
	        else if(action.equalsIgnoreCase("only")){
			

			int adlistid = Integer.parseInt(request.getParameter("adlistid"));
			
			System.out.println("Adlistid: "+ adlistid);
			
			forward = "/AdminAllAds.jsp";
			
			request.setAttribute("sads", dto.searchAdbyId(adlistid));
			
			
			
		}
		
		
	        else if (action.equalsIgnoreCase("accept")){
	        	
	        }
		    
			RequestDispatcher view = request.getRequestDispatcher( forward );
	        view.forward(request, response);
		}
		
		


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
UserModel admin = new UserModel();
		
		admin.setEmail(request.getParameter("email"));
		admin.setPassword(request.getParameter("password"));
		
	System.out.println(request.getParameter("email"));
	System.out.println(request.getParameter("password"));

		
		dao.Adminlogin(admin);
	request.setAttribute("admin", admin);
		if(admin.isValid()) {
				
			Connection conn = UserUtil.getConnection();
			Statement stmt;
			
			try {
				stmt = conn.createStatement();
			
				ResultSet rs = stmt.executeQuery("Select * from gm_admins where email = '"+request.getParameter("email")+"'");
				
				if(rs.next()){
					rs.getString("firstname");
				}
			
				
			
			 HttpSession session = request.getSession();
			 HttpSession context = request.getSession();
			
			 context =request.getSession(true);
			context.setAttribute("id", rs.getString("adminid"));
			
			System.out.println(rs.getString("adminid"));
			
			
			 session.setAttribute("username", rs.getString("firstname"));
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
