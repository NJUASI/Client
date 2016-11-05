package vo;

public class CheckInVO {

	//	订单编号
	public String orderID;
	//	房间号
	public String roomNumber;
	//	入住时间
	public String checkInTime;	
	//	预计离开时间
	public String expectLeaveTime;
	
	public CheckInVO(String orderID, String roomNumber, String checkInTime, String expectLeaveTime) {
		this.orderID = orderID;
		this.roomNumber = roomNumber;
		this.checkInTime = checkInTime;
		this.expectLeaveTime = expectLeaveTime;
	}
}
