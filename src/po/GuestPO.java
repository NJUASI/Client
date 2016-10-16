package po;

public class GuestPO {
	//	姓名
	private String name;	
	//	昵称
	private String nickName;
	//	用户编号
	private String guestID;
	//	密码
	private String password;
	//	联系方式
	private String phone;	
	//	信用值
	private String credit;
	
	public GuestPO(String name, String nickName, String guestID, String password, String phone, String credit) {
		super();
		this.name = name;
		this.nickName = nickName;
		this.guestID = guestID;
		this.password = password;
		this.phone = phone;
		this.credit = credit;
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
