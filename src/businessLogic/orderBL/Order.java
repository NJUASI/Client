package businessLogic.orderBL;

import java.util.List;

import businessLogicService.orderBLService.OrderBLService;
import utilities.ResultMessage;
import utilities.RoomType;
import vo.OrderGeneralVO;
import vo.OrderVO;

public class Order {
	
	public Order() {
		super();
	}

	public ResultMessage createOrder(OrderVO orderVO) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage executeOrder(String orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage undoAbnormalOrder(String orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage undoNormalOrder(String orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	public OrderVO getOrderDetail(String orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<OrderGeneralVO> getAllGuestOrderGeneral(String guestID) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<OrderGeneralVO> getAllHotelOrderGeneral(String hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> getBookedHotel(String guestID) {
		// TODO Auto-generated method stub
		return null;
	}

}
