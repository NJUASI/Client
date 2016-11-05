package vo;

public class CheckOutVO {

	//	订单编号
	public String orderID;
	//	退房时间
	public String checkOutTime;
	

	public CheckOutVO(String orderID,String checkOutTime) {
		this.orderID = orderID;
		this.checkOutTime = checkOutTime;
	}
}
