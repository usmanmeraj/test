package poc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




import poc.model.AdlistModel;
import poc.util.UserUtil;

public class AdDAOImplementation implements AdDAO {

	
	
	 private Connection conn;
	 
	    public AdDAOImplementation() {
	        conn = UserUtil.getConnection();
	    }
	
	@Override
	public void addList(AdlistModel adlist) {
		
		
		
		 try {
	            String query = "insert into gm_adlist (pic, descr, location, price) values (?,?,?,?)";
	            PreparedStatement preparedStatement = conn.prepareStatement( query );
	            preparedStatement.setString( 1, adlist.getPic() );
	            preparedStatement.setString( 2, adlist.getDescr() );
	            preparedStatement.setString( 3, adlist.getLocation() );
	            preparedStatement.setFloat( 4, adlist.getPrice() );
	            
	            
	            preparedStatement.executeUpdate();
	            preparedStatement.close();
	            
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		 
		 
		 
		 
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
	                ad.setLocation(rs.getString("location"));
	                ad.setPrice(rs.getFloat("price"));
	                
	                ads.add(ad);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return ads;
	    }

}
