package poc.dao;
import java.util.List;

import poc.model.AdlistModel;
import poc.model.UserModel;
public interface UserDAO {
	public void addUser( UserModel user );
	
	public UserModel login(UserModel user);
    
    public List<UserModel> getAllUsers();
    
}
