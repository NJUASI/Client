package vo;

public class MemberVO {
	//	用户编号	
	private String guestID;
	//	会员生日
	private String birthday;
	//	会员企业名称
	private String enterprise;
	
	public MemberVO(String guestID, String birthday, String enterprise) {
		super();
		this.guestID = guestID;
		this.birthday = birthday;
		this.enterprise = enterprise;
	}
	
	public String getGuestID() {
		return guestID;
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

	
	
}
