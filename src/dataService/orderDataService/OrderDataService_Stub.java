package dataService.orderDataService;

import java.util.List;

import po.OrderGeneralPO;
import po.OrderPO;
import utilities.ResultMessage;

public class OrderDataService_Stub implements OrderDataService {

	@Override
	public ResultMessage createOrder(OrderPO order) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	@Override
	public OrderPO getOrderDetail(String orderID) {
		// TODO Auto-generated method stub
		return new OrderPO(orderID, orderID, orderID, 0, orderID, orderID, orderID, orderID, 0, orderID, orderID, orderID);
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
