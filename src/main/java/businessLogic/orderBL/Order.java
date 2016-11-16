package businessLogic.orderBL;

import java.time.LocalDate;
import java.util.List;

import businessLogic.promotionBL.Promotion;
import utilities.ResultMessage;
import vo.OrderGeneralVO;
import vo.OrderVO;

public class Order {
	
	private Promotion promotion;
	
	public Order() {
		promotion = new Promotion();
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

	public List<OrderGeneralVO> getAllAbnormalOrderGeneral (LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<OrderGeneralVO> getAllAbnormalOrderGeneral () {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<String> getBookedHotels(String guestID) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
