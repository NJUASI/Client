package vo;

public class GuestVO extends UserVO{
	//	用户编号	
	public String guestID;
	//	会员生日
	public String birthday;
	//	会员企业名称
	public String enterprise;
	//	姓名
	public String name;	
	//	昵称
	public String nickName;
	//	密码
	public String password;
	//	联系方式
	public String phone;	
	//	信用值
	public String credit;
	
	public GuestVO(String guestID, String birthday, String enterprise, String name, String nickName,
			String password, String phone, String credit) {
		super(guestID,password);
		this.guestID = guestID;
		this.birthday = birthday;
		this.enterprise = enterprise;
		this.name = name;
		this.nickName = nickName;
		this.password = password;
		this.phone = phone;
		this.credit = credit;
	}
}