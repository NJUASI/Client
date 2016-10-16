package po;

public class CreditPO {
    //	用户编号	
	private String guestID;
	//	会员等级	
	private String memberLevel;	
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
	//	信用值更改时间
	private String time;
	//	订单编号
	private String orderID;
	//	变化前信用值
	private int preCredit;
	//	变化后信用值
	private String credit;
	//	变化原因 即动作
	private String reason;
	
	public CreditPO(String guestID, String memberLevel, String birthday, String enterprise, String name, String nickName,
			String password, String phone,  String credit, String time, String orderID, int preCredit, String reason) {
		super();
		this.guestID = guestID;
		this.memberLevel = memberLevel;
		this.birthday = birthday;
		this.enterprise = enterprise;
		this.name = name;
		this.nickName = nickName;
		this.password = password;
		this.phone = phone;
		this.credit = credit;
		this.time = time;
		this.orderID = orderID;
		this.preCredit = preCredit;
		this.reason = reason;
	}
	
	
	public String getGuestID() {
		return guestID;
	}


	public void setGuestID(String guestID) {
		this.guestID = guestID;
	}


	public String getMemberLevel() {
		return memberLevel;
	}


	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
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


	public void setTime(String time) {
		this.time = time;
	}


	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}


	public void setPreCredit(int preCredit) {
		this.preCredit = preCredit;
	}


	public String getTime() {
		return time;
	}
	public String getOrderID() {
		return orderID;
	}
		public int getPreCredit() {
		return preCredit;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
}
