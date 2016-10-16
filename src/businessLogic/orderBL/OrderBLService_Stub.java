package businessLogic.orderBL;

import java.util.List;

import businessLogicService.orderBLService.OrderBLService;
import utilities.ResultMessage;
import vo.OrderGeneralVO;
import vo.OrderVO;

public class OrderBLService_Stub implements OrderBLService {

//	订单编号
	 String orderID;
	//	酒店名
	 String hotelName;
	//	酒店地址
	 String hotelAddress;
	//	预定价格
	 int price;
	//	订单生成时间
	 String createTime;
	//	入住时间
	 String checkInTime;	
	//	退房时间
	 String checkOutTime;
	//	最晚订单执行时间
	 String expectExecuteTime;	
	//	预计离开时间
	 String expectLeaveTime;	
	//	订单状态
	 String state;
	//	房间类型
	 String roomType;
	//	房间数
	 int roomNum;
	//	房间号
	String roomNumber;
	//	入住人姓名
	String name;	
	//	联系方式
	String phone;
	//	特别要求
	String message;
	
	
	
	public OrderBLService_Stub(String orderID, String hotelName, String hotelAddress, int price, String createTime,
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
		// TODO Auto-generated method stub
		return new OrderVO(orderID, hotelName, hotelAddress,  price, createTime,checkInTime, checkOutTime, 
				expectExecuteTime, expectLeaveTime,  state,roomType, roomNum, roomNumber,  name, 
				phone, message);
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
