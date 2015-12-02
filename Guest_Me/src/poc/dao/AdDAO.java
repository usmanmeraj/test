package poc.dao;

import java.util.List;

import poc.model.AdlistModel;

public interface AdDAO {
	public void addList(AdlistModel adlist);
	 public List<AdlistModel> getAllAds();
	
}
