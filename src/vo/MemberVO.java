package vo;

public class MemberVO {
	//	用户编号	
	public String guestID;
	//	会员生日
	public String birthday;
	//	会员企业名称
	public String enterprise;
	
	public MemberVO(String guestID, String birthday, String enterprise) {
		this.guestID = guestID;
		this.birthday = birthday;
		this.enterprise = enterprise;
	}
}
