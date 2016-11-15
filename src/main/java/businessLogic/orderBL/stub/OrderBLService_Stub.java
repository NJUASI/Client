package businessLogic.orderBL.stub;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import businessLogicService.orderBLService.OrderBLService;
import utilities.OrderState;
import utilities.ResultMessage;
import utilities.RoomType;
import vo.OrderGeneralVO;
import vo.OrderVO;

public class OrderBLService_Stub implements OrderBLService {
	
	
	public OrderBLService_Stub() {
		// TODO Auto-generated constructor stub
	}
	
	public ResultMessage createOrder(OrderVO orderVO) {
		return ResultMessage.SUCCESS;
	}

	
	public ResultMessage executeOrder(String orderID) {
		return ResultMessage.SUCCESS;
	}

	
	public ResultMessage undoAbnormalOrder(String orderID) {
		return ResultMessage.SUCCESS;
	}

	
	public ResultMessage undoNormalOrder(String orderID) {
		return ResultMessage.SUCCESS;
	}

	
	public OrderVO getOrderDetail(String orderID) {
		LocalDateTime createTime = LocalDateTime.of(2016, 2, 2, 18, 30);
		LocalDateTime checkInTime = LocalDateTime.of(2016, 2, 3, 11, 23);
		LocalDateTime checkOutTime = LocalDateTime.of(2016, 2, 4, 10, 58);
		LocalDateTime expectExecuteTime = LocalDateTime.of(2016, 2, 3, 14, 00);
		LocalDateTime expectLeaveTime = LocalDateTime.of(2016, 2, 4, 12, 00);
		
		OrderState orderState = OrderState.EXECUTED;
		RoomType roomType = RoomType.AMBASSADOR;
		
		return new OrderVO("123456789012", "1234567890", "12345678", "thisHotel", "address", 250, 200,
				createTime, checkInTime, checkOutTime, expectExecuteTime, expectLeaveTime, orderState, 
				roomType, 2, "301  302", 2, "zhangsan","13554321234", "no");
	}

	
	public List<OrderGeneralVO> getAllGuestOrderGeneral(String guestID) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<OrderGeneralVO> getAllHotelOrderGeneral(String hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<OrderGeneralVO> getAllAbnormalOrderGeneral(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<OrderGeneralVO> getAllAbnormalOrderGeneral() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<String> getBookedHotels(String guestID) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
//	// 订单编号
//	 String orderID;
//	// 客户编号
//	 String guestID;
//	// 酒店编号
//	 String hotelID;
//	// 酒店名
//	 String hotelName;
//	// 酒店地址
//	 String hotelAddress;
//	// 预定价格
//	 int price;
//	// 订单生成时间
//	 String createTime;
//	// 入住时间
//	 String checkInTime;
//	// 退房时间
//	 String checkOutTime;
//	// 最晚订单执行时间
//	 String expectExecuteTime;
//
//	// 订单状态
//	 String state;
//	// 房间类型
//	 RoomType roomType;
//	// 房间数
//	 int roomNum;
//	// 房间号
//	 String roomNumber;
//	// 入住人姓名
//	 String name;
//	// 联系方式
//	 String phone;
//	// 特别要求
//	 String message;
//	// 预计离开时间
//	 String expectLeaveTime;
//	// 实际离开时间
//	 String leaveTime;
//
//public OrderBLService_Stub(String orderID, String guestID, String hotelID, String hotelName, String hotelAddress, int price,
//		String createTime, String checkInTime, String checkOutTime, String expectExecuteTime, String state,
//		RoomType roomType, int roomNum, String roomNumber, String name, String phone, String message,
//		String expectLeaveTime, String leaveTime) {
//	super();
//	this.orderID = orderID;
//	this.hotelName = hotelName;
//	this.hotelAddress = hotelAddress;
//	this.price = price;
//	this.createTime = createTime;
//	this.checkInTime = checkInTime;
//	this.checkOutTime = checkOutTime;
//	this.expectExecuteTime = expectExecuteTime;
//	this.expectLeaveTime = expectLeaveTime;
//	this.state = state;
//	this.roomType = roomType;
//	this.roomNum = roomNum;
//	this.roomNumber = roomNumber;
//	this.name = name;
//	this.phone = phone;
//	this.message = message;this.orderID = orderID;
//	this.guestID = guestID;
//	this.hotelID = hotelID;
//	this.hotelName = hotelName;
//	this.hotelAddress = hotelAddress;
//	this.price = price;
//	this.createTime = createTime;
//	this.checkInTime = checkInTime;
//	this.checkOutTime = checkOutTime;
//	this.expectExecuteTime = expectExecuteTime;
//	this.state = state;
//	this.roomType = roomType;
//	this.roomNum = roomNum;
//	this.roomNumber = roomNumber;
//	this.name = name;
//	this.phone = phone;
//	this.message = message;
//	this.expectLeaveTime = expectLeaveTime;
//	this.leaveTime = leaveTime;
//}
}
