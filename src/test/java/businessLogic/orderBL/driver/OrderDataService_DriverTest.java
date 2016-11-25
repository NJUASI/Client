package businessLogic.orderBL.driver;

import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.Test;

import dataService.orderDataService.OrderDataService_Stub;
import po.OrderGeneralPO;
import po.OrderPO;
import utilities.OrderState;
import utilities.ResultMessage;
import utilities.RoomType;

public class OrderDataService_DriverTest {

	@Test
	public void test1() {
		//test interface createOrder
		OrderDataService_Stub stub = new OrderDataService_Stub();
		OrderDataService_Driver driver = new OrderDataService_Driver(stub);
		
		LocalDateTime createTime = LocalDateTime.of(2016, 2, 2, 18, 20);
		LocalDateTime checkInTime = LocalDateTime.of(2016, 2, 3, 11, 23);
		LocalDateTime checkOutTime = LocalDateTime.of(2016, 2, 4, 10, 58);
		LocalDateTime expectExecuteTime = LocalDateTime.of(2016, 2, 3, 14, 00);
		LocalDateTime expectLeaveTime = LocalDateTime.of(2016, 2, 4, 12, 00);

		OrderState orderState = OrderState.EXECUTED;
		RoomType roomType = RoomType.AMBASSADOR;
		
		
		OrderPO orderPO = new OrderPO("123456789012", "1234567890", "12345678", "thisHotel", "address", 200, 200,
				createTime, checkInTime, checkOutTime, expectExecuteTime, expectLeaveTime, orderState, 
				roomType, 2, "301", 2, "zhangsan","13554321234", "no");
		
		try {
			assertEquals(ResultMessage.SUCCESS, driver.orderDataService.createOrder(orderPO));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test2() {
		//test interface executeOrder
		OrderDataService_Stub stub = new OrderDataService_Stub();
		OrderDataService_Driver driver = new OrderDataService_Driver(stub);
		
		try {
			assertEquals(ResultMessage.SUCCESS, driver.orderDataService.executeOrder("123456789012"));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test3() {
		//test interface undoAbnormalOrder
		OrderDataService_Stub stub = new OrderDataService_Stub();
		OrderDataService_Driver driver = new OrderDataService_Driver(stub);
		
		try {
			assertEquals(ResultMessage.SUCCESS, driver.orderDataService.undoAbnormalOrder("123456789012"));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test4() {
		//test interface undoNormalOrder
		OrderDataService_Stub stub = new OrderDataService_Stub();
		OrderDataService_Driver driver = new OrderDataService_Driver(stub);
		
		try {
			assertEquals(ResultMessage.SUCCESS, driver.orderDataService.undoNormalOrder("123456789012"));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test5() {
		//test interface getOrderDetails
		OrderDataService_Stub stub = new OrderDataService_Stub();
		OrderDataService_Driver driver = new OrderDataService_Driver(stub);
		OrderPO orderPO;
		try {
			orderPO = driver.orderDataService.getOrderDetail("123456789012");
			LocalDateTime createTime = LocalDateTime.of(2016, 2, 2, 18, 20);
			LocalDateTime checkInTime = LocalDateTime.of(2016, 2, 3, 11, 23);
			LocalDateTime checkOutTime = LocalDateTime.of(2016, 2, 4, 10, 58);
			LocalDateTime expectExecuteTime = LocalDateTime.of(2016, 2, 3, 14, 00);
			LocalDateTime expectLeaveTime = LocalDateTime.of(2016, 2, 4, 12, 00);
		
			assertEquals("123456789012", orderPO.getOrderID());
			assertEquals("thisHotel", orderPO.getHotelName());
			assertEquals("address", orderPO.getHotelAddress());
			assertEquals(200, orderPO.getPreviousPrice(), 0);
			assertEquals(200, orderPO.getPrice(), 0);
			assertEquals(createTime, orderPO.getCreateTime());
			assertEquals(checkInTime, orderPO.getCheckInTime());
			assertEquals(checkOutTime, orderPO.getCheckOutTime());
			assertEquals(expectExecuteTime, orderPO.getExpectExecuteTime());
			assertEquals(expectLeaveTime, orderPO.getExpectLeaveTime());
			assertEquals(OrderState.EXECUTED, orderPO.getState());
			assertEquals(RoomType.AMBASSADOR, orderPO.getRoomType());
			assertEquals(2, orderPO.getRoomNumCount());
			assertEquals("301  302", orderPO.getRoomNumber());
			assertEquals("zhangsan", orderPO.getName());
			assertEquals("13554321234", orderPO.getPhone());
			assertEquals("no", orderPO.getMessage());
		} catch (RemoteException e) {
			e.printStackTrace();
		}	
	}
	
	@Test
	public void test6() {
		//test interface getAllGuestOrderGeneral
		OrderDataService_Stub stub = new OrderDataService_Stub();
		OrderDataService_Driver driver = new OrderDataService_Driver(stub);
		
		List<OrderGeneralPO> orderGeneralPOs;
		try {
			orderGeneralPOs = driver.orderDataService.getAllGuestOrderGeneral("1234567890");
			OrderGeneralPO orderGeneralPO = orderGeneralPOs.get(0);	
			
			assertEquals("123456789012", orderGeneralPO.getOrderID());
			assertEquals("1234567890", orderGeneralPO.getGuestID());
			assertEquals("12345678", orderGeneralPO.getHotelID());
			assertEquals("thisHotel", orderGeneralPO.getHotelName());
			assertEquals("address", orderGeneralPO.getHotelAddress());
			assertEquals(200, orderGeneralPO.getPrice(), 0);
			assertEquals(LocalDateTime.of(2016, 2, 3, 14, 0), orderGeneralPO.getExpectExecuteTime());
			assertEquals(LocalDateTime.of(2016, 2, 4, 12, 0), orderGeneralPO.getExpectLeaveTime());
			assertEquals(OrderState.EXECUTED, orderGeneralPO.getState());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test7() {
		//test interface getAllHotelOrderGeneral
		OrderDataService_Stub stub = new OrderDataService_Stub();
		OrderDataService_Driver driver = new OrderDataService_Driver(stub);
		
		List<OrderGeneralPO> orderGeneralPOs;
		try {
			orderGeneralPOs = driver.orderDataService.getAllHotelOrderGeneral("12345678");
			OrderGeneralPO orderGeneralPO = orderGeneralPOs.get(0);	
			
			assertEquals("123456789012", orderGeneralPO.getOrderID());
			assertEquals("1234567890", orderGeneralPO.getGuestID());
			assertEquals("12345678", orderGeneralPO.getHotelID());
			assertEquals("thisHotel", orderGeneralPO.getHotelName());
			assertEquals("address", orderGeneralPO.getHotelAddress());
			assertEquals(200, orderGeneralPO.getPrice(), 0);
			assertEquals(LocalDateTime.of(2016, 2, 3, 14, 0), orderGeneralPO.getExpectExecuteTime());
			assertEquals(LocalDateTime.of(2016, 2, 4, 12, 0), orderGeneralPO.getExpectLeaveTime());
			assertEquals(OrderState.EXECUTED, orderGeneralPO.getState());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test8() {
		//test interface getAllAbnormalOrderGeneral(LocalDate date)
		OrderDataService_Stub stub = new OrderDataService_Stub();
		OrderDataService_Driver driver = new OrderDataService_Driver(stub);
		
		List<OrderGeneralPO> orderGeneralPOs;
		try {
			orderGeneralPOs = driver.orderDataService.getAllAbnormalOrderGeneral(LocalDate.of(2016, 2, 3));
			OrderGeneralPO orderGeneralPO = orderGeneralPOs.get(0);	
			
			assertEquals("123456789012", orderGeneralPO.getOrderID());
			assertEquals("1234567890", orderGeneralPO.getGuestID());
			assertEquals("12345678", orderGeneralPO.getHotelID());
			assertEquals("thisHotel", orderGeneralPO.getHotelName());
			assertEquals("address", orderGeneralPO.getHotelAddress());
			assertEquals(200, orderGeneralPO.getPrice(), 0);
			assertEquals(LocalDateTime.of(2016, 2, 3, 14, 0), orderGeneralPO.getExpectExecuteTime());
			assertEquals(LocalDateTime.of(2016, 2, 4, 12, 0), orderGeneralPO.getExpectLeaveTime());
			assertEquals(OrderState.EXECUTED, orderGeneralPO.getState());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test9() {
		//test interface getAllAbnormalOrderGeneral()
		OrderDataService_Stub stub = new OrderDataService_Stub();
		OrderDataService_Driver driver = new OrderDataService_Driver(stub);
		
		List<OrderGeneralPO> orderGeneralPOs;
		try {
			orderGeneralPOs = driver.orderDataService.getAllAbnormalOrderGeneral();
			OrderGeneralPO orderGeneralPO = orderGeneralPOs.get(0);	
			
			assertEquals("123456789012", orderGeneralPO.getOrderID());
			assertEquals("1234567890", orderGeneralPO.getGuestID());
			assertEquals("12345678", orderGeneralPO.getHotelID());
			assertEquals("thisHotel", orderGeneralPO.getHotelName());
			assertEquals("address", orderGeneralPO.getHotelAddress());
			assertEquals(200, orderGeneralPO.getPrice(), 0);
			assertEquals(LocalDateTime.of(2016, 2, 3, 14, 0), orderGeneralPO.getExpectExecuteTime());
			assertEquals(LocalDateTime.of(2016, 2, 4, 12, 0), orderGeneralPO.getExpectLeaveTime());
			assertEquals(OrderState.EXECUTED, orderGeneralPO.getState());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test10() {
		//test interface getBookedHotels
		OrderDataService_Stub stub = new OrderDataService_Stub();
		OrderDataService_Driver driver = new OrderDataService_Driver(stub);
		
		List<String> bookedHotels;
		try {
			bookedHotels = driver.orderDataService.getBookedHotels("1234567890");
			
			assertEquals("12345678", bookedHotels.get(0));
			assertEquals("12345679", bookedHotels.get(1));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}
}
