package businessLogic.orderBL;

import java.util.List;

import businessLogicService.orderBLService.OrderBLService;
import utilities.ResultMessage;
import vo.OrderGeneralVO;
import vo.OrderVO;

public class OrderController implements OrderBLService{

	private Order order;
	private static OrderController orderController;
	
	private OrderController() {
		//new the mock object
		order = new MockOrder();
	}
	
	public static OrderController getInstance() {
		if (orderController == null) orderController = new OrderController();
		return orderController;
	}
	
	
	@Override
	public ResultMessage createOrder(OrderVO orderVO) {
		return order.createOrder(orderVO);
	}

	@Override
	public ResultMessage executeOrder(String orderID) {
		return order.executeOrder(orderID);
	}

	@Override
	public ResultMessage undoAbnormalOrder(String orderID) {
		return order.undoAbnormalOrder(orderID);
	}

	@Override
	public ResultMessage undoNormalOrder(String orderID) {
		return order.undoNormalOrder(orderID);
	}

	@Override
	public OrderVO getOrderDetail(String orderID) {
		return order.getOrderDetail(orderID);
	}

	@Override
	public List<OrderGeneralVO> getAllGuestOrderGeneral(String guestID) {
		return order.getAllGuestOrderGeneral(guestID);
	}

	@Override
	public List<OrderGeneralVO> getAllHotelOrderGeneral(String hotelID) {
		return order.getAllHotelOrderGeneral(hotelID);
	}

	@Override
	public List<String> getBookedHotel(String guestID) {
		return order.getBookedHotel(guestID);
	}

}
