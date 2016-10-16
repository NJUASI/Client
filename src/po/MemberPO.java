package po;

public class MemberPO {
	//	用户编号	
	private String guestID;
	//	会员等级	
	private String memberLevel;	
	//	会员生日
	private String birthday;
	//	会员企业名称
	private String enterprise;
	
	public MemberPO(String guestID, String memberLevel, String birthday, String enterprise) {
		super();
		this.guestID = guestID;
		this.memberLevel = memberLevel;
		this.birthday = birthday;
		this.enterprise = enterprise;
	}
	
	public String getGuestID() {
		return guestID;
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

	
	
}
