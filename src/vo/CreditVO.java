package vo;

public class CreditVO {
    //	用户编号	
	public String guestID;
	//	信用值更改时间
	public String time;
	//	订单编号
	public String orderID;
	//	变化前信用值
	public int preCredit;
	//	变化后信用值
	public int credit;
	//	变化原因 即动作
	public String reason;
	
	public CreditVO(String guestID, String time, String orderID, int preCredit,int credit, String reason) {
		this.guestID = guestID;
		
		this.time = time;
		this.orderID = orderID;
		this.preCredit = preCredit;
		this.credit = credit;
		this.reason = reason;
	}

}
