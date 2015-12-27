package poc.dao;

import java.util.List;

import poc.model.AdlistModel;
import poc.model.BookMessage;
import poc.model.InfoModel;
import poc.model.UserModel;

public interface AdDAO {
	public void addList(AdlistModel adlist);
	
	 public List<AdlistModel> getAds(String userid);
	 public List<AdlistModel> getAllAds();
	 public List<AdlistModel> searchAds(String location, String from, String to,Float price,int rooms);
	 public void deleteAd(int adId);
	 public AdlistModel getAdById(int adId);
	 public void bookMessage(BookMessage message);
	 public List<BookMessage> getMessageById(String message_to_user);

	public List<AdlistModel> searchLocation(String location);
	public List<AdlistModel> searchAdbyId(int adlistid);
	
	public void addInfo(InfoModel adlist);
	
	public void addBuyerInfo(InfoModel adlist);
	
	 public List<InfoModel> getSellerInfo(String userbuying);
	 
	 public void updateAd(int adlistid);

	
}
