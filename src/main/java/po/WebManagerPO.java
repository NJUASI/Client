package po;

import java.io.Serializable;

import vo.WebManagerVO;

public class WebManagerPO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3713445002016120118L;

	//	管理人员编号
	private String userID;
	
	//	密码
	private String password;
	
	public WebManagerPO(String userID, String password) {
		super();
		this.userID = userID;
		this.password = password;
	}
	
	public WebManagerPO(WebManagerVO  webManagerVO) {
		super();
		this.userID = webManagerVO.userID;
		this.password = webManagerVO.password;
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
