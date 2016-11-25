package dataService.orderDataService;

import java.rmi.RemoteException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import po.OrderGeneralPO;
import po.OrderPO;
import utilities.OrderState;
import utilities.ResultMessage;
import utilities.RoomType;

public class OrderDataService_Stub implements OrderDataService {

	
	public ResultMessage createOrder(OrderPO order) {
		return ResultMessage.SUCCESS;
	}


	public ResultMessage executeOrder(String orderID) {
		return ResultMessage.SUCCESS;
	}



	public ResultMessage undoAbnormalOrder(String orderID) {
		return ResultMessage.SUCCESS;
	}

	
	public ResultMessage undoNormalOrder(String orderID) {
		return ResultMessage.SUCCESS;
	}
	
	
	public OrderPO getOrderDetail(String orderID) {
		LocalDateTime createTime = LocalDateTime.of(2016, 2, 2, 18, 20);
		LocalDateTime checkInTime = LocalDateTime.of(2016, 2, 3, 11, 23);
		LocalDateTime checkOutTime = LocalDateTime.of(2016, 2, 4, 10, 58);
		LocalDateTime expectExecuteTime = LocalDateTime.of(2016, 2, 3, 14, 00);
		LocalDateTime expectLeaveTime = LocalDateTime.of(2016, 2, 4, 12, 00);

		OrderState orderState = OrderState.EXECUTED;
		RoomType roomType = RoomType.AMBASSADOR;
		
		
		return new OrderPO("123456789012", "1234567890", "12345678", "thisHotel", "address", 200, 200,
				createTime, checkInTime, checkOutTime, expectExecuteTime, expectLeaveTime, orderState, 
				roomType, 2, "301  302", 2, "zhangsan","13554321234", "no");

	}

	
	public List<OrderGeneralPO> getAllGuestOrderGeneral(String GuestID) {
		List<OrderGeneralPO> orderGenerals = new ArrayList<OrderGeneralPO>();
		orderGenerals.add(new OrderGeneralPO("123456789012", "1234567890", "12345678", "thisHotel", "address", 200,
				LocalDateTime.of(2016, 2, 3, 14, 0), LocalDateTime.of(2016, 2, 4, 12, 0) , OrderState.EXECUTED));
		return orderGenerals;
	}

	
	public List<OrderGeneralPO> getAllHotelOrderGeneral(String GuestID) {
		List<OrderGeneralPO> orderGenerals = new ArrayList<OrderGeneralPO>();
		orderGenerals.add(new OrderGeneralPO("123456789012", "1234567890", "12345678", "thisHotel", "address", 200,
				LocalDateTime.of(2016, 2, 3, 14, 0), LocalDateTime.of(2016, 2, 4, 12, 0) , OrderState.EXECUTED));
		return orderGenerals;
	}

	
	public List<OrderGeneralPO> getAllAbnormalOrderGeneral(LocalDate date) {
		List<OrderGeneralPO> orderGenerals = new ArrayList<OrderGeneralPO>();
		orderGenerals.add(new OrderGeneralPO("123456789012", "1234567890", "12345678", "thisHotel", "address", 200,
				LocalDateTime.of(2016, 2, 3, 14, 0), LocalDateTime.of(2016, 2, 4, 12, 0) , OrderState.EXECUTED));
		return orderGenerals;
	}


	public List<OrderGeneralPO> getAllAbnormalOrderGeneral() {
		List<OrderGeneralPO> orderGenerals = new ArrayList<OrderGeneralPO>();
		orderGenerals.add(new OrderGeneralPO("123456789012", "1234567890", "12345678", "thisHotel", "address", 200,
				LocalDateTime.of(2016, 2, 3, 14, 0), LocalDateTime.of(2016, 2, 4, 12, 0) , OrderState.EXECUTED));
		return orderGenerals;
	}


	@Override
	public List<String> getBookedHotels(String guestID) throws RemoteException {
		List<String> bookedHotels = new ArrayList<String>();
		bookedHotels.add("12345678");
		bookedHotels.add("12345679");
		return bookedHotels;
	}

}
