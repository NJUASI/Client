package po;

public class CheckOutPO {

	//	订单编号
	private String orderID;
	//	退房时间
	private String checkOutTime;
	

	public CheckOutPO(String orderID,String checkOutTime) {
		super();
		this.orderID = orderID;
		this.checkOutTime = checkOutTime;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

}
