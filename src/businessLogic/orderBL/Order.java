package businessLogic.orderBL;

import java.util.List;

import businessLogic.creditBL.Credit;
import businessLogic.hotelBL.Hotel;
import businessLogic.promotionBL.Promotion;
import businessLogic.userBL.User;
import utilities.ResultMessage;
import vo.OrderGeneralVO;
import vo.OrderVO;

public class Order {
	
	
	private Hotel hotel;
	private Promotion promotion;
	private Credit credit;
	private User user;
	
	public Order() {
		hotel = new Hotel();
		promotion = new Promotion();
		credit = new Credit();
		user = new User();
		
	}

	public ResultMessage createOrder(OrderVO orderVO) {
		return null;
	}

	public ResultMessage executeOrder(String orderID) {
		return null;
	}

	public ResultMessage undoAbnormalOrder(String orderID) {
		return null;
	}

	public ResultMessage undoNormalOrder(String orderID) {
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
