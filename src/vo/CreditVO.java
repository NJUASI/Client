package vo;

public class CreditVO {
    //	用户编号	
	private String guestID;
	//	信用值更改时间
	private String time;
	//	订单编号
	private String orderID;
	//	变化前信用值
	private int preCredit;
	//	变化后信用值
	private int credit;
	//	变化原因 即动作
	private String reason;
	
	public CreditVO(String guestID, String time, String orderID, int preCredit,int credit, String reason) {
		super();
		this.guestID = guestID;
		
		this.time = time;
		this.orderID = orderID;
		this.preCredit = preCredit;
		this.credit = credit;
		this.reason = reason;
	}

	public String getGuestID() {
		return guestID;
	}

	public void setGuestID(String guestID) {
		this.guestID = guestID;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public int getPreCredit() {
		return preCredit;
	}

	public void setPreCredit(int preCredit) {
		this.preCredit = preCredit;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
	
	
	
}
