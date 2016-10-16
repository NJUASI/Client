package po;

public class GuestPO {
	//	����
	private String name;	
	//	�ǳ�
	private String nickName;
	//	�û����
	private String guestID;
	//	����
	private String password;
	//	��ϵ��ʽ
	private String phone;	
	//	����ֵ
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
