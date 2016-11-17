package businessLogic.orderBL;

import java.time.LocalDate;
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
	
	
	public ResultMessage createOrder(OrderVO orderVO) {
		return order.createOrder(orderVO);
	}

	public ResultMessage executeOrder(String orderID) {
		return order.executeOrder(orderID);
	}

	public ResultMessage undoAbnormalOrder(String orderID) {
		return order.undoAbnormalOrder(orderID);
	}

	public ResultMessage undoNormalOrder(String orderID) {
		return order.undoNormalOrder(orderID);
	}

	public OrderVO getOrderDetail(String orderID) {
		return order.getOrderDetail(orderID);
	}

	public List<OrderGeneralVO> getAllGuestOrderGeneral(String guestID) {
		return order.getAllGuestOrderGeneral(guestID);
	}

	public List<OrderGeneralVO> getAllHotelOrderGeneral(String hotelID) {
		return order.getAllHotelOrderGeneral(hotelID);
	}

	public List<OrderGeneralVO> getAllAbnormalOrderGeneral(LocalDate date) {
		return order.getAllAbnormalOrderGeneral(date);
	}

	public List<OrderGeneralVO> getAllAbnormalOrderGeneral() {
		return order.getAllAbnormalOrderGeneral();
	}
	
	public List<String> getBookedHotels(String guestID) {
		return order.getBookedHotels(guestID);
	}

}
