package dataService.orderDataService;

import java.util.List;

import po.OrderGeneralPO;
import po.OrderPO;
import utilities.ResultMessage;
import utilities.RoomType;

public class OrderDataService_Stub implements OrderDataService {

	@Override
	public ResultMessage createOrder(OrderPO order) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	@Override
	public OrderPO getOrderDetail(String orderID) {
		// TODO Auto-generated method stub
		return new OrderPO("123456789012", "1234567890", "12345678", "thisHotel", "address", 200,
				"2016/2/2/18:30:20", "2016/2/3", "2016/2/4", "2016/2/3", "executed",
				RoomType.AMBASSADOR, 2, "301", "zhangsan","13554321234", "not",
				"2016/2/4", "2016/2/4");

	}

	@Override
	public List<OrderGeneralPO> getAllGuestOrderGeneral(String GuestID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderGeneralPO> getAllHotelOrderGeneral(String GuestID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage executeOrder(String orderID) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage undoAbnormalOrder(String orderID) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage undoNormalOrder(String orderID) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

}
