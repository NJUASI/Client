package businessLogic.orderBL;

import java.util.ArrayList;
import java.util.List;

import utilities.ResultMessage;
import utilities.RoomType;
import vo.OrderGeneralVO;
import vo.OrderVO;

public class MockOrder extends Order{

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
		OrderVO orderVO= new OrderVO("123456789012", "1234567890", "12345678", "thisHotel", "address", 200,
				"2016/2/2/18:30:20", "2016/2/3", "2016/2/4", "2016/2/3", "executed",
				RoomType.AMBASSADOR, 2, "301", "zhangsan","13554321234", "not",
				"2016/2/4", "2016/2/4");
		return orderVO;

	}

	@Override
	public List<OrderGeneralVO> getAllGuestOrderGeneral(String guestID) {
		// TODO Auto-generated method stub
		List<OrderGeneralVO> orderGenerals = new ArrayList<OrderGeneralVO>();
		orderGenerals.add(new OrderGeneralVO("123456789012", "1234567890", "12345678", "thisHotel", "address", 200,
				"2016/2/3", "2016/2/4" ,"executed"));
		return orderGenerals;
	}

	@Override
	public List<OrderGeneralVO> getAllHotelOrderGeneral(String hotelID) {
		// TODO Auto-generated method stub
		List<OrderGeneralVO> orderGenerals = new ArrayList<OrderGeneralVO>();
		orderGenerals.add(new OrderGeneralVO("123456789012", "1234567890", "12345678", "thisHotel", "address", 200,
				"2016/2/3", "2016/2/4" ,"executed"));
		return orderGenerals;
	}

	@Override
	public List<String> getBookedHotel(String guestID) {
		// TODO Auto-generated method stub
		List<String> bookedHotels = new ArrayList<String>();
		bookedHotels.add("thisHotel");
		bookedHotels.add("thatHotel");
		return bookedHotels;
	}
}
