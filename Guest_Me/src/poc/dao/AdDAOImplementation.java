package poc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;











import poc.model.AdlistModel;
import poc.model.BookMessage;
import poc.model.InfoModel;
import poc.model.SellRequests;
import poc.util.UserUtil;

public class AdDAOImplementation implements AdDAO {

	
	
	 private Connection conn;
	 
	    public AdDAOImplementation() {
	        conn = UserUtil.getConnection();
	    }
	
	    
	   
	    
	    
	    
	    public void deleteAd(int adId) {
	        try {
	            PreparedStatement preparedStatement = conn
	                    .prepareStatement("delete from gm_adlist where adlistid=?");
	            // Parameters start with 1
	            preparedStatement.setInt(1, adId);
	            preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    
	    
	    
	    
	    
	    
	@Override
	public void addList(AdlistModel adlist) {
		
		
		
		 try {
	            String query = "insert into gm_adlist (pic, descr, location, av_from, av_to, price) values (?,?,?,?,?,?)";
	            PreparedStatement preparedStatement = conn.prepareStatement( query );
	            preparedStatement.setString( 1, adlist.getPic() );
	            preparedStatement.setString( 2, adlist.getDescr() );
	            preparedStatement.setString( 3, adlist.getLocation() );
	            preparedStatement.setString(4, adlist.getAv_from());
	            preparedStatement.setString(5, adlist.getAv_to());
	            preparedStatement.setFloat( 4, adlist.getPrice() );
	            
	            
	            preparedStatement.executeUpdate();
	            preparedStatement.close();
	            
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		 
		 
		 
		 
	}
	
	
	
	
	public List<AdlistModel> searchAds(String location,String from, String to, Float price, int rooms) {
       
		 List<AdlistModel> results = new ArrayList<AdlistModel>();
        try {
            String query = "Select * from gm_adlist where location=? or av_from=? or av_to=? or price =? or rooms =?";
            
            PreparedStatement ps = conn.prepareStatement(query);
      
            ps.setString(1, location);
            ps.setString(2, from);
            ps.setString(3, to);
            ps.setFloat(4, price);
            ps.setInt(5, rooms);
           ResultSet rs = ps.executeQuery();

            while (rs.next()) {
            	AdlistModel ads = new AdlistModel();
            	ads.setDescr(rs.getString("descr"));
                ads.setLocation(rs.getString("location"));
                ads.setAv_from(rs.getString("av_from"));
                ads.setAv_to(rs.getString("av_to"));
                ads.setPrice(rs.getFloat("price"));
                ads.setRooms(rs.getInt("rooms"));
                ads.setPic(rs.getString("pic"));
                ads.setAvailability(rs.getString("availability"));
                
                results.add(ads);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return results;
    }


	
	

	   
	
	
	
	//method
	   public List<AdlistModel> getAds(String userid) {
	        List<AdlistModel> results = new ArrayList<AdlistModel>();
	        try {
	           
	            
	           String query = "Select * from gm_adlist where userid= '"+userid+"' ";
	           
	           PreparedStatement ps = conn.prepareStatement(query);
	           
	         //  ps.setInt(1, Integer.parseInt(userid));
	           
	           System.out.println(userid + "\n" + query);
	           
	           ResultSet rs = ps.executeQuery(query);
	            
	            
	            
	            
	            while (rs.next()) {
	            	AdlistModel result = new AdlistModel();
	            	result.setAdlistid(rs.getInt("adlistid"));
	            	    result.setDescr(rs.getString("descr"));
		                result.setLocation(rs.getString("location"));
		                result.setAv_from(rs.getString("av_from"));
		                result.setAv_to(rs.getString("av_to"));
		                result.setPrice(rs.getFloat("price"));
		                result.setRooms(rs.getInt("rooms"));
		                result.setPic(rs.getString("pic"));
			            
			            results.add(result);
	               
	               
	            }
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return results;
	   }
	
	
	
	 public List<AdlistModel> getAllAds() {
	        List<AdlistModel> ads = new ArrayList<AdlistModel>();
	        try {
	        	 Statement statement = conn.createStatement();
	            ResultSet rs = statement.executeQuery("select * from gm_adlist");
	            while (rs.next()) {
	                AdlistModel ad = new AdlistModel();
	                ad.setAdlistid( rs.getInt( "adlistid" ) );
	                ad.setPic(rs.getString("pic"));
	                ad.setDescr(rs.getString("descr"));
	                ad.setAv_from(rs.getString("av_from"));
	                ad.setAv_to(rs.getString("av_to"));
	                
	                ad.setRooms(rs.getInt("rooms"));
	                ad.setLocation(rs.getString("location"));
	                ad.setPrice(rs.getFloat("price"));
	                ad.setUserid(rs.getInt("userid"));
	                ad.setAvailability(rs.getString("availability"));
	                
	                ads.add(ad);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return ads;
	    }

	 
	 public AdlistModel getAdById(int adId) {
	    	AdlistModel ad = new AdlistModel();
	        try {
	            String query = "select * from gm_adlist where adlistid=?";
	            
	            System.out.println(query);
	            PreparedStatement preparedStatement = conn.prepareStatement( query );
	            preparedStatement.setInt(1, adId);
	            ResultSet resultSet = preparedStatement.executeQuery();
	            while( resultSet.next() ) {
	            	ad.setAdlistid( resultSet.getInt( "adlistid" ) );
	            	ad.setDescr( resultSet.getString( "descr" ) );
	            	ad.setLocation( resultSet.getString( "location" ) );
	            	ad.setAv_from( resultSet.getString( "av_from" ) );
	            	ad.setAv_to( resultSet.getString( "av_to" ) );
	            	ad.setPrice( resultSet.getFloat( "price" ) );
	            	ad.setRooms( resultSet.getInt( "rooms" ) );
	            
	            }
	            resultSet.close();
	            preparedStatement.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return ad;
	 }
	 
	 
	 
	 public void bookMessage(BookMessage message){
		 try {
		 
		 String query= "Insert into gm_message (message, message_from_user, message_to_user, adlistid) values(?,?,?,?)";
		 
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setString(1, message.getMessage());
			ps.setInt(2, message.getMessage_from_user());
			ps.setInt(3, message.getMessage_to_user());
			ps.setInt(4, message.getAdlistid());
			
			ps.executeUpdate();
			ps.close();
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	
	 
	 public List<BookMessage> getMessageById(String message_to_user) {
	    	List<BookMessage> result = new ArrayList<BookMessage>();
	        try {
	        	 String query = "Select * from gm_message where message_to_user='"+message_to_user+"'";
	            
	            System.out.println(query);
	            PreparedStatement preparedStatement = conn.prepareStatement( query );
	           // preparedStatement.setInt(1, message_to_user);
	            ResultSet resultSet = preparedStatement.executeQuery();
	            while( resultSet.next() ) {
	            	BookMessage m = new BookMessage();
	            System.out.println("Message: " + resultSet.getString("message") +"Message From: "+ resultSet.getInt("message_from_user"));
	            	
	            	m.setMessage(resultSet.getString("message"));
	            	m.setMessage_from_user(resultSet.getInt("message_from_user"));
	            	m.setMessage_to_user(resultSet.getInt("message_to_user"));
	            	m.setAdlistid(resultSet.getInt("adlistid"));
	            
	            	result.add(m);
	            }
	          
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return result;
	
	 }






	@Override
	public List<AdlistModel> searchLocation(String location) {

		 List<AdlistModel> results = new ArrayList<AdlistModel>();
       try {
           String query = "Select * from gm_adlist where location=? ";
           
           PreparedStatement ps = conn.prepareStatement(query);
     
           ps.setString(1, location);
          
          ResultSet rs = ps.executeQuery();

           while (rs.next()) {
           	AdlistModel ads = new AdlistModel();
           	ads.setDescr(rs.getString("descr"));
               ads.setLocation(rs.getString("location"));
               ads.setAv_from(rs.getString("av_from"));
               ads.setAv_to(rs.getString("av_to"));
               ads.setPrice(rs.getFloat("price"));
               ads.setRooms(rs.getInt("rooms"));
               ads.setPic(rs.getString("pic"));
               results.add(ads);
           }
       } catch (SQLException e) {
           e.printStackTrace();
       }

       return results;
	}
	 
	

	public List<AdlistModel> searchAdbyId(int adlistid) {

		 List<AdlistModel> results = new ArrayList<AdlistModel>();
      try {
          String query = "Select * from gm_adlist where adlistid=? ";
          
          PreparedStatement ps = conn.prepareStatement(query);
    
          ps.setInt(1, adlistid);
         
         ResultSet rs = ps.executeQuery();

          while (rs.next()) {
          	AdlistModel ads = new AdlistModel();
          	ads.setDescr(rs.getString("descr"));
              ads.setLocation(rs.getString("location"));
              ads.setAv_from(rs.getString("av_from"));
              ads.setAv_to(rs.getString("av_to"));
              ads.setPrice(rs.getFloat("price"));
              ads.setRooms(rs.getInt("rooms"));
              ads.setPic(rs.getString("pic"));
              results.add(ads);
          }
      } catch (SQLException e) {
          e.printStackTrace();
      }

      return results;
	}

	public void addInfo(InfoModel adlist) {
		
		
		
		 try {
	            String query = "insert into gm_seller_info (user_selling, cnic, mobile, user_buying, adlistid) values (?,?,?,?,?)";
	            PreparedStatement preparedStatement = conn.prepareStatement( query );
	            preparedStatement.setInt( 1, adlist.getUser_selling());
	            preparedStatement.setInt( 2, adlist.getCnic());
	            preparedStatement.setInt( 3, adlist.getMobile());
	            preparedStatement.setInt(4, adlist.getUser_buying());
	            preparedStatement.setInt(5, adlist.getAdlistid());
	            
	            
	            
	            preparedStatement.executeUpdate();
	            preparedStatement.close();
	            
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		 
		 
		 
		 
	}
	
	
	
	
	public void addBuyerInfo(InfoModel adlist) {
		
		
		
		 try {
	            String query = "insert into gm_buyer_info (user_buying, cnic, mobile) values (?,?,?)";
	            PreparedStatement preparedStatement = conn.prepareStatement( query );
	            preparedStatement.setInt( 1, adlist.getUser_buying());
	            preparedStatement.setInt( 2, adlist.getCnic());
	            preparedStatement.setInt( 3, adlist.getMobile());
	           
	            
	            preparedStatement.executeUpdate();
	            preparedStatement.close();
	            
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		 
	}
	
	
	 public List<InfoModel> getSellerInfo(String userbuying) {
	    	List<InfoModel> result = new ArrayList<InfoModel>();
	        try {
	        	 String query = "Select * from gm_seller_info where user_buying='"+userbuying+"'";
	            
	           
	            PreparedStatement preparedStatement = conn.prepareStatement( query );
	           // preparedStatement.setInt(1, message_to_user);
	            ResultSet rs = preparedStatement.executeQuery();
	            while( rs.next() ) {
	            	InfoModel m = new InfoModel();
	            	
	           
	            	m.setUser_selling(rs.getInt("user_selling"));
	            	m.setCnic(rs.getInt("cnic"));;
	            	m.setMobile(rs.getInt("mobile"));;
	            
	            	result.add(m);
	            }
	          
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return result;
	
	 }
	  
	 public void updateAd(int adlistid){
	 
		 try {
	String query = "update gm_adlist set availability='sold' where adlistid='"+adlistid+"'";
		
			PreparedStatement statement = conn.prepareStatement(query);
			
			
			
			statement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	 }
}
