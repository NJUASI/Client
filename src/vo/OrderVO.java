package vo;

import utilities.RoomType;

public class OrderVO {
	// 订单编号
	public String orderID;
	// 客户编号
	public String guestID;
	// 酒店编号
	public String hotelID;
	// 酒店名
	public String hotelName;
	// 酒店地址
	public String hotelAddress;
	//房间原价
	public int prePrice;
	// 预定价格
	public int price;
	// 订单生成时间
	public String createTime;
	// 入住时间
	public String checkInTime;
	// 退房时间
	public String checkOutTime;
	// 最晚订单执行时间
	public String expectExecuteTime;

	// 订单状态
	public String state;
	// 房间类型
	public RoomType roomType;
	// 房间数
	public int roomNum;
	// 房间号
	public String roomNumber;
	// 入住人姓名
	public String name;
	// 联系方式
	public String phone;
	// 特别要求
	public String message;
	// 预计离开时间
	public String expectLeaveTime;
	// 实际离开时间
	public String leaveTime;

	public OrderVO(String orderID, String guestID, String hotelID, String hotelName, String hotelAddress,int prePrice,int price,
			String createTime, String checkInTime, String checkOutTime, String expectExecuteTime, String state,
			RoomType roomType, int roomNum, String roomNumber, String name, String phone, String message,
			String expectLeaveTime, String leaveTime) {
		this.orderID = orderID;
		this.guestID = guestID;
		this.hotelID = hotelID;
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
		this.prePrice=prePrice;
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
}
