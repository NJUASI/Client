package po;

public class OrderPO {
	//	订单编号
	private String orderID;
	//	酒店名
	private String hotelName;
	//	酒店地址
	private String hotelAddress;
	//	预定价格
	private int price;
	//	订单生成时间
	private String createTime;
	//	入住时间
	private String checkInTime;	
	//	退房时间
	private String checkOutTime;
	//	最晚订单执行时间
	private String expectExecuteTime;	
	//	预计离开时间
	private String expectLeaveTime;	
	//	订单状态
	private String state;
	//	房间类型
	private String roomType;
	//	房间数
	private int roomNum;
	//	房间号
	private String roomNumber;
	//	入住人姓名
	private String name;	
	//	联系方式
	private String phone;
	//	特别要求
	private String message;
	
	public OrderPO(String orderID, String hotelName, String hotelAddress, int price, String createTime,
			String checkInTime, String checkOutTime, String expectExecuteTime, String expectLeaveTime, String state,
			String roomType, int roomNum, String roomNumber, String name, String phone, String message) {
		super();
		this.orderID = orderID;
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
		this.price = price;
		this.createTime = createTime;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
		this.expectExecuteTime = expectExecuteTime;
		this.expectLeaveTime = expectLeaveTime;
		this.state = state;
		this.roomType = roomType;
		this.roomNum = roomNum;
		this.roomNumber = roomNumber;
		this.name = name;
		this.phone = phone;
		this.message = message;
	}
	public OrderPO(String orderID, String hotelName, String hotelAddress,int price, String createTime, String expectExecuteTime,
			String expectLeaveTime, String roomType, int roomNum, String name, String phone, String message) {
		super();
		this.orderID = orderID;
		this.hotelAddress = hotelAddress;
		this.hotelName = hotelName;
		this.price = price;
		this.createTime = createTime;
		this.expectExecuteTime = expectExecuteTime;
		this.expectLeaveTime = expectLeaveTime;
		this.roomType = roomType;
		this.roomNum = roomNum;
		this.name = name;
		this.phone = phone;
		this.message = message;
	}
	public String getOrderID() {
		return orderID;
	}
	public String getHotelName() {
		return hotelName;
	}
	public String getHotelAddress() {
		return hotelAddress;
	}
	public int getPrice() {
		return price;
	}
	public String getCreateTime() {
		return createTime;
	}
	public String getCheckInTime() {
		return checkInTime;
	}
	public String getCheckOutTime() {
		return checkOutTime;
	}
	public String getExpectExecuteTime() {
		return expectExecuteTime;
	}
	public String getExpectLeaveTime() {
		return expectLeaveTime;
	}
	public void setExpectLeaveTime(String expectLeaveTime) {
		this.expectLeaveTime = expectLeaveTime;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getRoomType() {
		return roomType;
	}
	public int getRoomNum() {
		return roomNum;
	}
	
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}

	public String getMessage() {
		return message;
	}

}
