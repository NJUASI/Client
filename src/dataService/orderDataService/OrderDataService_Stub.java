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
		return new OrderPO("123412345678", "thisHotel", "Nanjing, China", 200, "13:34", "13:05", "9:00", "12:00", "12:00", "Unexecuted", RoomType.SINGLEBED, 1, "2011", "Charles", "13000001111", "NULL");

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
		return null;
	}

	@Override
	public ResultMessage undoNormalOrder(String orderID) {
		// TODO Auto-generated method stub
		return null;
	}

}
