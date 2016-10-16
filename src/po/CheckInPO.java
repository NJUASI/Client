package po;

public class CheckInPO {

	//	房间号
	private String roomNumber;
	//	入住时间
	private String checkInTime;	
	//	预计离开时间
	private String expectLeaveTime;
	
	public CheckInPO(String roomNumber, String checkInTime, String expectLeaveTime) {
		super();
		this.roomNumber = roomNumber;
		this.checkInTime = checkInTime;
		this.expectLeaveTime = expectLeaveTime;
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
