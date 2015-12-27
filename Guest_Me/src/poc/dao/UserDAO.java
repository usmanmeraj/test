package poc.dao;
import java.util.List;

import poc.model.AdlistModel;
import poc.model.SellRequests;
import poc.model.UserModel;
public interface UserDAO {
	public void addUser( UserModel user );
	public void addAdmin( UserModel admin );
	
	public UserModel login(UserModel user);
	public UserModel Adminlogin(UserModel admin);
    public List<UserModel> getAllUsers();
	public void deleteUser(int userId);
	public List<UserModel> getUserById(int userid);
	public void sellRequests(SellRequests req);
	 public List<SellRequests> getRequests();
    
}
