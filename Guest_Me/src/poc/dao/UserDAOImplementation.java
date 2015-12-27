package poc.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 





import poc.model.AdlistModel;
import poc.model.BookMessage;
import poc.model.SellRequests;
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
	    
	    
	    public void deleteUser(int userId) {
	        try {
	            PreparedStatement preparedStatement = conn
	                    .prepareStatement("delete from gm_users where userid=?");
	            // Parameters start with 1
	            preparedStatement.setInt(1, userId);
	            preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    
	    
	    
	    public  UserModel Adminlogin(UserModel admin) {
  			
  			String query = "select * from gm_admins where email=? and password=?";
  			try {
  				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1, admin.getEmail());
  				ps.setString(2, admin.getPassword());
  				
  				ResultSet rs = ps.executeQuery();
  				
  				System.out.println(query);
  				boolean more = rs.next();
  				
  				if(more){
  					
  					admin.setEmail(rs.getString("email"));
  					admin.setPassword(rs.getString("password"));
  					admin.setValid(true);
  				
  				}
  				else if (!more){
  				
  					System.out.println("Error");
					admin.setValid(false);
  					
  				
  				}
  				
  				
  			} catch (SQLException e) {
  				// TODO Auto-generated catch block
  				e.printStackTrace();
  			}
  			return admin;
  		}
	    
	    
	    public void addAdmin( UserModel admin ) {
	        try {
	            String query = "insert into gm_admins (firstname,lastname, email, dob, password) values (?,?,?,?,?)";
	            PreparedStatement preparedStatement = conn.prepareStatement( query );
	            preparedStatement.setString( 1, admin.getFirstname() );
	            preparedStatement.setString( 2, admin.getLastname() );
	            preparedStatement.setString( 3, admin.getEmail() );
	            preparedStatement.setString( 4, admin.getDob() );
	            
	            preparedStatement.setString( 5, admin.getPassword() );
	            
	            
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
	            	user.setFirstname(resultSet.getString("firstname"));
	            	user.setLastname(resultSet.getString("lastname"));
	            	user.setDob(resultSet.getString("dob"));
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
		
	    
	    public List<UserModel> getUserById(int userId) {
	    	 List<UserModel> results = new ArrayList<UserModel>();	        
	    	 try {
	            String query = "select * from gm_users where userid=?";
	            
	            System.out.println(userId);
	            PreparedStatement preparedStatement = conn.prepareStatement( query );
	            preparedStatement.setInt(1, userId);
	            ResultSet resultSet = preparedStatement.executeQuery();
	            while( resultSet.next() ) {
	            	UserModel user = new UserModel();
	            	user.setEmail( resultSet.getString( "email" ) );
	            	user.setFirstname(resultSet.getString("firstname"));
	            	user.setLastname(resultSet.getString("lastname"));
	            	user.setDob(resultSet.getString("dob"));
	            	
	           results.add(user);
	            	
	            }
	            resultSet.close();
	            preparedStatement.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return results;
	 }
	    
	    
	    public void sellRequests(SellRequests req){
			 try {
				 System.out.println(req.getAdlistid());
					
				 
			 String query= "Insert into gm_sellrequests (adlistid, user_buying, user_selling) values(?,?,?)";
			 
				PreparedStatement ps = conn.prepareStatement(query);
				
				
				ps.setInt(1, req.getAdlistid());
				ps.setInt(2, req.getUser_buying());
				ps.setInt(3, req.getUser_selling());
				
				ps.executeUpdate();
				ps.close();
				
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	    
	    
	    public List<SellRequests> getRequests() {
	    	List<SellRequests> result = new ArrayList<SellRequests>();
	        try {
	        	 String query = "Select * from gm_sellrequests";
	            
	           
	            PreparedStatement preparedStatement = conn.prepareStatement( query );
	           // preparedStatement.setInt(1, message_to_user);
	            ResultSet rs = preparedStatement.executeQuery();
	            while( rs.next() ) {
	            	SellRequests m = new SellRequests();
	            	
	           
	            	m.setAdlistid(rs.getInt("adlistid"));;
	            	m.setUser_buying(rs.getInt("user_buying"));;
	            	m.setUser_selling(rs.getInt("user_selling"));
	            
	            	result.add(m);
	            }
	          
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return result;
	
	 }
	  
	    
	    
	    
	    
}
