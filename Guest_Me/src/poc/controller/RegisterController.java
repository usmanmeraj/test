package poc.controller;

import java.io.Console;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import poc.dao.UserDAO;
import poc.dao.UserDAOImplementation;
import poc.model.UserModel;
/**
 * Servlet implementation class UserContrroller
 */
@WebServlet("/UserController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserDAO dao;
    public static final String Index = "/index.html";
   

			
    /**
     * Default constructor. 
     */
    public RegisterController() {
        // TODO Auto-generated constructor stub
    	dao = new UserDAOImplementation();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		   UserModel user = new UserModel();
		   
		   user.setFirstname( request.getParameter( "firstname" ) );
	        user.setLastname( request.getParameter( "lastname" ) );

	        user.setEmail( request.getParameter( "email" ) );
	        user.setDob(request.getParameter( "dob") );

	        user.setPassword( request.getParameter( "password" ) );
	        String userId = request.getParameter("userid");
		 
	 
	        if( userId == null || userId.isEmpty() )
	            dao.addUser(user);
	        else {
	            user.setUserid( Integer.parseInt(userId) );
	            
	        }
	        RequestDispatcher view = request.getRequestDispatcher(Index);
	        request.setAttribute("users", dao.getAllUsers());
	        view.forward(request, response);
	        
	}

}
