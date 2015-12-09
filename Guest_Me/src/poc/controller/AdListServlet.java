package poc.controller;
import poc.controller.LoginController;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/uploadServlet")
@MultipartConfig(maxFileSize = 16177215)	// upload file's size up to 16MB
public class AdListServlet extends HttpServlet {
	
	// database connection settings
	private String dbURL = "jdbc:mysql://localhost:3306/db_gm";
	private String dbUser = "root";
	private String dbPass = "";
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		InputStream inputStream = null;	// input stream of the upload file
		
		// obtains the upload file part in this multipart request
		Part filePart = request.getPart("pic");
		if (filePart != null) {
			// prints out some information for debugging
			System.out.println(filePart.getName());
			System.out.println(filePart.getSize());
			System.out.println(filePart.getContentType());
			
			// obtains input stream of the upload file
			inputStream = filePart.getInputStream();
		}
		
		Connection conn = null;	// connection to the database
		String message = null;	// message will be sent back to client
		
		try {
			// connects to the database
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			conn = DriverManager.getConnection(dbURL, dbUser, dbPass);

			
			// constructs SQL statement
			String sql = "insert into gm_adlist (descr, location, price, rooms, pic, userid) values (?,?,?,?,?,?)";
			
			System.out.println("Userid: "+ request.getSession(false).getAttribute("id"));
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, request.getParameter("descr"));
			statement.setString(2, request.getParameter("location"));

			statement.setFloat(3, Float.parseFloat(request.getParameter("price")));
			statement.setInt(4, Integer.parseInt(request.getParameter("rooms")));
			
			System.out.println("Userid after query: " + request.getSession(false).getAttribute("id"));
			
			if (inputStream != null) {
				// fetches input stream of the upload file for the blob column
				statement.setBlob(5, inputStream);
			}

			
			
			statement.setObject(6, request.getSession(false).getAttribute("id"));
			// sends the statement to the database server
			int row = statement.executeUpdate();
			if (row > 0) {
				message = "Ad Posted";
			}
		} catch (SQLException ex) {
			message = "ERROR: " + ex.getMessage();
			ex.printStackTrace();
		} finally {
			if (conn != null) {
				// closes the database connection
				try {
					conn.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			// sets the message in request scope
			request.setAttribute("Message", message);
			
			// forwards to the message page
			getServletContext().getRequestDispatcher("/Message.jsp").forward(request, response);
		}
	}
}