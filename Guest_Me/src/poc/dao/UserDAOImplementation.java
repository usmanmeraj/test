package poc.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 

import poc.model.AdlistModel;
import poc.model.UserModel;
import poc.util.UserUtil;

public class UserDAOImplementation implements UserDAO {
	 private Connection conn;
	 
	    public UserDAOImplementation() {
	        conn = UserUtil.getConnection();
	    }
	    @Override
	    public void addUser( UserModel user ) {
	        try {
	            String query = "insert into gm_users (firstname,lastname, email, dob, password) values (?,?,?,?,?)";
	            PreparedStatement preparedStatement = conn.prepareStatement( query );
	            preparedStatement.setString( 1, user.getFirstname() );
	            preparedStatement.setString( 2, user.getLastname() );
	            preparedStatement.setString( 3, user.getEmail() );
	            preparedStatement.setString( 4, user.getDob() );
	            preparedStatement.setString( 5, user.getPassword() );
	            
	            
	            preparedStatement.executeUpdate();
	            preparedStatement.close();
	            
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	        
	    
	
	    @Override
	    public List<UserModel> getAllUsers() {
	        List<UserModel> users = new ArrayList<UserModel>();
	        try {
	            Statement statement = conn.createStatement();
	            ResultSet resultSet = statement.executeQuery( "select * from gm_users" );
	            while( resultSet.next() ) {
	            	UserModel user = new UserModel();
	            	user.setUserid( resultSet.getInt( "userid" ) );
	            	user.setEmail( resultSet.getString( "email" ) );
	            	user.setPassword( resultSet.getString( "password" ) );
	            	
	                users.add(user);
	            }
	            resultSet.close();
	            statement.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return users;
	    }
	    
	    @Override
	  		public  UserModel login(UserModel user) {
	  			
	  			String query = "select * from gm_users where email=? and password=?";
	  			try {
	  				PreparedStatement ps = conn.prepareStatement(query);
  				ps.setString(1, user.getEmail());
	  				ps.setString(2, user.getPassword());
	  
	  				ResultSet rs = ps.executeQuery();
	  				boolean more = rs.next();
	  				
	  				if(more){
	  					user.setEmail(rs.getString("email"));
	  					user.setPassword(rs.getString("password"));
	  					
	  					user.setValid(true);
	  				
	  				}
	  				else if (!more){
	  				
	  					System.out.println("Error");
  					user.setValid(false);
	  					
	  				
	  				}
	  				
	  				
	  			} catch (SQLException e) {
	  				// TODO Auto-generated catch block
	  				e.printStackTrace();
	  			}
	  			return user;
	  		}
		
	    
	  
}
