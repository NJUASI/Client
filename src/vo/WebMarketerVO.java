package vo;

public class WebMarketerVO extends UserVO {
	//	用户编号
	public String webMarketerID;
	//	密码
	public String password;
	
	public WebMarketerVO(String webMarketerID, String password) {
		super(webMarketerID,password);
		this.webMarketerID = webMarketerID;
		this.password = password;
	}
}
