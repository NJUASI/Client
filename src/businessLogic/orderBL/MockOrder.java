package businessLogic.orderBL;

import java.util.ArrayList;
import java.util.List;

import dataService.orderDataService.OrderDataService_Stub;
import po.OrderPO;
import utilities.ResultMessage;
import utilities.RoomType;
import vo.OrderGeneralVO;
import vo.OrderVO;

public class MockOrder extends Order{

	public MockOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public ResultMessage createOrder(OrderVO orderVO) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage executeOrder(String orderID) {
		return new OrderDataService_Stub().executeOrder("123420161001");
	}

	@Override
	public ResultMessage undoAbnormalOrder(String orderID) {
		return new OrderDataService_Stub().undoAbnormalOrder("123420161001");
	}

	@Override
	public ResultMessage undoNormalOrder(String orderID) {
		return new OrderDataService_Stub().undoNormalOrder("123420161001");
	}

	@Override
	public OrderVO getOrderDetail(String orderID) {
		// TODO Auto-generated method stub
		OrderPO resultPO = new OrderDataService_Stub().getOrderDetail("123420161001");
		return new OrderVO(resultPO.getOrderID(), resultPO.getGuestID(), resultPO.getHotelID(), 
				resultPO.getHotelName(), resultPO.getHotelAddress(), resultPO.getPrice(), 
				resultPO.getCreateTime(), resultPO.getCheckInTime(), resultPO.getCheckOutTime(), 
				resultPO.getExpectExecuteTime(), resultPO.getState(), resultPO.getRoomType(), 
				resultPO.getRoomNum(), resultPO.getRoomNumber(), resultPO.getName(), resultPO.getPhone(), 
				resultPO.getMessage(), resultPO.getExpectLeaveTime(), resultPO.getLeaveTime());

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
