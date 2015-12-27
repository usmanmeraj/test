package poc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import poc.dao.AdDAO;
import poc.dao.AdDAOImplementation;
import poc.model.AdlistModel;
import poc.util.UserUtil;

/**
 * Servlet implementation class SearchController
 */
public class AdsController extends HttpServlet {
	private static final String Display ="/displayAllAds.jsp";
	private static final String AdminDisplay ="/AdminAllAds.jsp";
	private static final String userAds ="/userAds.jsp";
	private static final String editAds ="/upload.jsp";


	private AdDAO dao;
   
	public void init() throws ServletException {
		super.init();
		 dao = new AdDAOImplementation();
	}


	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String forward ="";
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("only")){
			

			System.out.println("UserId: " + request.getSession(false).getAttribute("id"));
			
			
			HttpSession Session = request.getSession();
			String user = (String) Session.getAttribute("id");
			
			
			Object userid = request.getSession(false).getAttribute("id");
			
			request.setAttribute("your", dao.getAds(user));
			
			forward = userAds;
			
		}
		
		else if( action.equalsIgnoreCase( "edit" ) ) {
			  
	          HttpSession session = request.getSession(true);
	          session.setAttribute("adlistid", request.getParameter("adlistid"));
	          System.out.println("AdlistID : "+ request.getParameter("adlistid"));
			
			forward= editAds;
			
            int adId = Integer.parseInt( request.getParameter("adlistid") );
          
            AdlistModel ad = dao.getAdById(adId);
            request.setAttribute("your", ad);
        }
		
		
		else if(action.equalsIgnoreCase("delete")){
			 forward = userAds;
	            int adId = Integer.parseInt( request.getParameter("adlistid") );
	            dao.deleteAd(adId);
	            request.setAttribute("users", dao.getAllAds() );
		}
		
		
//		
//		String searchQuery="SELECT * FROM gm_adlist WHERE location LIKE '"+location+"' "
//				+ "AND rooms LIKE '"+rooms+"' AND price LIKE '"+price+"' ";
//		ResultSet rs=stmt.executeQuery(searchQuery);
	
		
		else if(action.equalsIgnoreCase("allAdmin")){
			request.setAttribute("sads", dao.getAllAds());
			forward = AdminDisplay;
		}
		
		else if(action.equalsIgnoreCase("book")){
		
	String userid =		request.getParameter("userid");
	String adlistid= request.getParameter("adlistid");		

	System.out.println(adlistid);
	HttpSession session = request.getSession();
	session.setAttribute("userid", userid);
	
	HttpSession context = request.getSession();
	context.setAttribute("adlistid", adlistid);
	
	forward = ("/BookMessage.jsp");
			
			
		}
	
		
		else if(action.equalsIgnoreCase("sold")){
			
			int adlistid = Integer.parseInt(request.getParameter("adlistid"));
			
			dao.updateAd(adlistid);
			
			forward = "/Home.jsp";
			
			
		}
		else if(action.equalsIgnoreCase("all")){
		
		

		
        
        request.setAttribute("sads", dao.getAllAds());
        
 
        forward = Display;

	    }
		RequestDispatcher view = request.getRequestDispatcher( forward );
        view.forward(request, response);
	}
	
}
