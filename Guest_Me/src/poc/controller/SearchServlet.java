package poc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import poc.dao.AdDAO;
import poc.dao.AdDAOImplementation;

import poc.model.AdlistModel;


public class SearchServlet extends HttpServlet {
	
	private static final String DisplayS ="/displaySearch.jsp";
    private AdDAO dao;

	public void init() throws ServletException {
		super.init();
		 dao = new AdDAOImplementation();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("location")){
			
			String location = request.getParameter("location");
			
			request.setAttribute("abc", dao.searchLocation(location));
		
			RequestDispatcher view = request.getRequestDispatcher(DisplayS);
			view.forward(request, response);
		}
		
		
		else if(action.equalsIgnoreCase("allS"))
		{
		
		String location = request.getParameter("location");
		String from =request.getParameter("av_from");
		String to = request.getParameter("av_to");

		float price=0;
		
		if(request.getParameter("price").isEmpty()){
		System.out.println("null");
		
		}
		else{
			 price = Float.parseFloat(request.getParameter("price"));
			
			
		}
		
		int rooms=0;
		if(request.getParameter("rooms").isEmpty()){
			
		}
		else{
		 rooms = Integer.parseInt(request.getParameter("rooms"));
		
		
		}
		System.out.println("Location: "+ request.getParameter("location") + "\nRooms: " + request.getParameter("rooms") + "/n Av_F: " + from);
			
		
		
		
		request.setAttribute("abc", dao.searchAds(location,from,to,price,rooms));
		
		RequestDispatcher view = request.getRequestDispatcher(DisplayS);
		view.forward(request, response);
	
	}
	
	}

}
