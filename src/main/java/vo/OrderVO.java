package vo;

import java.time.LocalDateTime;

import utilities.OrderState;
import utilities.RoomType;

public class OrderVO {
	
	//	订单编号 客户编号 酒店编号 酒店名 酒店地址 最后预定价格 最晚订单执行时间 预计离开时间 订单状态
	public OrderGeneralVO orderGeneralVO;
	
	//	原价
	public double previousPrice;
	
	//	订单生成时间
	public LocalDateTime createTime;
	
	//	入住时间
	public LocalDateTime checkInTime;
	
	//	退房时间（实际离开时间）
	public LocalDateTime checkOutTime;

	//	房间类型
	public RoomType roomType;
	
	//	房间数
	public int roomNumCount;
	
	//	房间号
	public String roomNumber;
	
	//	预计入住人数
	public int expectGuestNumCount;
	
	//	入住人姓名
	public String name;
	
	//	联系方式
	public String phone;
	
	//	特别要求
	public String message;
	

	public OrderVO(String orderID, String guestID, String hotelID, String hotelName, String hotelAddress, 
			double previousPrice, double price, LocalDateTime createTime, LocalDateTime checkInTime,
			LocalDateTime checkOutTime, LocalDateTime expectExecuteTime, LocalDateTime expectLeaveTime, 
			OrderState state, RoomType roomType, int roomNumCount, String roomNumber, 
			int expectGuestNumCount, String name, String phone, String message) {
		super();
		this.orderGeneralVO = new OrderGeneralVO(orderID, guestID, hotelID, hotelName, hotelAddress,
				price, expectExecuteTime, expectLeaveTime, state);
		
		this.previousPrice = previousPrice;
		this.createTime = createTime;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
		this.roomType = roomType;
		this.roomNumCount = roomNumCount;
		this.roomNumber = roomNumber;
		this.expectGuestNumCount = expectGuestNumCount;
		this.name = name;
		this.phone = phone;
		this.message = message;
	}

	public OrderVO(OrderGeneralVO orderGeneralVO, double previousPrice, LocalDateTime createTime, LocalDateTime checkInTime, 
			LocalDateTime checkOutTime, RoomType roomType, int roomNumCount, String roomNumber, String name, 
			String phone, String message) {
		super();
		this.orderGeneralVO = orderGeneralVO;
		
		this.previousPrice = previousPrice;
		this.createTime = createTime;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
		this.roomType = roomType;
		this.roomNumCount = roomNumCount;
		this.roomNumber = roomNumber;
		this.name = name;
		this.phone = phone;
		this.message = message;
	}
	
	
}
