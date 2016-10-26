package po;

public class GuestPO {
	//	用户编号	
	private String guestID;
	//	会员生日
	private String birthday;
	//	会员企业名称
	private String enterprise;
	//	姓名
	private String name;	
	//	昵称
	private String nickName;
	//	密码
	private String password;
	//	联系方式
	private String phone;	
	//	信用值
	private String credit;
	
	public GuestPO(String guestID, String birthday, String enterprise, String name, String nickName,
			String password, String phone, String credit) {
		super();
		this.guestID = guestID;
		this.birthday = birthday;
		this.enterprise = enterprise;
		this.name = name;
		this.nickName = nickName;
		this.password = password;
		this.phone = phone;
		this.credit = credit;
	}
	
	
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}

	public void setGuestID(String guestID) {
		this.guestID = guestID;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getGuestID() {
		return guestID;
	}
//	public void setGuestID(String guestID) {
//		this.guestID = guestID;
//	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
}
