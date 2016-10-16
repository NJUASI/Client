package po;

public class CreditPO {
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
	
	public CreditPO(String time, String orderID, int preCredit, String credit, String reason) {
		super();
		this.time = time;
		this.orderID = orderID;
		this.preCredit = preCredit;
		this.credit = credit;
		this.reason = reason;
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
