package poc.controller;

import java.io.IOException;

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
import poc.model.AdlistModel;
import poc.model.BookMessage;
import poc.model.InfoModel;
import poc.model.UserModel;
import poc.util.UserUtil;

/**
 * Servlet implementation class MessageController
 */
public class MessageController extends HttpServlet {
	private static final String  Message= "/displayMessages.jsp";
	private static final String  User= "/userInfo.jsp";
    
	private AdDAO dao;
	private UserDAO dto;
	
    public MessageController() {
    	dao = new AdDAOImplementation();
    	dto = new UserDAOImplementation();


    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward="";

		String action= request.getParameter("action");
		
		
		
		
		if(action.equalsIgnoreCase("message")){
System.out.println("UserId: " + request.getSession(false).getAttribute("id"));
			
			
			HttpSession Session = request.getSession();
			String user = (String) Session.getAttribute("id");
			
			
			
			
			request.setAttribute("mess", dao.getMessageById(user));
			forward = Message;
			
			
		}
		
		else if(action.equalsIgnoreCase("user")){
			int userid = Integer.parseInt(request.getParameter("userid"));
			forward= User ;
			
          
         
           request.setAttribute("users", dto.getUserById(userid));
			
		}
		
			RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
		
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		  BookMessage message = new BookMessage();
		  HttpSession Session = request.getSession();
			String user = (String) Session.getAttribute("id"); 
		  
			String userid= (String) request.getSession().getAttribute("userid");
		   String adlistid = (String) request.getSession().getAttribute("adlistid");
		   System.out.println( "Adlist id: "+ adlistid + "\nUserid: "+ userid+ "\nUser: " + user);
		   
		   
		   
		  message.setMessage( request.getParameter( "message" ) );
		   message.setMessage_from_user(Integer.parseInt(user));
		   message.setMessage_to_user(Integer.parseInt(userid));
		   message.setAdlistid(Integer.parseInt(adlistid));
		   
		   dao.bookMessage(message);
		   
		   RequestDispatcher view = request.getRequestDispatcher("/Home.jsp");	   
		view.forward(request, response);
	}

	
}
