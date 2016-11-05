package businessLogic.orderBL.stub;

import java.util.List;

import businessLogic.hotelBL.Hotel;
import businessLogic.promotionBL.Promotion;
import businessLogic.userBL.User;
import businessLogicService.orderBLService.OrderBLService;
import utilities.ResultMessage;
import utilities.RoomType;
import vo.OrderGeneralVO;
import vo.OrderVO;

public class OrderBLService_Stub implements OrderBLService {

//	// 订单编号
//		 String orderID;
//		// 客户编号
//		 String guestID;
//		// 酒店编号
//		 String hotelID;
//		// 酒店名
//		 String hotelName;
//		// 酒店地址
//		 String hotelAddress;
//		// 预定价格
//		 int price;
//		// 订单生成时间
//		 String createTime;
//		// 入住时间
//		 String checkInTime;
//		// 退房时间
//		 String checkOutTime;
//		// 最晚订单执行时间
//		 String expectExecuteTime;
//
//		// 订单状态
//		 String state;
//		// 房间类型
//		 RoomType roomType;
//		// 房间数
//		 int roomNum;
//		// 房间号
//		 String roomNumber;
//		// 入住人姓名
//		 String name;
//		// 联系方式
//		 String phone;
//		// 特别要求
//		 String message;
//		// 预计离开时间
//		 String expectLeaveTime;
//		// 实际离开时间
//		 String leaveTime;
//
//	public OrderBLService_Stub(String orderID, String guestID, String hotelID, String hotelName, String hotelAddress, int price,
//			String createTime, String checkInTime, String checkOutTime, String expectExecuteTime, String state,
//			RoomType roomType, int roomNum, String roomNumber, String name, String phone, String message,
//			String expectLeaveTime, String leaveTime) {
//		super();
//		this.orderID = orderID;
//		this.hotelName = hotelName;
//		this.hotelAddress = hotelAddress;
//		this.price = price;
//		this.createTime = createTime;
//		this.checkInTime = checkInTime;
//		this.checkOutTime = checkOutTime;
//		this.expectExecuteTime = expectExecuteTime;
//		this.expectLeaveTime = expectLeaveTime;
//		this.state = state;
//		this.roomType = roomType;
//		this.roomNum = roomNum;
//		this.roomNumber = roomNumber;
//		this.name = name;
//		this.phone = phone;
//		this.message = message;this.orderID = orderID;
//		this.guestID = guestID;
//		this.hotelID = hotelID;
//		this.hotelName = hotelName;
//		this.hotelAddress = hotelAddress;
//		this.price = price;
//		this.createTime = createTime;
//		this.checkInTime = checkInTime;
//		this.checkOutTime = checkOutTime;
//		this.expectExecuteTime = expectExecuteTime;
//		this.state = state;
//		this.roomType = roomType;
//		this.roomNum = roomNum;
//		this.roomNumber = roomNumber;
//		this.name = name;
//		this.phone = phone;
//		this.message = message;
//		this.expectLeaveTime = expectLeaveTime;
//		this.leaveTime = leaveTime;
//	}

	private Hotel hotel;
	private Promotion promotion;
	private Credit creidt;
	private User user;
	
	
	public OrderBLService_Stub() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public ResultMessage createOrder(OrderVO orderVO) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage executeOrder(String orderID) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage undoAbnormalOrder(String orderID) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage undoNormalOrder(String orderID) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public OrderVO getOrderDetail(String orderID) {
		return new OrderVO("123456789012", "1234567890", "12345678", "thisHotel", "address", 200,
				"2016/2/2/18:30:20", "2016/2/3", "2016/2/4", "2016/2/3", "executed",
				RoomType.AMBASSADOR, 2, "301", "zhangsan","13554321234", "not",
				"2016/2/4", "2016/2/4");
	}

	@Override
	public List<OrderGeneralVO> getAllGuestOrderGeneral(String guestID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderGeneralVO> getAllHotelOrderGeneral(String hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getBookedHotel(String guestID) {
		// TODO Auto-generated method stub
		return null;
	}

}
