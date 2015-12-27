package poc.model;

public class BookMessage {

	
	int messageid;
	String message;
	int message_to_user;
	int message_from_user;
	int adlistid;
	
	
	
	
	
	public int getAdlistid() {
		return adlistid;
	}

	public void setAdlistid(int adlistid) {
		this.adlistid = adlistid;
	}

	public int getMessage_to_user() {
		return message_to_user;
	}

	public void setMessage_to_user(int message_to_user) {
		this.message_to_user = message_to_user;
	}

	public int getMessage_from_user() {
		return message_from_user;
	}

	public void setMessage_from_user(int message_from_user) {
		this.message_from_user = message_from_user;
	}

	public int getMessageid() {
		return messageid;
	}

	public void setMessageid(int messageid) {
		this.messageid = messageid;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
