package po;

import java.io.Serializable;

import vo.WebMarketerVO;

public class WebMarketerPO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8577895472775494103L;

	//	用户编号
	private String userID;
	
	//	密码
	private String password;
	
	public WebMarketerPO(String userID, String password) {
		super();
		this.userID = userID;
		this.password = password;
	}
	
	public WebMarketerPO(WebMarketerVO webMarketerVO) {
		super();
		this.userID = webMarketerVO.userID;
		this.password = webMarketerVO.password;
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
