package vo;

import utilities.RoomType;

public class OrderVO {
	// 订单编号
	private String orderID;
	// 客户编号
	private String guestID;
	// 酒店编号
	private String hotelID;
	// 酒店名
	private String hotelName;
	// 酒店地址
	private String hotelAddress;
	// 预定价格
	private int price;
	// 订单生成时间
	private String createTime;
	// 入住时间
	private String checkInTime;
	// 退房时间
	private String checkOutTime;
	// 最晚订单执行时间
	private String expectExecuteTime;

	// 订单状态
	private String state;
	// 房间类型
	private RoomType roomType;
	// 房间数
	private int roomNum;
	// 房间号
	private String roomNumber;
	// 入住人姓名
	private String name;
	// 联系方式
	private String phone;
	// 特别要求
	private String message;
	// 预计离开时间
	private String expectLeaveTime;
	// 实际离开时间
	private String leaveTime;

	public OrderVO(String orderID, String guestID, String hotelID, String hotelName, String hotelAddress, int price,
			String createTime, String checkInTime, String checkOutTime, String expectExecuteTime, String state,
			RoomType roomType, int roomNum, String roomNumber, String name, String phone, String message,
			String expectLeaveTime, String leaveTime) {
		super();
		this.orderID = orderID;
		this.guestID = guestID;
		this.hotelID = hotelID;
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
		this.price = price;
		this.createTime = createTime;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
		this.expectExecuteTime = expectExecuteTime;
		this.state = state;
		this.roomType = roomType;
		this.roomNum = roomNum;
		this.roomNumber = roomNumber;
		this.name = name;
		this.phone = phone;
		this.message = message;
		this.expectLeaveTime = expectLeaveTime;
		this.leaveTime = leaveTime;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getGuestID() {
		return guestID;
	}

	public void setGuestID(String guestID) {
		this.guestID = guestID;
	}

	public String getHotelID() {
		return hotelID;
	}

	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}

	public String getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	public String getExpectExecuteTime() {
		return expectExecuteTime;
	}

	public void setExpectExecuteTime(String expectExecuteTime) {
		this.expectExecuteTime = expectExecuteTime;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
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

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getExpectLeaveTime() {
		return expectLeaveTime;
	}

	public void setExpectLeaveTime(String expectLeaveTime) {
		this.expectLeaveTime = expectLeaveTime;
	}

	public String getLeaveTime() {
		return leaveTime;
	}

	public void setLeaveTime(String leaveTime) {
		this.leaveTime = leaveTime;
	}

}
