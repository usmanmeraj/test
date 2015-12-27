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
import poc.model.InfoModel;

/**
 * Servlet implementation class FinalServlet
 */
public class FinalServlet extends HttpServlet {
	AdDAO dao;
	
	private static final String Home = "/Home.jsp";
  
    public FinalServlet() {
       
    	dao = new AdDAOImplementation();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String action = request.getParameter("action");
	String forward="";
	
	HttpSession session = request.getSession();
	session.setAttribute("userselling", request.getParameter("userselling"));
	
	
	
	session.setAttribute("userbuying",request.getParameter("userbuying"));
	session.setAttribute("adlistid", request.getParameter("adlistid"));
	
	if(action.equalsIgnoreCase("sell")){
		
		 forward = "/personalInfo.jsp";
		
	}
	
	
	
	else if(action.equalsIgnoreCase("accepted")){
		
		forward = "AcceptedBookings.jsp";
		
		String id = (String) request.getSession().getAttribute("id");
		
		request.setAttribute("info", dao.getSellerInfo(id));
	}
	
	
RequestDispatcher view = request.getRequestDispatcher(forward);
view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("seller")){
			InfoModel in = new InfoModel();
			
			String userselling = (String) request.getSession().getAttribute("userselling");
			String userbuying = (String) request.getSession().getAttribute("userbuying");
			String adlistid = (String) request.getSession().getAttribute("adlistid");
			
			
			
			System.out.println(userselling);
			
			int cnic = Integer.parseInt(request.getParameter("cnic"));
			int mobile = Integer.parseInt(request.getParameter("mobile"));
			
			in.setUser_selling(Integer.parseInt(userselling));
			in.setCnic(cnic);
			in.setMobile(mobile);
			in.setUser_buying(Integer.parseInt(userbuying));
			in.setAdlistid(Integer.parseInt(adlistid));
			
			
			dao.addInfo(in);
			RequestDispatcher view = request.getRequestDispatcher(Home);
			view.forward(request, response);
		}
		
		else if (action.equalsIgnoreCase("buyer")){
			
			
			InfoModel in = new InfoModel();
			String userbuying = (String) request.getSession().getAttribute("id");
			
			
			
			
			int cnic = Integer.parseInt(request.getParameter("cnic"));
			int mobile = Integer.parseInt(request.getParameter("mobile"));
			
			
			in.setCnic(cnic);
			in.setMobile(mobile);
			in.setUser_buying(Integer.parseInt(userbuying));
			
			
			dao.addBuyerInfo(in);
			
			request.setAttribute("info", dao.getSellerInfo(userbuying));
		RequestDispatcher view = request.getRequestDispatcher("/displayInfo.jsp");
		
		view.forward(request, response);
		}
		
		
		
		
	}
	

}
