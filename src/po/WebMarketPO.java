package po;

public class WebMarketPO {
	//	”√ªß±‡∫≈
	private String userID;
	//	√‹¬Î
	private String password;
	public WebMarketPO(String userID, String password) {
		super();
		this.userID = userID;
		this.password = password;
	}
	
	public String getUserID() {
		return userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
