package businessLogic.orderBL;

import java.util.ArrayList;
import java.util.List;

import businessLogic.creditBL.Credit;
import businessLogic.creditBL.MockCredit;
import businessLogic.hotelBL.Hotel;
import businessLogic.hotelBL.MockHotel;
import businessLogic.promotionBL.MockPromotion;
import businessLogic.promotionBL.Promotion;
import businessLogic.userBL.MockUser;
import businessLogic.userBL.User;
import utilities.ResultMessage;
import utilities.RoomType;
import vo.OrderGeneralVO;
import vo.OrderVO;

public class MockOrder extends Order{

	
	private Hotel hotel;
	private Promotion promotion;
	private Credit credit;
	private User user;
	
	public MockOrder() {
		hotel = new MockHotel();
		promotion = new MockPromotion();
		credit = new MockCredit();
		user = new MockUser();
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
		OrderVO orderVO= new OrderVO("123456789012", "1234567890", "12345678", "thisHotel", "address", 200,
				"2016/2/2/18:30:20", "2016/2/3", "2016/2/4", "2016/2/3", "executed",
				RoomType.AMBASSADOR, 2, "301", "zhangsan","13554321234", "not",
				"2016/2/4", "2016/2/4");
		return orderVO;

	}

	@Override
	public List<OrderGeneralVO> getAllGuestOrderGeneral(String guestID) {
		List<OrderGeneralVO> orderGenerals = new ArrayList<OrderGeneralVO>();
		orderGenerals.add(new OrderGeneralVO("123456789012", "1234567890", "12345678", "thisHotel", "address", 200,
				"2016/2/3", "2016/2/4" ,"executed"));
		return orderGenerals;
	}

	@Override
	public List<OrderGeneralVO> getAllHotelOrderGeneral(String hotelID) {
		List<OrderGeneralVO> orderGenerals = new ArrayList<OrderGeneralVO>();
		orderGenerals.add(new OrderGeneralVO("123456789012", "1234567890", "12345678", "thisHotel", "address", 200,
				"2016/2/3", "2016/2/4" ,"executed"));
		return orderGenerals;
	}

	@Override
	public List<String> getBookedHotels(String guestID) {
		List<String> bookedHotels = new ArrayList<String>();
		bookedHotels.add("thisHotel");
		bookedHotels.add("thatHotel");
		return bookedHotels;
	}
}
