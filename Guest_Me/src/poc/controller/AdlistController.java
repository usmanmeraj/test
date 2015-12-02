package poc.controller;

import java.io.IOException;
import java.sql.Blob;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import poc.dao.AdDAO;
import poc.dao.AdDAOImplementation;
import poc.dao.UserDAO;
import poc.dao.UserDAOImplementation;
import poc.model.AdlistModel;
import poc.model.UserModel;

public class AdlistController extends HttpServlet {
	
	private AdDAO dao;
	
	 public static final String Home = "/Home.jsp";
	 public static final String displayAd = "/displayAd.jsp";

	
    public AdlistController() {
    	dao = new AdDAOImplementation();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	
		 AdlistModel adlist = new AdlistModel();
		   
		   adlist.setPic(request.getParameter( "pic" ) );
		   adlist.setDescr( request.getParameter( "descr" ) );

		   adlist.setLocation( request.getParameter( "location" ) );
		   adlist.setPrice(Float.parseFloat(request.getParameter("price")));

	        String adlistid = request.getParameter("adlistid");
		 
	 
	        if( adlistid == null || adlistid.isEmpty() )
	            dao.addList(adlist);
	        else {
	        	adlist.setAdlistid( Integer.parseInt(adlistid) );
	            
	        }
	        RequestDispatcher view = request.getRequestDispatcher(displayAd);
	        request.setAttribute("adlist", dao.getAllAds());
	        view.forward(request, response);
	        
	}

	
	
	}


