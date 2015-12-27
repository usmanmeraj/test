package poc.model;

import java.sql.Date;

public class AdlistModel {

	private int adlistid;
	private String pic;
	private String descr;
	private String location;
	private float price;
	private int rooms;
	private String av_from;
	private String av_to;
	private int userid;
	private String availability;
	
	

	
	
	
	
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getAv_from() {
		return av_from;
	}
	public void setAv_from(String av_from) {
		this.av_from = av_from;
	}
	public String getAv_to() {
		return av_to;
	}
	public void setAv_to(String av_to) {
		this.av_to = av_to;
	}
	public int getAdlistid() {
		return adlistid;
	}
	public void setAdlistid(int adlistid) {
		this.adlistid = adlistid;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	
	
}
