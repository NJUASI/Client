package vo;

import java.time.LocalDateTime;

public class CreditVO {
    
	//	用户编号	
	public String guestID;
	
	//	信用值更改时间
	public LocalDateTime time;
	
	//	订单编号
	public String orderID;
	
	//	变化前信用值
	public double previousCredit;
	
	//	变化后信用值
	public double afterCredit;
	
	//	变化原因 即动作
	public String reason;
	
	public CreditVO(String guestID, LocalDateTime time, String orderID, int previousCredit, int afterCredit, String reason) {
		this.guestID = guestID;
		
		this.time = time;
		this.orderID = orderID;
		this.previousCredit = previousCredit;
		this.afterCredit = afterCredit;
		this.reason = reason;
	}

}
