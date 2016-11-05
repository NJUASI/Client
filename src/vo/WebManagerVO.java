package vo;

public class WebManagerVO extends UserVO {
	//	管理人员编号
	public String webManagerID;
	//	密码
	public String password;
	
	
	public WebManagerVO(String webManagerID, String password) {
		super(webManagerID,password);
		this.webManagerID = webManagerID;
		this.password = password;
	}
}