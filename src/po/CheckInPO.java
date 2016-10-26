package po;

public class CheckInPO {

	//	订单编号
	private String orderID;
	//	房间号
	private String roomNumber;
	//	入住时间
	private String checkInTime;	
	//	预计离开时间
	private String expectLeaveTime;
	
	public CheckInPO(String orderID, String roomNumber, String checkInTime, String expectLeaveTime) {
		super();
		this.orderID = orderID;
		this.roomNumber = roomNumber;
		this.checkInTime = checkInTime;
		this.expectLeaveTime = expectLeaveTime;
	}
	
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}
	public String getExpectLeaveTime() {
		return expectLeaveTime;
	}
	public void setExpectLeaveTime(String expectLeaveTime) {
		this.expectLeaveTime = expectLeaveTime;
	}
	
	
}
