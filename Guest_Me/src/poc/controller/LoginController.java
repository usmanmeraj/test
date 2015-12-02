package poc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import poc.dao.UserDAO;
import poc.dao.UserDAOImplementation;
import poc.model.UserModel;

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
				
			
			 HttpSession session = request.getSession();	    
	           
		 dispatch = request.getRequestDispatcher(Home);
		}
		
		else {
			dispatch = request.getRequestDispatcher(Error);
			
		}
		
		dispatch.forward(request, response);	
		}

}
